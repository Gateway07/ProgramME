package org.tracing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.ConnectException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchAddressBySqlIntegrationTest {
	private static final String baseUrl = "http://localhost:8080";
	private static final Duration requestTimeout = Duration.ofMinutes(5);

	private final ObjectMapper objectMapper = new ObjectMapper();
	private final HttpClient httpClient = HttpClient.newBuilder().connectTimeout(requestTimeout).build();

	@Test
	void searchBySql() throws Exception {
		Assumptions.assumeTrue(isServerReachable(), "Local server is not reachable at " + baseUrl);

		HttpResponse<String> response = getWithBody(
				baseUrl + "/admin/search-test/search-by-sql",
				"id < 100");

		boolean ok = response.statusCode() >= 200 && response.statusCode() < 300;
		assertTrue(ok, "Unexpected HTTP status: " + response.statusCode() + " body=" + response.body());

		JsonNode body = objectMapper.readTree(response.body());
		assertNotNull(body);
		assertTrue(body.hasNonNull("status"), "Missing 'status' in response: " + response.body());
		assertTrue(body.has("total"), "Missing 'total' in response: " + response.body());
		assertTrue(body.has("failed"), "Missing 'failed' in response: " + response.body());
		assertTrue(body.has("found"), "Missing 'found' in response: " + response.body());
		assertTrue(body.has("partial"), "Missing 'partial' in response: " + response.body());
		assertTrue(body.has("duration"), "Missing 'duration' in response: " + response.body());
		assertTrue(body.has("totalBytes"), "Missing 'totalBytes' in response: " + response.body());
		assertTrue(body.has("totalTime"), "Missing 'totalTime' in response: " + response.body());

		System.out.printf(
				"Search-by-SQL RunResult: status=%s total=%d failed=%d found=%d partial=%d duration=%d totalBytes=%d totalTime=%d%n",
				body.path("status").asText(),
				body.path("total").asLong(),
				body.path("failed").asLong(),
				body.path("found").asLong(),
				body.path("partial").asLong(),
				body.path("duration").asLong(),
				body.path("totalBytes").asLong(),
				body.path("totalTime").asLong()
		);
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

	private HttpResponse<String> getWithBody(String url, String body) {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.timeout(requestTimeout)
				.header("Content-Type", "text/plain")
				.method("GET", HttpRequest.BodyPublishers.ofString(body))
				.build();
		return send(request, HttpResponse.BodyHandlers.ofString());
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
