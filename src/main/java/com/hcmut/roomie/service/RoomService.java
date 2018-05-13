package com.hcmut.roomie.service;

import java.util.List;

import com.hcmut.roomie.dto.RoomDTO;

public interface RoomService {
	public RoomDTO createRoom(RoomDTO roomDTO);

	public RoomDTO updateRoom(RoomDTO roomDTO);

	public RoomDTO getRoom(Long rid);

	public List<RoomDTO> findNearby(double latitude, double longitude, int meter);

	public List<RoomDTO> findBySubcription(long uid);

	public List<RoomDTO> findRecentRooms();
}
