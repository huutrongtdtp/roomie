package com.hcmut.roomie.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

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

	@Override
	public List<LocationDTO> getAllLocation() {
		List<LocationDTO> result = new ArrayList<>();
		locationDAO.findAll().forEach(location -> result.add(locationMapper.locationToLocationDTO(location)));
		return result;
	}

	@Override
	public LocationDTO findById(long lid) {
		return locationMapper.locationToLocationDTO(
				locationDAO.findById(lid).orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND)));
	}

}
