package com.hcmut.roomie.service;

import java.util.List;

import com.hcmut.roomie.dto.LocationDTO;

public interface LocationService {
	public LocationDTO createLocation(LocationDTO locationDTO);
	public List<LocationDTO> getAllLocation();
	public LocationDTO findById(long lid);
}
