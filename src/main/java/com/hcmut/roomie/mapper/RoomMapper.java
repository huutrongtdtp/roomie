package com.hcmut.roomie.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.hcmut.roomie.dto.RoomDTO;
import com.hcmut.roomie.entity.Room;

@Mapper(componentModel = "spring", uses = ImageMapper.class)
public interface RoomMapper {

	@Mappings({ @Mapping(source = "user.uid", target = "uid"),
		@Mapping(source = "location.lid", target = "lid")
	, @Mapping(source="images", target="images", qualifiedByName="imageListToImageDTOList")})
	RoomDTO roomToRoomDTO(Room room);

	@Mappings({ @Mapping(source = "uid", target = "user.uid"), @Mapping(source = "lid", target = "location.lid") })
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
		room.setDescription(roomDTO.getDescription());
	}
}
