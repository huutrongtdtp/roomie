package com.hcmut.roomie.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.Length;

@Entity
public class User {
	@Id
	@GeneratedValue
	private Long uid;
	@Length(max = 70)
	private String name;
	@Length(max = 255)
	private String email;
	@Length(max = 255)
	private String password;
	@Length(max = 16)
	private String phone;
	private Date time;
	private String facebook;
	private String google;
	@OneToMany(mappedBy = "user")
	private List<Room> rooms = new ArrayList<>();
	@OneToMany(mappedBy = "user")
	private List<Comment> comments = new ArrayList<>();
	@OneToMany(mappedBy = "user")
	private List<Reply> replies = new ArrayList<>();
	@OneToMany(mappedBy = "user")
	private List<Rate> rates = new ArrayList<>();
	@OneToMany(mappedBy = "user")
	private List<Subcription> subcriptions = new ArrayList<>();
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getGoogle() {
		return google;
	}
	public void setGoogle(String google) {
		this.google = google;
	}
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
}
