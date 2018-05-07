package com.hcmut.roomie.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcmut.roomie.entity.Subcription;
@Repository
public interface SubcriptionDAO extends JpaRepository<Subcription, Long>{

}
