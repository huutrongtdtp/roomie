package com.hcmut.roomie.dto;

import java.util.Date;
import java.util.List;

public class RoomDTO {
	private Long rid;
	private Double area;
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
	private List<ImageDTO> images;
	private Long uid;
	private Long lid;

	public List<ImageDTO> getImages() {
		return images;
	}

	public void setImages(List<ImageDTO> images) {
		this.images = images;
	}

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

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public Long getLid() {
		return lid;
	}

	public void setLid(Long lid) {
		this.lid = lid;
	}

	@Override
	public boolean equals(Object object) {
		return this.rid == ((RoomDTO) object).getRid();
	}

	@Override
	public int hashCode() {
		return (int) (7 * rid);
	}

}
