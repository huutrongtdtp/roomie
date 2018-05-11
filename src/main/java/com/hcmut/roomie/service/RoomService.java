package com.hcmut.roomie.service;

import java.util.List;

import com.hcmut.roomie.dto.RoomDTO;

public interface RoomService {
	public RoomDTO createRoom(RoomDTO roomDTO);

	public RoomDTO updateRoom(RoomDTO roomDTO);

	public RoomDTO getRoom(Long rid);

	public List<RoomDTO> findNearby(long latitude, long longitude, int meter);
}
