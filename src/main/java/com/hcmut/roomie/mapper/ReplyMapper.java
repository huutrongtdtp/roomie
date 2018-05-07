package com.hcmut.roomie.mapper;

import org.mapstruct.Mapper;

import com.hcmut.roomie.dto.ReplyDTO;
import com.hcmut.roomie.entity.Reply;

@Mapper(componentModel = "spring")
public interface ReplyMapper {
	ReplyDTO replyToReplyDTO(Reply reply);

	Reply replyDTOToReply(ReplyDTO replyDTO);
}
