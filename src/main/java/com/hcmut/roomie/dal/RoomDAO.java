package com.hcmut.roomie.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcmut.roomie.entity.Room;
@Repository
public interface RoomDAO extends JpaRepository<Room, Long> {
	
}
