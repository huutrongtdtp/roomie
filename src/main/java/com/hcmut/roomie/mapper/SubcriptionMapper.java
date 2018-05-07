package com.hcmut.roomie.mapper;

import org.mapstruct.Mapper;

import com.hcmut.roomie.dto.SubcriptionDTO;
import com.hcmut.roomie.entity.Subcription;

@Mapper(componentModel = "spring")
public interface SubcriptionMapper {
	SubcriptionDTO subcriptionToSubcriptionDTO(Subcription subcription);

	Subcription subcriptionDTOToSubcription(SubcriptionDTO subcriptionDTO);
}
