package org.tracing;

import lombok.NonNull;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class TracingRunIdFilter extends OncePerRequestFilter {
	public static final String RUN_ID_HEADER = "X-RUN_MDC_KEY";
	private static final String SEARCH_TEST_PATH_PREFIX = "/admin/search-test/";

	@Override
	protected boolean shouldNotFilter(@NonNull HttpServletRequest request) {
		String uri = request.getRequestURI();
		if (uri == null) {
			return true;
		}
		return !uri.startsWith(SEARCH_TEST_PATH_PREFIX);
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request,	@NonNull HttpServletResponse response,
			@NonNull FilterChain filterChain) throws ServletException, IOException {
		String runId = request.getHeader(RUN_ID_HEADER);
		if (runId != null && !runId.isBlank()) {
			MDC.put(TracingAspectService.RUN_MDC_KEY, runId);
		}

		try {
			filterChain.doFilter(request, response);
		} finally {
			if (runId != null) {
				MDC.remove(TracingAspectService.RUN_MDC_KEY);
			}
		}
	}
}
