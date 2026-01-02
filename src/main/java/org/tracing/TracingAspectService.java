package org.tracing;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.aspectj.lang.reflect.SourceLocation;
import org.slf4j.MDC;
import org.springframework.expression.*;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Component
@RequiredArgsConstructor
public class TracingAspectService {
    public enum Phase {
        CALL, ERROR
    }

    private static final class MutableTracing {
        private final Phase phase;
        private final String point;
        private final int lineOfCode;
        private final long timestampMs;
        private Long durationMs;
        private Map<String, String> watchesBefore;
        private Map<String, String> watchesAfter;
        private Map<String, String> watchesOnError;
        private String stackTrace;
        private String errorMessage;
        private final List<MutableTracing> thenTracings = new ArrayList<>();
        private final boolean thenCondition;

        private MutableTracing(Phase phase, String point, int lineOfCode, boolean thenCondition, long timestampMs) {
            this.phase = phase;
            this.point = point;
            this.lineOfCode = lineOfCode;
            this.timestampMs = timestampMs;
			this.thenCondition = thenCondition;
        }

        private Tracing toImmutable() {
            Tracing[] nested = thenTracings.isEmpty() ? null : thenTracings.stream().map(MutableTracing::toImmutable).toArray(Tracing[]::new);
            return new Tracing(phase, point, lineOfCode, thenCondition, watchesBefore, watchesAfter, watchesOnError,
                    stackTrace, errorMessage, timestampMs, durationMs, nested);
        }
    }

    public record Tracing(Phase phase, String point, int lineOfCode, boolean thenCondition,
                          Map<String, String> watchesBefore, Map<String, String> watchesAfter, Map<String, String> watchesOnError,
                          String stackTrace, String errorMessage,
                          long timestampMs, long durationMs, Tracing[] thenTracings) {
    }

    public record BreakPoint(String className, int lineOfCode,
                             String[] watchExpressionsBefore, String[] watchExpressionsAfter, String[] watchExpressionsOnError,
                             String thenConditionExpression, BreakPoint[] thenPoints, Options options) {
		@NonNull
        public String toString() {
            return String.format("%s#L%s", className, lineOfCode);
        }
    }

	public enum Representation {
		PUBLIC_FIELDS,
		DECLARED_FIELDS,
		DECLARED_FIELDS_WITH_GETTERS;
	}

	public record Options(Map<String, Integer> sizeLimitPerContainerClass, Map<String, Representation> objectRepresentationPerClass, int maxDepthLimit) {
		public Map<String, Integer> sizeLimitPerContainerClass() {
			if (sizeLimitPerContainerClass != null)
				return sizeLimitPerContainerClass;
			// Class is absent as key means limited by 10
			// Class is present and value < 0 means stop traversing
			// Class is present and value => 0 means limited by value
			Map<String, Integer> limits = new HashMap<>();
			limits.put(Collection.class.getName(), 10);
			limits.put(Iterable.class.getName(), 10);
			limits.put(List.class.getName(), 10);
			limits.put(Array.class.getName(), 10);
			limits.put(Map.class.getName(), 10);
			return limits;
		}

		public Map<String, Representation> objectRepresentationPerClass() {
			if (objectRepresentationPerClass != null) {
				return objectRepresentationPerClass;
			}
			return Collections.emptyMap();
		}

		public Map<String, Integer> objectRepresentationModePerClass() {
			Map<String, Representation> representationPerClass = objectRepresentationPerClass();
			if (representationPerClass.isEmpty()) {
				return Collections.emptyMap();
			}
			Map<String, Integer> modePerClass = new HashMap<>(representationPerClass.size());
			for (Map.Entry<String, Representation> entry : representationPerClass.entrySet()) {
				String className = entry.getKey();
				Representation representation = entry.getValue();
				int mode = switch (representation) {
					case PUBLIC_FIELDS -> 0;
					case DECLARED_FIELDS -> 1;
					case DECLARED_FIELDS_WITH_GETTERS -> 2;
				};
				modePerClass.put(className, mode);
			}
			return modePerClass;
		}
	}

