package com.hcmut.roomie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcmut.roomie.dal.CommentDAO;
import com.hcmut.roomie.dto.CommentDTO;
import com.hcmut.roomie.mapper.CommentMapper;
@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentMapper commentMapper;
	@Autowired
	private CommentDAO commentDAO;
	@Override
	public CommentDTO createComment(CommentDTO commentDTO) {
		return commentMapper.commentToCommentDTO(commentDAO.save(commentMapper.commentDTOToComment(commentDTO)));
	}
	
}
