package com.hcmut.roomie.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcmut.roomie.entity.Rate;
@Repository
public interface RateDAO extends JpaRepository<Rate, Long>{

}