    public final static String RUN_MDC_KEY = "RUN_MDC_KEY";
    private final Map<String, List<BreakPoint>> points = new ConcurrentHashMap<>();
    private final Map<String, List<Tracing>> tracings = new ConcurrentHashMap<>();
    private final ThreadLocal<Deque<OpenScope>> openScopes = ThreadLocal.withInitial(ArrayDeque::new);

    private final ExpressionParser parser = new SpelExpressionParser();

    private record OpenScope(BreakPoint breakPoint, MutableTracing tracing, BreakPoint[] thenPoints) {
    }

    private record ThenPointMatch(OpenScope scope, BreakPoint thenPoint) {
    }

    public void setPoints(String runId, List<BreakPoint> patterns) {
        if (patterns != null)
            this.points.put(runId, patterns);
        tracings.remove(runId); // reset old logs
    }

    public List<Tracing> getTracings(String runId) {
        return tracings.getOrDefault(runId, Collections.emptyList());
    }

    public List<BreakPoint> getPoints(String runId) {
        if (runId == null) return null;
        return points.getOrDefault(runId, Collections.emptyList());
    }

    public void appendLog(String runId, Tracing record) {
        tracings.computeIfAbsent(runId, k -> Collections.synchronizedList(new ArrayList<>())).add(record);
    }

    public void clearLogs(String runId) {
        points.remove(runId);
        tracings.remove(runId);
    }

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        String runId = MDC.get(RUN_MDC_KEY);
        List<BreakPoint> patterns = getPoints(runId);
        if (runId == null || patterns == null || patterns.isEmpty()) {
            return pjp.proceed(); // no search
        }

        MethodSignature sig = (MethodSignature) pjp.getSignature();
        Method method = sig.getMethod();

        String className = method.getDeclaringClass().getName();
        Parameter[] parameters = method.getParameters();
        Object[] args = pjp.getArgs();
        SourceLocation loc = pjp.getSourceLocation();
        int line = loc.getLine();

        ThenPointMatch thenPointMatch = findNearestMatchingThenPoint(className, line);
        BreakPoint caughtPoint;
        OpenScope parentScope;
        if (thenPointMatch != null) {
            caughtPoint = thenPointMatch.thenPoint;
            parentScope = thenPointMatch.scope;
        } else {
            List<BreakPoint> matched = catchPoints(patterns, className, line);
            if (matched.isEmpty()) {
                return pjp.proceed();
            }
            caughtPoint = matched.get(0);
            parentScope = null;
        }
        long start = System.currentTimeMillis();

