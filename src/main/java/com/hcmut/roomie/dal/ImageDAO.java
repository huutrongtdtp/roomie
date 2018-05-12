package com.hcmut.roomie.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcmut.roomie.entity.Image;
@Repository
public interface ImageDAO extends JpaRepository<Image, Long> {
	public List<Image> findByRoomRid(Long rid);
}
