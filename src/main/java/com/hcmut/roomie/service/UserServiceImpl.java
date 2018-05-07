package com.hcmut.roomie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;

import com.hcmut.roomie.dal.UserDAO;
import com.hcmut.roomie.dto.UserCreateDTO;
import com.hcmut.roomie.dto.UserDetailsDTO;
import com.hcmut.roomie.dto.UserLoginDTO;
import com.hcmut.roomie.entity.User;
import com.hcmut.roomie.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserDAO userDAO;

	@Override
	public UserDetailsDTO createUser(UserCreateDTO userCreateDTO) {
		if(userDAO.findByEmail(userCreateDTO.getEmail()).isPresent()) throw new HttpServerErrorException(HttpStatus.NOT_ACCEPTABLE, "Already registered email");
		return userMapper.userToUserDetailsDTO(userDAO.save(userMapper.userCreateDTOTOUser(userCreateDTO)));
	}

	@Override
	public UserDetailsDTO getUser(Long uid) {
		return userMapper.userToUserDetailsDTO(userDAO.findById(uid)
				.orElseThrow(() -> new HttpServerErrorException(HttpStatus.NOT_FOUND, "User not found")));
	}

	@Override
	public UserDetailsDTO updateUser(UserDetailsDTO userDetailsDTO) {
		User user = userDAO.findById(userDetailsDTO.getUid())
				.orElseThrow(() -> new HttpServerErrorException(HttpStatus.NOT_FOUND, "User not existing"));
		userMapper.updateUserFromUserDetails(user, userDetailsDTO);
		return userMapper.userToUserDetailsDTO(userDAO.save(user));
	}

	@Override
	public UserLoginDTO loginUser(UserLoginDTO userLoginDTO) {
		User user = userDAO.findByEmail(userLoginDTO.getEmail()).orElseThrow(() -> new HttpServerErrorException(HttpStatus.NOT_FOUND, "User not existing"));
		if (!user.getPassword().equals(userLoginDTO.getPassword()))
			throw new HttpServerErrorException(HttpStatus.NOT_ACCEPTABLE, "Wrong password");
		return userLoginDTO;
	}

}
