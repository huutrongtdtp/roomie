package com.hcmut.roomie.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.hcmut.roomie.dto.RateDTO;
import com.hcmut.roomie.entity.Rate;

@Mapper(componentModel = "spring")
public interface RateMapper {
	@Mappings({ 
		@Mapping(source = "user.uid", target = "uid"), 
		@Mapping(source = "room.rid", target = "rid") 
	})
	RateDTO rateToRateDTO(Rate rate);
	@Mappings({ 
		@Mapping(source = "uid", target = "user.uid"), 
		@Mapping(source = "rid", target = "room.rid") 
	})
	Rate rateDTOToRate(RateDTO rateDTO);
	public default void updateRateFromRateDTO(Rate rate, RateDTO rateDTO) {
		rate.setLevel(rateDTO.getLevel());
	}
}
