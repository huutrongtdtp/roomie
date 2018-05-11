package com.hcmut.roomie.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;

@Entity
public class Room {
	@Id
	@GeneratedValue
	private Long rid;
	@Min(value = 0)
	private Double area;
	@Min(value = 0)
	private Double price;
	private Boolean availability;
	private Date time;
	private Boolean parking;
	private Boolean mezzanine;
	private Boolean aircondition;
	private Boolean internet;
	private Boolean tv;
	private Boolean cooking;
	private Boolean security;
	private Boolean privateToilet;
	private String description;
	@ManyToOne
	@JoinColumn(name = "uid")
	private User user;
	@ManyToOne
	@JoinColumn(name = "lid")
	private Location location;
	@OneToMany(mappedBy = "room")
	private List<Comment> comments = new ArrayList<>();
	@OneToMany(mappedBy = "room")
	private List<Image> images = new ArrayList<>();
	@OneToMany(mappedBy = "room")
	private List<Rate> rates = new ArrayList<>();

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getRid() {
		return rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getAvailability() {
		return availability;
	}

	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Boolean getParking() {
		return parking;
	}

	public void setParking(Boolean parking) {
		this.parking = parking;
	}

	public Boolean getMezzanine() {
		return mezzanine;
	}

	public void setMezzanine(Boolean mezzanine) {
		this.mezzanine = mezzanine;
	}

	public Boolean getAircondition() {
		return aircondition;
	}

	public void setAircondition(Boolean aircondition) {
		this.aircondition = aircondition;
	}

	public Boolean getInternet() {
		return internet;
	}

	public void setInternet(Boolean internet) {
		this.internet = internet;
	}

	public Boolean getTv() {
		return tv;
	}

	public void setTv(Boolean tv) {
		this.tv = tv;
	}

	public Boolean getCooking() {
		return cooking;
	}

	public void setCooking(Boolean cooking) {
		this.cooking = cooking;
	}

	public Boolean getSecurity() {
		return security;
	}

	public void setSecurity(Boolean security) {
		this.security = security;
	}

	public Boolean getPrivateToilet() {
		return privateToilet;
	}

	public void setPrivateToilet(Boolean privateToilet) {
		this.privateToilet = privateToilet;
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

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}
}
