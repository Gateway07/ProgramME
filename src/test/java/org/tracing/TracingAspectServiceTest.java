package org.tracing;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.aspectj.lang.reflect.SourceLocation;
import org.junit.After;
import org.junit.Test;
import org.slf4j.MDC;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.tracing.TracingAspectService.BreakPoint;

public class TracingAspectServiceTest {

	static final class RecursiveNode {
		public RecursiveNode next;
		public int value;
	}

	static final class Dummy {
		public final List<Integer> x;
		public final List<String> y;
		public final Dummy ref;

		public Dummy(List<Integer> x, List<String> y) {
			this.x = x;
			this.y = y;
			this.ref = this;
		}

		void a() {
		}

		int b(int y) {
			return x.stream().mapToInt(Integer::intValue).sum() + y;
		}
	}

	private static final String RUN_ID = "run-1";

	@After
	public void tearDown() {
		MDC.clear();
	}

	@Test
	public void around_shouldAttachThenPointTracingToParentScope_andNotLogThenPointAsTopLevel() throws Throwable {
		TracingAspectService service = new TracingAspectService();
		MDC.put("RUN_MDC_KEY", RUN_ID);

		BreakPoint thenPoint = new BreakPoint(Dummy.class.getName(), 26,
				new String[]{"#this.x", "#y", "#this.ref"}, new String[]{"#return"}, new String[]{"#throw.toString()"}, "true", null, new TracingAspectService.Options(null, Map.of(Dummy.class.getName(), TracingAspectService.Representation.DECLARED_FIELDS), 3));
		BreakPoint rootPoint = new BreakPoint(Dummy.class.getName(), 23,
				new String[]{"#this.x", "#this.y"}, null, null, "true", new BreakPoint[]{thenPoint}, null);
		service.setPoints(RUN_ID, List.of(rootPoint));

		System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(List.of(rootPoint)));

