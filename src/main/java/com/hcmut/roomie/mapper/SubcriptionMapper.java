package com.hcmut.roomie.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.hcmut.roomie.dto.SubcriptionDTO;
import com.hcmut.roomie.entity.Subcription;

@Mapper(componentModel = "spring")
public interface SubcriptionMapper {

	@Mappings({ @Mapping(source = "user.uid", target = "uid"), @Mapping(source = "location.lid", target = "lid") })
	SubcriptionDTO subcriptionToSubcriptionDTO(Subcription subcription);

	@Mappings({ @Mapping(source = "uid", target = "user.uid"), @Mapping(source = "lid", target = "location.lid") })
	Subcription subcriptionDTOToSubcription(SubcriptionDTO subcriptionDTO);
}