        boolean isThenPointFlow = caughtPoint.thenConditionExpression() == null ||
		        caughtPoint.thenConditionExpression().isBlank() ||
		        getBoolean(caughtPoint.options(), caughtPoint.thenConditionExpression(), pjp.getThis(), parameters, args);
		if (!isThenPointFlow) {
			return pjp.proceed();
		}
        boolean opensScope = caughtPoint.thenPoints() != null && caughtPoint.thenPoints().length > 0;
        MutableTracing currentTracing = new MutableTracing(Phase.CALL, caughtPoint.className, line, true, System.currentTimeMillis());
        if (parentScope != null) {
            parentScope.tracing().thenTracings.add(currentTracing);
        }
        if (opensScope) {
            openScopes.get().push(new OpenScope(caughtPoint, currentTracing, caughtPoint.thenPoints()));
        }
        Map<String, String> before = null;
        try {
            before = getValues(caughtPoint.options(), caughtPoint.watchExpressionsBefore, pjp.getThis(), null, null, parameters, args);
            final Object result = pjp.proceed();
            Map<String, String> after = getValues(caughtPoint.options(), caughtPoint.watchExpressionsAfter, pjp.getThis(), result, null, parameters, args);
            currentTracing.watchesBefore = before;
            currentTracing.watchesAfter = after;
            currentTracing.durationMs = System.currentTimeMillis() - start;
            return result;
        } catch (Throwable ex) {
            currentTracing.watchesBefore = before;
            currentTracing.errorMessage = ex.getMessage();
            currentTracing.stackTrace = getStackTraceString(ex);
            currentTracing.durationMs = System.currentTimeMillis() - start;
            currentTracing.watchesOnError = getValues(caughtPoint.options(), caughtPoint.watchExpressionsOnError, pjp.getThis(), null, ex, parameters, args);
            throw ex;
        } finally {
	        boolean keepTracing = !opensScope || !currentTracing.thenTracings.isEmpty();
	        if (parentScope == null) {
		        if (keepTracing) {
			        appendLog(runId, currentTracing.toImmutable());
		        }
	        } else if (!keepTracing) {
		        parentScope.tracing().thenTracings.removeIf(t -> t == currentTracing);
	        }
	        if (opensScope) {
		        Deque<OpenScope> stack = openScopes.get();
		        if (!stack.isEmpty() && stack.peek().tracing == currentTracing) {
			        stack.pop();
		        } else {
			        stack.removeIf(s -> s.tracing == currentTracing);
		        }
	        }
        }
    }

    private ThenPointMatch findNearestMatchingThenPoint(String className, int loc) {
        Deque<OpenScope> stack = openScopes.get();
        if (stack.isEmpty())
            return null;

        for (OpenScope scope : stack) {
            if (scope.thenPoints == null)
                continue;

            for (BreakPoint thenPoint : scope.thenPoints) {
                if (thenPoint == null)
                    continue;

                if (matchesPoint(thenPoint, className, loc))
                    return new ThenPointMatch(scope, thenPoint);
            }
        }
        return null;
    }

    private boolean matchesPoint(BreakPoint point, String className, int loc) {
        return point != null && Objects.equals(point.className(), className) && Math.abs(point.lineOfCode - loc) <= 1;
    }

    private List<BreakPoint> catchPoints(List<BreakPoint> patterns, String className, int loc) {
        List<BreakPoint> res = new ArrayList<>();
        for (BreakPoint p : patterns) {
            if (!matchesPoint(p, className, loc))
                continue;
            res.add(p);
        }
        return res;
    }

    private boolean getBoolean(Options options, String expression, Object thisObject, Parameter[] parameters, Object[] args) {
		try {
			String res = getValue(options, expression, thisObject, null, null, parameters, args);
			return Boolean.parseBoolean(res);
		} catch (Exception e) {
			return false;
		}
    }

    private Map<String, String> getValues(Options options, String[] expressions, Object thisObject, Object resultObject, Throwable throwObject, Parameter[] parameters, Object[] args) {
        if (expressions == null || expressions.length == 0) {
            return Collections.emptyMap();
        }
        Map<String, String> res = new HashMap<>(expressions.length);
        for (String expression : expressions) {
			try {
				res.put(expression, getValue(options, expression, thisObject, resultObject, throwObject, parameters, args));
			} catch (Exception e) {
				res.put(expression, e.getMessage());
			}
        }
        return res;
    }

    private String getValue(Options options, String expression, Object thisObject, Object resultObject, Throwable throwObject, Parameter[] parameters, Object[] args) {
        Expression exp = parser.parseExpression(expression);

        StandardEvaluationContext ctx = new StandardEvaluationContext();
        ctx.setRootObject(thisObject);
		if (throwObject == null)
            ctx.setVariable("return", resultObject);
		else
            ctx.setVariable("throw", throwObject);
        int idx = 0;
        for (Parameter p : parameters) {
            ctx.setVariable(p.getName(), args[idx]);
            idx++;
        }

        return toJson(exp.getValue(ctx, Object.class), options);
    }

	private String toJson(Object obj, Options options) {
		return RepresentationAdapter.toJson(obj, options);
	}

	private String getStackTraceString(Throwable ex) {
        StringBuilder sb = new StringBuilder();
        sb.append(ex.toString()).append("\n");
        for (StackTraceElement el : ex.getStackTrace()) {
            sb.append("\tat ").append(el.toString()).append("\n");
        }
        return sb.toString();
    }
}
