package com.hcmut.roomie.dal;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcmut.roomie.entity.User;
@Repository
public interface UserDAO extends JpaRepository<User, Long>{
	Optional<User> findByEmail(String email);
}
