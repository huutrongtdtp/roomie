package com.hcmut.roomie.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcmut.roomie.dto.RoomDTO;
import com.hcmut.roomie.service.RoomService;

@RestController
public class RoomAPI {
	@Autowired
	private RoomService roomService;
	
	@PostMapping("api/room")
	public ResponseEntity<RoomDTO> createRoom(@RequestBody RoomDTO roomDTO) {
		return ResponseEntity.ok(roomService.createRoom(roomDTO));
	}
	@PutMapping("api/room")
	public ResponseEntity<RoomDTO> updateRoom(@RequestBody RoomDTO roomDTO) {
		return ResponseEntity.ok(roomService.updateRoom(roomDTO));
	}
	@GetMapping("api/room/{rid}")
	public ResponseEntity<RoomDTO> getRoom(@PathVariable Long rid) {
		return ResponseEntity.ok(roomService.getRoom(rid));
	}
}
