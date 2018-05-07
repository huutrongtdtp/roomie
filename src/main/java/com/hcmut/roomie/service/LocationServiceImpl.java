package com.hcmut.roomie.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcmut.roomie.dal.LocationDAO;
import com.hcmut.roomie.dto.LocationDTO;
import com.hcmut.roomie.entity.Location;
import com.hcmut.roomie.mapper.LocationMapper;

@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	private LocationDAO locationDAO;
	@Autowired
	private LocationMapper locationMapper;

	@Override
	public LocationDTO createLocation(LocationDTO locationDTO) {
		Optional<Location> location = locationDAO
				.findByCoordinate(locationDTO.getLongitude() + "," + locationDTO.getLatitude());
		if (location.isPresent())
			return locationMapper.locationToLocationDTO(location.get());
		else
			return locationMapper
					.locationToLocationDTO(locationDAO.save(locationMapper.locationDTOToLocation(locationDTO)));
	}

}
