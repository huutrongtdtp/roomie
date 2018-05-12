package com.hcmut.roomie.service;

import java.util.List;

import com.hcmut.roomie.dto.ReplyDTO;

public interface ReplyService {
	public ReplyDTO createReply(ReplyDTO replyDTO);
	List<ReplyDTO> getRepliesByComment(Long cid);
}
