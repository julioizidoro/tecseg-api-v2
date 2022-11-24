package br.com.tecsegapi.controller;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/health")
public class HealthController {
	
	@GetMapping()
	public ResponseEntity<Date> health() {
		Date data = new Date();
		return ResponseEntity.ok(data);
	}

}
