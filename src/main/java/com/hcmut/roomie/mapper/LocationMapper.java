package com.hcmut.roomie.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import com.hcmut.roomie.dto.LocationDTO;
import com.hcmut.roomie.entity.Location;

@Mapper(componentModel = "spring")
public interface LocationMapper {
	
	@Mappings({ @Mapping(target = "longitude", source = "getLongitude"),
			@Mapping(target = "latitude", source = "getLatitude") })
	LocationDTO locationToLocationDTO(Location location);

	Location locationDTOToLocation(LocationDTO locationDTO);

	@Named("getLongitude")
	default long getLongitude(Location location) {
		return Long.valueOf(location.getCoordinate().split(",")[1]);
	}

	@Named("getLatitude")
	default long getLatitude(Location location) {
		return Long.valueOf(location.getCoordinate().split(",")[0]);
	}
}
