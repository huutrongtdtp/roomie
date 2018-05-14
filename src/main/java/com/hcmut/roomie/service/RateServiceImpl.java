package com.hcmut.roomie.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;

import com.hcmut.roomie.dal.RateDAO;
import com.hcmut.roomie.dto.RateDTO;
import com.hcmut.roomie.entity.Rate;
import com.hcmut.roomie.mapper.RateMapper;

@Service
public class RateServiceImpl implements RateService {
	@Autowired
	private RateDAO rateDAO;
	@Autowired
	private RateMapper rateMapper;

	@Override
	public RateDTO createRate(RateDTO rateDTO) {
		Optional<Rate> rate = rateDAO.findByUserUidAndRoomRid(rateDTO.getUid(), rateDTO.getRid());
		if (rate.isPresent()) {
			rateDTO.setRaId(rate.get().getRaId());
			return updateRate(rateDTO);
		}
		return rateMapper.rateToRateDTO(rateDAO.save(rateMapper.rateDTOToRate(rateDTO)));
	}

	@Override
	public RateDTO updateRate(RateDTO rateDTO) {
		Rate rate = rateDAO.findById(rateDTO.getRaId())
				.orElseThrow(() -> new HttpServerErrorException(HttpStatus.NOT_FOUND, "Rate not found"));
		rateMapper.updateRateFromRateDTO(rate, rateDTO);
		return rateMapper.rateToRateDTO(rateDAO.save(rate));
	}

	@Override
	public RateDTO getRate(Long uid, Long rid) {
		return rateMapper.rateToRateDTO(rateDAO.findByUserUidAndRoomRid(uid, rid)
				.orElseThrow(() -> new HttpServerErrorException(HttpStatus.NOT_FOUND, "Not rated")));
	}

	@Override
	public Double getAvgRate(Long rid) {
		return rateDAO.getAvgRate(rid);
	}

}
