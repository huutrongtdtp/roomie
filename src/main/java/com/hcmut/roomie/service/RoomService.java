package com.hcmut.roomie.service;

import com.hcmut.roomie.dto.RoomDTO;

public interface RoomService {
	public RoomDTO createRoom(RoomDTO roomDTO);
	public RoomDTO updateRoom(RoomDTO roomDTO);
	public RoomDTO getRoom(Long rid);
}
