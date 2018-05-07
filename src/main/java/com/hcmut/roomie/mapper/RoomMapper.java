package com.hcmut.roomie.mapper;

import org.mapstruct.Mapper;

import com.hcmut.roomie.dto.RoomDTO;
import com.hcmut.roomie.entity.Room;

@Mapper(componentModel = "spring")
public interface RoomMapper {
	RoomDTO roomToRoomDTO(Room room);

	Room roomDTOToRoom(RoomDTO roomDTO);
	public default void updateRoomFromRoomDTO(Room room, RoomDTO roomDTO) {
		room.setAircondition(roomDTO.getAircondition());
		room.setArea(roomDTO.getArea());
		room.setAvailability(roomDTO.getAvailability());
		room.setCooking(roomDTO.getCooking());
		room.setInternet(roomDTO.getInternet());
		room.setMezzanine(roomDTO.getMezzanine());
		room.setParking(roomDTO.getParking());
		room.setPrice(roomDTO.getPrice());
		room.setPrivateToilet(roomDTO.getPrivateToilet());
		room.setSecurity(roomDTO.getSecurity());
		room.setTv(roomDTO.getTv());
	}
}
