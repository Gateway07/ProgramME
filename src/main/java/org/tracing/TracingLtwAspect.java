package org.tracing;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public final class TracingLtwAspect {
	@Around("(execution(* *.*(..))) && " +
			"!within(org.tracing..*) && " +
			"!execution(* get*()) && " +
			"!execution(* is*()) && " +
			"!execution(* set*(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		TracingAspectService tracingAspectService;
		try {
			tracingAspectService = TracingSpringContextHolder
					.getApplicationContext()
					.getBean(TracingAspectService.class);
		} catch (RuntimeException e) {
			return pjp.proceed();
		}
		return tracingAspectService.around(pjp);
	}
}
