package com.hcmut.roomie.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import com.hcmut.roomie.dal.LocationDAO;
import com.hcmut.roomie.dal.RoomDAO;
import com.hcmut.roomie.dto.LocationDTO;
import com.hcmut.roomie.dto.RoomDTO;
import com.hcmut.roomie.entity.Room;
import com.hcmut.roomie.mapper.RoomMapper;

@Service
public class RoomServiceImpl implements RoomService {
	@Autowired
	private RoomDAO roomDAO;
	@Autowired
	private RoomMapper roomMapper;
	@Autowired
	private LocationDAO locationDAO;
	@Autowired
	private LocationService locationService;

	@Override
	public RoomDTO createRoom(RoomDTO roomDTO) {
		return roomMapper.roomToRoomDTO(roomDAO.save(roomMapper.roomDTOToRoom(roomDTO)));
	}

	@Override
	public RoomDTO updateRoom(RoomDTO roomDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoomDTO getRoom(Long rid) {
		return roomMapper.roomToRoomDTO(roomDAO.findById(rid)
				.orElseThrow(() -> new HttpServerErrorException(HttpStatus.NOT_FOUND, "Room not existing")));
	}

	@Override
	public List<RoomDTO> findNearby(long latitude, long longitude, int meter) {
		List<LocationDTO> locations = locationService.getAllLocation().stream().filter(location -> DistanceCalculator
				.distance(latitude, longitude, location.getLatitude(), location.getLongitude(), "M") <= meter)
				.collect(Collectors.toList());
		List<RoomDTO> result = new ArrayList<>();
		locations.forEach(location -> locationDAO.findById(location.getLid())
				.orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND)).getRooms()
				.forEach(dto -> result.add(roomMapper.roomToRoomDTO(dto))));
		return result;
	}

}
