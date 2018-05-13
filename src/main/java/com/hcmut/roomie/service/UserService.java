package com.hcmut.roomie.service;

import com.hcmut.roomie.dto.UserCreateDTO;
import com.hcmut.roomie.dto.UserDetailsDTO;
import com.hcmut.roomie.dto.UserLoginDTO;

public interface UserService {
	public UserDetailsDTO createUser(UserCreateDTO userCreateDTO);

	public UserDetailsDTO updateUser(UserDetailsDTO userDetailsDTO);

	public UserDetailsDTO getUser(Long uid);
	public Long loginUser(UserLoginDTO userLoginDTO);
}
