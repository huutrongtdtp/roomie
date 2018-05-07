package com.hcmut.roomie.dto;

public class LocationDTO {
	private Long lid;
	private String address;
	private Double longitude;
	private Double latitude;

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

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
}