		Dummy d = new Dummy(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11), List.of("1", "2"));
		ProceedingJoinPoint pjpB = mockPjp(Dummy.class.getDeclaredMethod("b", int.class), thenPoint.lineOfCode(), d, new Object[] {3});
		when(pjpB.proceed()).thenAnswer(inv -> d.b(3));
		ProceedingJoinPoint pjpA = mockPjp(Dummy.class.getDeclaredMethod("a"), rootPoint.lineOfCode(), d, new Object[0]);
		when(pjpA.proceed()).thenAnswer(inv -> service.around(pjpB));

		service.around(pjpA);

		List<TracingAspectService.Tracing> logs = service.getTracings(RUN_ID);
		System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(logs));

		assertEquals(1, logs.size());
		TracingAspectService.Tracing rootTracing = logs.get(0);
		assertNotNull(rootTracing.thenTracings());
		assertEquals(1, rootTracing.thenTracings().length);

		// ensure thenPoint is not duplicated at top-level
		assertEquals(1, logs.size());
	}

	@Test
	public void around_shouldNotLogRootScope_whenNoThenPointMatchedOrThenConditionFalse() throws Throwable {
		TracingAspectService service = new TracingAspectService();
		MDC.put("RUN_MDC_KEY", RUN_ID);

		BreakPoint thenPoint = new BreakPoint(Dummy.class.getName(), 26,
				null, null, null, "false", null, null);
		BreakPoint rootPoint = new BreakPoint(Dummy.class.getName(), 23,
				new String[]{"#this.x"}, null, null, "true", new BreakPoint[]{thenPoint}, null);
		service.setPoints(RUN_ID, List.of(rootPoint));

		Dummy d = new Dummy(List.of(1, 2, 3), List.of("1", "2"));
		ProceedingJoinPoint pjpB = mockPjp(Dummy.class.getDeclaredMethod("b", int.class), thenPoint.lineOfCode(), d, new Object[] {2});
		when(pjpB.proceed()).thenAnswer(inv -> d.b(2));
		ProceedingJoinPoint pjpA = mockPjp(Dummy.class.getDeclaredMethod("a"), rootPoint.lineOfCode(), d, new Object[0]);
		when(pjpA.proceed()).thenAnswer(inv -> service.around(pjpB));

		service.around(pjpA);

		List<TracingAspectService.Tracing> logs = service.getTracings(RUN_ID);
		assertTrue(logs.isEmpty());
	}

	@Test
	public void toJson_shouldSerializePrimitivesAsStrings() throws Throwable {
		TracingAspectService service = new TracingAspectService();
		TracingAspectService.Options options = new TracingAspectService.Options(null, null, 3);

		assertEquals("true", invokeToJson(service, true, options));
		assertEquals("1", invokeToJson(service, 1, options));
		assertEquals("x", invokeToJson(service, 'x', options));
	}

	@Test
	public void toJson_shouldLimitCollectionAndIncludeSizeMarker() throws Throwable {
		TracingAspectService service = new TracingAspectService();
		Map<String, Integer> sizeLimits = new HashMap<>();
		sizeLimits.put(java.util.Collection.class.getName(), 2);
		TracingAspectService.Options options = new TracingAspectService.Options(sizeLimits, null, 3);

		ArrayList<Integer> data = new ArrayList<>();
		data.add(1);
		data.add(2);
		data.add(3);
		String json = invokeToJson(service, data, options);
		assertTrue(json.startsWith("{\"#size\":3, \"#values\":[1,2]"));
		assertFalse(json.contains(",3"));
	}

	@Test
	public void toJson_shouldLimitMapAndUseStringValueOfKey() throws Throwable {
		TracingAspectService service = new TracingAspectService();
		Map<String, Integer> sizeLimits = new HashMap<>();
		sizeLimits.put(java.util.Map.class.getName(), 1);
		TracingAspectService.Options options = new TracingAspectService.Options(sizeLimits, null, 3);

		Map<Object, Object> m = new HashMap<>();
		m.put(1, 2);
		m.put("k", "v");
		String json = invokeToJson(service, m, options);
		assertTrue(json.startsWith("{\"#size\":2, \"#values\":{\"1\":2}"));
	}

	@Test
	public void toJson_shouldNotFailOnRecursiveObjectGraph() throws Throwable {
		TracingAspectService service = new TracingAspectService();
		TracingAspectService.Options options = new TracingAspectService.Options(null, null, 5);

		RecursiveNode a = new RecursiveNode();
		a.value = 1;
		a.next = a;
		String json = invokeToJson(service, a, options);
		assertTrue(json.contains("#recursive"));
	}

	@Test
	public void toJson_shouldNotTraverseThread() throws Throwable {
		TracingAspectService service = new TracingAspectService();
		TracingAspectService.Options options = new TracingAspectService.Options(null, null, 5);
		String json = invokeToJson(service, Thread.currentThread(), options);
		assertTrue(json.equals(Thread.currentThread().toString()));
	}

	private String invokeToJson(TracingAspectService service, Object obj, TracingAspectService.Options options) throws Throwable {
		Method m = TracingAspectService.class.getDeclaredMethod("toJson", Object.class, TracingAspectService.Options.class);
		m.setAccessible(true);
		try {
			return (String) m.invoke(service, obj, options);
		} catch (InvocationTargetException e) {
			throw e.getTargetException();
		}
	}

	@Test
	public void around_shouldNotLogRootScope_whenNestedThenChainConditionIsFalse() throws Throwable {
		TracingAspectService service = new TracingAspectService();
		MDC.put("RUN_MDC_KEY", RUN_ID);

		BreakPoint then2Point = new BreakPoint(Dummy.class.getName(), 26,
				null, null, null, "false", null, null);
		BreakPoint then1Point = new BreakPoint(Dummy.class.getName(), 26,
				null, null, null, "true", new BreakPoint[]{then2Point}, null);
		BreakPoint rootPoint = new BreakPoint(Dummy.class.getName(), 23,
				new String[]{"#this.x"}, null, null, "true", new BreakPoint[]{then1Point}, null);
		service.setPoints(RUN_ID, List.of(rootPoint));

		Dummy d = new Dummy(List.of(1, 2, 3), List.of("1", "2"));
		ProceedingJoinPoint pjpThen2 = mockPjp(Dummy.class.getDeclaredMethod("b", int.class), then2Point.lineOfCode(), d, new Object[]{2});
		when(pjpThen2.proceed()).thenAnswer(inv -> d.b(2));
		ProceedingJoinPoint pjpThen1 = mockPjp(Dummy.class.getDeclaredMethod("b", int.class), then1Point.lineOfCode(), d, new Object[]{2});
		when(pjpThen1.proceed()).thenAnswer(inv -> service.around(pjpThen2));
		ProceedingJoinPoint pjpRoot = mockPjp(Dummy.class.getDeclaredMethod("a"), rootPoint.lineOfCode(), d, new Object[0]);
		when(pjpRoot.proceed()).thenAnswer(inv -> service.around(pjpThen1));

		service.around(pjpRoot);

		List<TracingAspectService.Tracing> logs = service.getTracings(RUN_ID);
		assertTrue(logs.isEmpty());
	}

	private ProceedingJoinPoint mockPjp(Method method, int line, Object thisObject, Object[] args) {
		ProceedingJoinPoint pjp = mock(ProceedingJoinPoint.class);
		MethodSignature methodSignature = mock(MethodSignature.class);
		SourceLocation sourceLocation = mock(SourceLocation.class);

		when(pjp.getSignature()).thenReturn(methodSignature);
		when(methodSignature.getMethod()).thenReturn(method);
		when(pjp.getSourceLocation()).thenReturn(sourceLocation);
		when(sourceLocation.getLine()).thenReturn(line);

		when(pjp.getArgs()).thenReturn(args);
		when(pjp.getThis()).thenReturn(thisObject);
		return pjp;
	}
}
