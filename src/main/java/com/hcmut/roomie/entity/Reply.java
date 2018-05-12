package com.hcmut.roomie.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reply {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long reId;
	private String content;
	private Date time;
	@ManyToOne
	@JoinColumn(name = "uid")
	private User user;
	@ManyToOne
	@JoinColumn(name = "cid")
	private Comment comment;

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}
}
