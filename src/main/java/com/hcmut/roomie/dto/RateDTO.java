package com.hcmut.roomie.dto;

public class RateDTO {
	private Long raId;
	private Long uid;
	private int level;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Long getRaId() {
		return raId;
	}

	public void setRaId(Long raId) {
		this.raId = raId;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}
}
