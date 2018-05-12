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
import com.hcmut.roomie.dal.SubcriptionDAO;
import com.hcmut.roomie.dto.LocationDTO;
import com.hcmut.roomie.dto.RoomDTO;
import com.hcmut.roomie.entity.Room;
import com.hcmut.roomie.entity.Subcription;
import com.hcmut.roomie.mapper.LocationMapper;
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
	@Autowired
	private SubcriptionDAO subscriptionDAO;
	@Autowired
	private LocationMapper locationMapper;

	@Override
	public RoomDTO createRoom(RoomDTO roomDTO) {
		Room room = roomMapper.roomDTOToRoom(roomDTO);
		room.getImages().forEach(image -> image.setRoom(room));
		Room room2 = roomDAO.save(room);
		return roomMapper.roomToRoomDTO(room2);
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
	public List<RoomDTO> findNearby(double latitude, double longitude, int meter) {
		List<LocationDTO> locations = locationService.getAllLocation().stream().filter(location -> DistanceCalculator
				.distance(latitude, longitude, location.getLatitude(), location.getLongitude(), "K") <= meter)
				.collect(Collectors.toList());
		List<RoomDTO> result = new ArrayList<>();
		locations.forEach(location -> locationDAO.findById(location.getLid())
				.orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND)).getRooms()
				.forEach(dto -> result.add(roomMapper.roomToRoomDTO(dto))));
		return result.stream().distinct().collect(Collectors.toList());
	}

	@Override
	public List<RoomDTO> findBySubcription(long uid) {
		List<Subcription> subcriptions = subscriptionDAO.findByUserUid(uid);
		List<RoomDTO> result = new ArrayList<>();
		subcriptions.forEach(subcription -> {
			LocationDTO locationDTO = locationMapper.locationToLocationDTO(subcription.getLocation());
			result.addAll(findNearby(locationDTO.getLatitude(), locationDTO.getLongitude(),
					subcription.getRadius().intValue()));
		});
		return result.stream().distinct().collect(Collectors.toList());
	}

}
