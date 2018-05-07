package com.hcmut.roomie.mapper;

import org.mapstruct.Mapper;

import com.hcmut.roomie.dto.CommentDTO;
import com.hcmut.roomie.entity.Comment;

@Mapper(componentModel = "spring")
public interface CommentMapper {
	CommentDTO commentToCommentDTO(Comment comment);

	Comment commentDTOToComment(CommentDTO commentDTO);
}
