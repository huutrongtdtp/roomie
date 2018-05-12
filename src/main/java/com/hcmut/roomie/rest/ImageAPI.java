package com.hcmut.roomie.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping("api/images-by-room/{rid}")
	public ResponseEntity<List<ImageDTO>> getImagesByRoom(@PathVariable Long rid) {
		return ResponseEntity.ok(imageService.getImagesByRoom(rid));
	}
}
