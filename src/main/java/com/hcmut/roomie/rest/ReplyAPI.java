package com.hcmut.roomie.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcmut.roomie.dto.ReplyDTO;
import com.hcmut.roomie.service.ReplyService;

@RestController
public class ReplyAPI {
	@Autowired
	private ReplyService replyService;
	@PostMapping("api/reply")
	public ResponseEntity<ReplyDTO> createReply(@RequestBody ReplyDTO replyDTO) {
		return ResponseEntity.ok(replyService.createReply(replyDTO));
	}
	@GetMapping("api/reply/{cid}")
	public ResponseEntity<List<ReplyDTO>> getRepliesByComment(@PathVariable Long cid) {
		return ResponseEntity.ok(replyService.getRepliesByComment(cid));
	}
}
