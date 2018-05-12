package com.hcmut.roomie.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.hcmut.roomie.dto.CommentDTO;
import com.hcmut.roomie.entity.Comment;

@Mapper(componentModel = "spring")
public interface CommentMapper {
	@Mappings({
		@Mapping(source="user.uid", target="uid"),
		@Mapping(source="room.rid", target="rid")
	})
	CommentDTO commentToCommentDTO(Comment comment);
	@Mappings({
		@Mapping(source="uid", target="user.uid"),
		@Mapping(source="rid", target="room.rid")
	})	
	Comment commentDTOToComment(CommentDTO commentDTO);
}
