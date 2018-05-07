package com.hcmut.roomie.dto;

import java.util.Date;

public class ReplyDTO {
	private Long reId;
	private String content;
	private Date time;
	private Long uid;
	private Long cid;

	public Long getReId() {
		return reId;
	}

	public void setReId(Long reId) {
		this.reId = reId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}
}
