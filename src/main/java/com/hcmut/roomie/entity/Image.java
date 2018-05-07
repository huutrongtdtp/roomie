package com.hcmut.roomie.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Image {
	@Id
	@GeneratedValue
	private Long iid;
	@ManyToOne
	@JoinColumn(name = "rid")
	private Room room;
	private String path;

	public Long getIid() {
		return iid;
	}

	public void setIid(Long iid) {
		this.iid = iid;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
