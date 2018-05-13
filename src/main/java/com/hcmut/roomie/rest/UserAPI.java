package com.hcmut.roomie.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcmut.roomie.dto.UserCreateDTO;
import com.hcmut.roomie.dto.UserDetailsDTO;
import com.hcmut.roomie.dto.UserLoginDTO;
import com.hcmut.roomie.service.UserService;

@RestController
public class UserAPI {
	@Autowired
	private UserService userService;

	@PostMapping("api/user")
	public ResponseEntity<UserDetailsDTO> createUser(@RequestBody UserCreateDTO userCreateDTO) {
		return ResponseEntity.ok(userService.createUser(userCreateDTO));
	}
	
	@PutMapping("api/user")
	public ResponseEntity<UserDetailsDTO> updateUser(@RequestBody UserDetailsDTO userDetailsDTO) {
		return ResponseEntity.ok(userService.updateUser(userDetailsDTO));
	}
	
	@GetMapping("api/user/{uid}")
	public ResponseEntity<UserDetailsDTO> getUser(@PathVariable Long uid) {
		return ResponseEntity.ok(userService.getUser(uid));
	}
	@PostMapping("api/user-login")
	public ResponseEntity<Long> loginUser(@RequestBody UserLoginDTO userLoginDTO) {
		return ResponseEntity.ok(userService.loginUser(userLoginDTO));
	}
}
