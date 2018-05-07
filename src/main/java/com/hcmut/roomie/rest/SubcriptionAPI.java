package com.hcmut.roomie.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcmut.roomie.dto.SubcriptionDTO;
import com.hcmut.roomie.service.SubcriptionService;

@RestController
public class SubcriptionAPI {
	@Autowired
	private SubcriptionService subcriptionService;
	@PostMapping("api/subcription")
	public ResponseEntity<SubcriptionDTO> createSubcription(@RequestBody SubcriptionDTO subcriptionDTO) {
		return ResponseEntity.ok(subcriptionService.createSubcription(subcriptionDTO));
	}
}
