package com.nephrologists.demo.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nephrologists.demo.business.IUserBusiness;
import com.nephrologists.demo.business.facade.UserFacade;
import com.nephrologists.demo.dto.UserDTO;
import com.nephrologists.demo.model.UserModel;
import com.nephrologists.demo.service.interfaces.IUserService;


@Service
public class UserBusiness implements IUserBusiness{
		
	private IUserService iUserService;
	
	@Autowired
	public UserBusiness(IUserService userService) {
		super();
		this.iUserService = userService;		
	}

	@Override
	public List<UserDTO> consultarUsuarios() {		
		UserFacade UserFacade = new UserFacade();
		return UserFacade.obtenerUserDtoList(iUserService.findAll());		 
	}
	
	@Override
	public UserDTO consultarUsuario(Long id) {
		UserFacade UserFacade = new UserFacade();
		return UserFacade.obtenerUserDTO(iUserService.findById(id));		
	}

	@Override
	public UserDTO guardarUsuario(UserDTO UserDTO) {
		UserFacade UserFacade = new UserFacade();
		UserModel UserModel = iUserService.save(UserFacade.obtenerUserModel(UserDTO));
		return UserFacade.obtenerUserDTO(UserModel);
	}

	@Override
	public Boolean borrarUsuario(Long id) {
		return iUserService.deleteById(id);	
	}
	
}
