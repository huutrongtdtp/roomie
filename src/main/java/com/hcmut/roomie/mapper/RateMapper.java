package com.hcmut.roomie.mapper;

import org.mapstruct.Mapper;

import com.hcmut.roomie.dto.RateDTO;
import com.hcmut.roomie.entity.Rate;

@Mapper(componentModel = "spring")
public interface RateMapper {
	RateDTO rateToRateDTO(Rate rate);

	Rate rateDTOToRate(RateDTO rateDTO);
	public default void updateRateFromRateDTO(Rate rate, RateDTO rateDTO) {
		rate.setLevel(rateDTO.getLevel());
	}
}
