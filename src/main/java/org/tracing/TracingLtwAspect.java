package org.tracing;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public final class TracingLtwAspect {
	@Around("(execution(* *.*(..))) && " +
			"!execution(* get*()) && " +
			"!execution(* is*()) && " +
			"!execution(* set*(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		TracingAspectService tracingAspectService = TracingSpringContextHolder
				.getApplicationContext()
				.getBean(TracingAspectService.class);
		return tracingAspectService.around(pjp);
	}
}
