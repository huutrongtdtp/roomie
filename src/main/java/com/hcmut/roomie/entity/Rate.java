package com.hcmut.roomie.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
public class Rate {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long raId;
	@ManyToOne
	@JoinColumn(name = "uid")
	private User user;
	@ManyToOne
	@JoinColumn(name = "rid")
	private Room room;
	private Date time;
	@Min(value = 0)
	@Max(value = 5)
	private int level;

	public Long getRaId() {
		return raId;
	}

	public void setRaId(Long raId) {
		this.raId = raId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
