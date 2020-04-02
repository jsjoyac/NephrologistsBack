package com.nephrologists.demo.business;

import java.util.List;

import com.nephrologists.demo.dto.UserDTO;

public interface IUserBusiness {

	public UserDTO guardarUsuario(UserDTO UserDTO);
	
	public List<UserDTO> consultarUsuarios();
	
	public UserDTO consultarUsuario(Long id);	
	
	public UserDTO consultarUsuarioPorLogin(String login);
	
	public Boolean borrarUsuario(Long id);	
}
