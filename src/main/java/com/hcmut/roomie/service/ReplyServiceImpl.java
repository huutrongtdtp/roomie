package com.hcmut.roomie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcmut.roomie.dal.ReplyDAO;
import com.hcmut.roomie.dto.ReplyDTO;
import com.hcmut.roomie.mapper.ReplyMapper;
@Service
public class ReplyServiceImpl implements ReplyService {
	@Autowired
	private ReplyDAO replyDAO;
	@Autowired
	private ReplyMapper replyMapper;
	@Override
	public ReplyDTO createReply(ReplyDTO replyDTO) {
		return replyMapper.replyToReplyDTO(replyDAO.save(replyMapper.replyDTOToReply(replyDTO)));
	};
	
}
