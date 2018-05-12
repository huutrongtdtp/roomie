package com.hcmut.roomie.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.hcmut.roomie.dto.ReplyDTO;
import com.hcmut.roomie.entity.Reply;

@Mapper(componentModel = "spring")
public interface ReplyMapper {
	@Mappings({
		@Mapping(source="user.uid", target="uid"),
		@Mapping(source="comment.cid", target="cid")
	})
	ReplyDTO replyToReplyDTO(Reply reply);
	@Mappings({
		@Mapping(source="uid", target="user.uid"),
		@Mapping(source="cid", target="comment.cid")
	})
	Reply replyDTOToReply(ReplyDTO replyDTO);
}
