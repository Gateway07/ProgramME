package org.tracing;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = {TracingAspectController.class, TracingIntegrationTest.DummySearchTestController.class})
@Import({TracingRunIdFilter.class, TracingAspectService.class})
public class TracingIntegrationTest {
	private static final String runId = "run-2025-12-06-002";

	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private ObjectMapper objectMapper;
	@Autowired
	private TracingAspectService tracingAspectService;

	@BeforeEach
	void setUp() {
		MDC.clear();
	}

	@Test
	void scenario_pointsThenCallSearchWithRunIdHeaderThenReadLogs() throws Exception {
		List<TracingAspectService.BreakPoint> breakPoints = List.of(
				new TracingAspectService.BreakPoint(
						"net.osmand.search.SearchUICore",
						678,
						new String[]{"#text"},
						null,
						null,
						"true",
						null,
						new TracingAspectService.Options(
								Map.of(),
								Map.of(),
								3
						)
				)
		);

		mockMvc.perform(
				post("/tracing/{runId}/points", runId)
						.contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsBytes(breakPoints))
		).andExpect(status().isOk());

		mockMvc.perform(
				get("/admin/search-test/search")
						.header(TracingRunIdFilter.RUN_ID_HEADER, runId)
						.param("query", "Some Address")
						.param("lat", "0")
						.param("lon", "0")
		).andExpect(status().isOk());

		byte[] logsResponse = mockMvc.perform(
				get("/tracing/{runId}/logs", runId)
		).andExpect(status().isOk()).andReturn().getResponse().getContentAsByteArray();

		TracingAspectService.Tracing[] logs = objectMapper.readValue(logsResponse, TracingAspectService.Tracing[].class);
		assertTrue(logs.length > 0);
	}

	@Test
	void scenario_searchWithoutRunIdHeaderDoesNotTrace() throws Exception {
		mockMvc.perform(
				get("/admin/search-test/search")
						.param("query", "Some Address")
						.param("lat", "0")
						.param("lon", "0")
		).andExpect(status().isOk());

		assertTrue(tracingAspectService.getTracings(runId).isEmpty());
		assertNull(MDC.get(TracingAspectService.RUN_MDC_KEY));
	}

	@RestController
	@RequestMapping(path = "/admin/search-test")
	public static final class DummySearchTestController {
		private final TracingAspectService tracingAspectService;

		private DummySearchTestController(TracingAspectService tracingAspectService) {
			this.tracingAspectService = tracingAspectService;
		}

		@GetMapping(path = "/search")
		public String search() {
			String runId = MDC.get(TracingAspectService.RUN_MDC_KEY);
			if (runId != null && !tracingAspectService.getPoints(runId).isEmpty()) {
				tracingAspectService.appendLog(
						runId,
						new TracingAspectService.Tracing(
								TracingAspectService.Phase.CALL,
								"net.osmand.search.SearchUICore#L678",
								678,
								true,
								null,
								null,
								null,
								null,
								null,
								System.currentTimeMillis(),
								0L,
								null
						)
				);
			}
			return "ok";
		}
	}
}
