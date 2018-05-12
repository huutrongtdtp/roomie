package com.hcmut.roomie.service;

import java.util.ArrayList;
import java.util.List;

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
	@Override
	public List<CommentDTO> getCommentsByRoom(Long rid) {
		List<CommentDTO> result = new ArrayList<>();
		commentDAO.findByRoomRid(rid).forEach(comment -> result.add(commentMapper.commentToCommentDTO(comment)));
		return result;
	}
	
}
