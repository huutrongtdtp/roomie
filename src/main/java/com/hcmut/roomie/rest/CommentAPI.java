package com.hcmut.roomie.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcmut.roomie.dto.CommentDTO;
import com.hcmut.roomie.service.CommentService;
import com.hcmut.roomie.service.RoomService;
import com.hcmut.roomie.service.UserService;

@RestController
public class CommentAPI {
	@Autowired
	private CommentService commentService;
	@Autowired
	private RoomService roomService;
	@Autowired
	private UserService userService;
	
	@PostMapping("api/comment")
	public ResponseEntity<CommentDTO> createComment(@RequestBody CommentDTO commentDTO) {
		roomService.getRoom(commentDTO.getRid());
		userService.getUser(commentDTO.getUid());
		return ResponseEntity.ok(commentService.createComment(commentDTO));
	}
	@GetMapping("api/comment/{rid}")
	public ResponseEntity<List<CommentDTO>> getCommentsByRoom(@PathVariable Long rid) {
		List<CommentDTO> listComments = commentService.getCommentsByRoom(rid);
		return ResponseEntity.ok(listComments);
	}
}
