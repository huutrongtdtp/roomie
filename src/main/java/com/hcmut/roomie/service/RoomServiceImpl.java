package com.hcmut.roomie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;

import com.hcmut.roomie.dal.RoomDAO;
import com.hcmut.roomie.dto.RoomDTO;
import com.hcmut.roomie.mapper.RoomMapper;

@Service
public class RoomServiceImpl implements RoomService {
	@Autowired
	private RoomDAO roomDAO;
	@Autowired
	private RoomMapper roomMapper;

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

}
