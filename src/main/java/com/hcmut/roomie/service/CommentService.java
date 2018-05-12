package com.hcmut.roomie.service;

import java.util.List;

import com.hcmut.roomie.dto.CommentDTO;

public interface CommentService {
	public CommentDTO createComment(CommentDTO commentDTO);
	public List<CommentDTO> getCommentsByRoom(Long rid);
}
