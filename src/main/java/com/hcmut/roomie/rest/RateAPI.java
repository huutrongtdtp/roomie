package com.hcmut.roomie.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcmut.roomie.dto.RateDTO;
import com.hcmut.roomie.service.RateService;

@RestController
public class RateAPI {
	@Autowired
	private RateService rateService;
	@PostMapping("api/rate")
	public ResponseEntity<RateDTO> createRate(@RequestBody RateDTO rateDTO) {
		return ResponseEntity.ok(rateService.createRate(rateDTO));
	}
	@PutMapping("api/rate")
	public ResponseEntity<RateDTO> updateRate(@RequestBody RateDTO rateDTO) {
		return ResponseEntity.ok(rateService.updateRate(rateDTO));
	}
}
