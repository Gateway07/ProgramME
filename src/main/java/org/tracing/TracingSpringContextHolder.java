package org.tracing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public final class TracingSpringContextHolder implements ApplicationContextAware {
	private static volatile ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(@NonNull ApplicationContext applicationContext) {
		TracingSpringContextHolder.applicationContext = applicationContext;
	}

	public static ApplicationContext getApplicationContext() {
		ApplicationContext ctx = applicationContext;
		if (ctx == null) {
			throw new IllegalStateException("Spring ApplicationContext is not initialized");
		}
		return ctx;
	}
}
