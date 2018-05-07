package com.hcmut.roomie.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Location {
	@Id
	@GeneratedValue
	private Long lid;
	private String address;
	private String coordinate;
	@OneToMany(mappedBy = "location")
	private List<Room> rooms = new ArrayList<>();
	@OneToMany(mappedBy = "location")
	private List<Subcription> subcriptions = new ArrayList<>();

	public Long getLid() {
		return lid;
	}

	public void setLid(Long lid) {
		this.lid = lid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(String coordinate) {
		this.coordinate = coordinate;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public List<Subcription> getSubcriptions() {
		return subcriptions;
	}

	public void setSubcriptions(List<Subcription> subcriptions) {
		this.subcriptions = subcriptions;
	}
}
