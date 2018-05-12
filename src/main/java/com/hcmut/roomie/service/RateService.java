package com.hcmut.roomie.service;

import com.hcmut.roomie.dto.RateDTO;

public interface RateService {
	public RateDTO createRate(RateDTO rateDTO);
	public RateDTO updateRate(RateDTO rateDTO);
	public RateDTO getRate(Long uid, Long rid);
	public Double getAvgRate(Long rid);
}
