package com.hcmut.roomie.mapper;

import org.mapstruct.Mapper;

import com.hcmut.roomie.dto.UserCreateDTO;
import com.hcmut.roomie.dto.UserDetailsDTO;
import com.hcmut.roomie.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

	UserDetailsDTO userToUserDetailsDTO(User user);

	//UserNameDTO usertoUserNameDTO(User user);

	User userDetailsDTOTOUser(UserDetailsDTO userDetailsDTO);

	//User userNameDTOToUser(UserNameDTO userNameDTO);

	User userCreateDTOTOUser(UserCreateDTO userCreateDTO);

	public default void updateUserFromUserDetails(User user, UserDetailsDTO userDetailsDTO) {
		user.setEmail(userDetailsDTO.getEmail());
		user.setFacebook(userDetailsDTO.getFacebook());
		user.setGoogle(userDetailsDTO.getGoogle());
		user.setName(userDetailsDTO.getName());
		user.setPhone(userDetailsDTO.getPhone());
	}
}
