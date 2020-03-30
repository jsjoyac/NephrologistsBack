package com.nephrologists.demo.business.facade;

import java.util.ArrayList;
import java.util.List;

import com.nephrologists.demo.dto.UserDTO;
import com.nephrologists.demo.model.UserModel;

public class UserFacade {
	
	public UserModel obtenerUserModel(UserDTO userDTO) {

		UserModel userModel = new UserModel();
		userModel.setId(userDTO.getId());
		userModel.setLogin(userDTO.getLogin());
		userModel.setPassword(userDTO.getPassword());
		userModel.setEmail(userDTO.getEmail());
		
		return userModel;
	}
	
	
	public UserDTO obtenerUserDTO(UserModel userModel) {

		UserDTO userDTO = new UserDTO();
		userDTO.setId(userModel.getId());
		userDTO.setLogin(userModel.getLogin());
		userDTO.setPassword(userModel.getPassword());
		userDTO.setEmail(userModel.getEmail());
		
		return userDTO;
	}
	
	public List<UserDTO> obtenerUserDtoList(List<UserModel> userModelLst) {

		List<UserDTO> lstUserDTO = new ArrayList<>();
		userModelLst.stream().forEach(a -> {
			UserDTO userDTO = new UserDTO();
			userDTO.setId(a.getId());
			userDTO.setLogin(a.getLogin());
			userDTO.setPassword(a.getPassword());
			userDTO.setEmail(a.getEmail());
			lstUserDTO.add(userDTO);
		}); 
		
		return lstUserDTO;
	}
}
