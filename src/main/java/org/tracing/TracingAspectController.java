package org.tracing;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tracing/runs")
public class TracingAspectController {

	private final TracingAspectService registry;

	@PostMapping("/{runId}/points")
	public ResponseEntity<Void> setPoints(@PathVariable String runId, @RequestBody List<TracingAspectService.BreakPoint> points) {
		registry.setPoints(runId, points);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/{runId}/logs")
	public ResponseEntity<List<TracingAspectService.Tracing>> getLogs(@PathVariable String runId) {
		return ResponseEntity.ok(registry.getTracings(runId));
	}

	@DeleteMapping("/{runId}")
	public ResponseEntity<Void> clearRun(@PathVariable String runId) {
		registry.clearLogs(runId);
		return ResponseEntity.noContent().build();
	}
}

