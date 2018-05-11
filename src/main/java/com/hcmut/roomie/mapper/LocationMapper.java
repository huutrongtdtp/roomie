package com.hcmut.roomie.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import com.hcmut.roomie.dto.LocationDTO;
import com.hcmut.roomie.entity.Location;

@Mapper(componentModel = "spring")
public interface LocationMapper {

	@Mappings({ @Mapping(target = "longitude", source = "location", qualifiedByName = "getLongitude"),
			@Mapping(target = "latitude", source = "location", qualifiedByName = "getLatitude") })
	LocationDTO locationToLocationDTO(Location location);

	@Mapping(target = "coordinate", source = "locationDTO", qualifiedByName = "getCoordinate")
	Location locationDTOToLocation(LocationDTO locationDTO);

	@Named("getCoordinate")
	default String getCoordinate(LocationDTO locationDTO) {
		return "" + locationDTO.getLatitude() + "," + locationDTO.getLongitude();
	}

	@Named("getLongitude")
	default double getLongitude(Location location) {
		return Double.valueOf(location.getCoordinate().split(",")[1]);
	}

	@Named("getLatitude")
	default double getLatitude(Location location) {
		return Double.valueOf(location.getCoordinate().split(",")[0]);
	}
}
