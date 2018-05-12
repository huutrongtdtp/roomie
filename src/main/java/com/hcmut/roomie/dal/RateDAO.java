package com.hcmut.roomie.dal;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcmut.roomie.entity.Rate;
@Repository
public interface RateDAO extends JpaRepository<Rate, Long>{
	public Optional<Rate> findByUserUidAndRoomRid(Long uid, Long rid);
	@Query("select avg(level) from Rate where rid = :rid")
	public Double getAvgRate(@Param("rid") Long rid);
}
