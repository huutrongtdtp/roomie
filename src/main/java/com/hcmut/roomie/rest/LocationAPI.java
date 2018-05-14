package com.hcmut.roomie.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcmut.roomie.dto.LocationDTO;
import com.hcmut.roomie.service.LocationService;

@RestController
public class LocationAPI {
	@Autowired
	private LocationService locationService;
	@PostMapping("api/location")
	public ResponseEntity<LocationDTO> createLocation(@RequestBody LocationDTO locationDTO) {
		return ResponseEntity.ok(locationService.createLocation(locationDTO));
	}
	@GetMapping("api/location/{lid}")
	public ResponseEntity<LocationDTO> getLocation(@PathVariable Long lid) {
		return ResponseEntity.ok(locationService.findById(lid));
	}
}
