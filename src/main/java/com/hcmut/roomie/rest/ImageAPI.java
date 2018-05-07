package com.hcmut.roomie.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcmut.roomie.dto.ImageDTO;
import com.hcmut.roomie.service.ImageService;

@RestController
public class ImageAPI {
	@Autowired
	private ImageService imageService;
	@PostMapping("api/image")
	public ResponseEntity<ImageDTO> createImage(@RequestBody ImageDTO imageDTO) {
		return ResponseEntity.ok(imageService.createImage(imageDTO));
	}
}
