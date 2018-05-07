package com.hcmut.roomie.dal;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcmut.roomie.entity.Location;
@Repository
public interface LocationDAO extends JpaRepository<Location, Long> {
	Optional<Location> findByCoordinate(String coordinate);
}
