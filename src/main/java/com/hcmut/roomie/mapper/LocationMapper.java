package com.hcmut.roomie.mapper;

import org.mapstruct.Mapper;

import com.hcmut.roomie.dto.LocationDTO;
import com.hcmut.roomie.entity.Location;

@Mapper(componentModel = "spring")
public interface LocationMapper {
	LocationDTO locationToLocationDTO(Location location);

	Location locationDTOToLocation(LocationDTO locationDTO);
}
