package com.hcmut.roomie.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

@Entity
public class Subcription {
	@Id
	@GeneratedValue
	private Long sid;
	@ManyToOne
	@JoinColumn(name = "uid")
	private User user;
	@ManyToOne
	@JoinColumn(name = "lid")
	private Location location;
	private Date time;
	@Min(value = 0)
	private Double radius;
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Double getRadius() {
		return radius;
	}
	public void setRadius(Double radius) {
		this.radius = radius;
	}
}
