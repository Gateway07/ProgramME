package org.tracing;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.ConnectException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TracingIntegrationTest {
	private static final String runId = "run-2025-12-06-002";
	private static final String baseUrl = "http://localhost:8080";
	private static final String searchTestBaseUrl = "http://localhost:8080/admin/search-test";
	private static final String tracingBaseUrl = "http://localhost:8080/tracing";
	private static final Duration requestTimeout = Duration.ofMinutes(5);

	private final ObjectMapper objectMapper = new ObjectMapper();
	private final HttpClient httpClient = HttpClient.newBuilder().connectTimeout(requestTimeout).build();

	@BeforeEach
	void setUp() {
		Assumptions.assumeTrue(isServerReachable(), "Local server is not reachable at " + baseUrl);
		HttpResponse<Void> res = delete(tracingBaseUrl + "/" + runId);
		assertEquals(204, res.statusCode());
	}

	@Test
	void scenario_pointsThenCallSearchWithRunIdHeaderThenReadLogs() throws Exception {
		List<TracingAspectService.BreakPoint> breakPoints = List.of(
				new TracingAspectService.BreakPoint(
						"net.osmand.search.SearchUICore",
						660,
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

		HttpResponse<Void> setPointsResponse = postJson(tracingBaseUrl + "/" + runId + "/points", objectMapper.writeValueAsBytes(breakPoints));
		assertEquals(200, setPointsResponse.statusCode());

		HttpResponse<String> searchResponse = getWithHeader(
					searchTestBaseUrl + "/search?query=330%203rd%20clermont&lat=28.5604574&lon=-81.7604685",
					TracingRunIdFilter.RUN_ID_HEADER,
					runId
			);
		boolean code = searchResponse.statusCode() >= 200 && searchResponse.statusCode() < 300;
		assertTrue(code);

		HttpResponse<byte[]> logsResponse = getBytes(tracingBaseUrl + "/" + runId + "/logs");
		assertEquals(200, logsResponse.statusCode());
		TracingAspectService.Tracing[] logs = objectMapper.readValue(logsResponse.body(), TracingAspectService.Tracing[].class);
		assertTrue(logs.length > 0);

		System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(logs));
	}

	private boolean isServerReachable() {
		try {
			HttpResponse<Void> res = head("/admin/search-test/initialized");
			return res.statusCode() > 0;
		} catch (RuntimeException e) {
			e.printStackTrace();
			return false;
		}
	}

	private HttpResponse<Void> head(String path) {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(baseUrl + path))
				.timeout(requestTimeout)
				.method("HEAD", HttpRequest.BodyPublishers.noBody())
				.build();
		return send(request, HttpResponse.BodyHandlers.discarding());
	}

	private HttpResponse<String> get(String url) {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.timeout(requestTimeout)
				.GET()
				.build();
		return send(request, HttpResponse.BodyHandlers.ofString());
	}

	private HttpResponse<byte[]> getBytes(String url) {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.timeout(requestTimeout)
				.GET()
				.build();
		return send(request, HttpResponse.BodyHandlers.ofByteArray());
	}

	private HttpResponse<String> getWithHeader(String url, String headerName, String headerValue) {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.timeout(requestTimeout)
				.header(headerName, headerValue)
				.GET()
				.build();
		return send(request, HttpResponse.BodyHandlers.ofString());
	}

	private HttpResponse<Void> postJson(String url, byte[] jsonBytes) {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.timeout(requestTimeout)
				.header("Content-Type", "application/json")
				.POST(HttpRequest.BodyPublishers.ofByteArray(jsonBytes))
				.build();
		return send(request, HttpResponse.BodyHandlers.discarding());
	}

	private HttpResponse<Void> delete(String url) {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.timeout(requestTimeout)
				.DELETE()
				.build();
		return send(request, HttpResponse.BodyHandlers.discarding());
	}

	private <T> HttpResponse<T> send(HttpRequest request, HttpResponse.BodyHandler<T> bodyHandler) {
		try {
			return httpClient.send(request, bodyHandler);
		} catch (ConnectException e) {
			throw new IllegalStateException("Local server is not reachable at " + baseUrl, e);
		} catch (IOException e) {
			throw new IllegalStateException("I/O error calling local server at " + baseUrl, e);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new IllegalStateException("Interrupted while calling local server at " + baseUrl, e);
		}
	}
}
