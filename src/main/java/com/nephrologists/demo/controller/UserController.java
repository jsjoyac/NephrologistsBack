package com.nephrologists.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nephrologists.demo.business.IUserBusiness;
import com.nephrologists.demo.dto.UserDTO;


@RestController
@RequestMapping(value="/user")
@CrossOrigin("*")
public class UserController {
		
	private IUserBusiness iUserBusiness;
	
	@Autowired
	public UserController(IUserBusiness UserBusiness) {
		super();
		this.iUserBusiness = UserBusiness;
	}

	@GetMapping(value="/consultar/usuarios")
	public List<UserDTO> findAll() {
		return iUserBusiness.consultarUsuarios();		 
	}

	@GetMapping(value="/buscar/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable("id") Long id) {
		return new ResponseEntity<UserDTO>(iUserBusiness.consultarUsuario(id), HttpStatus.OK);
	}
	
	@PostMapping(value="/guardar")
	public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO UserDTO) {
		return new ResponseEntity<UserDTO>(iUserBusiness.guardarUsuario(UserDTO), HttpStatus.OK);
	}
	
	@GetMapping(value="/borrar/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
		String rta="";
		if(iUserBusiness.borrarUsuario(id)) {
			rta="Borrado exitoso para el id: "+id;
		}else {
			rta="Error en el Borrado para el id: "+id;
		}
		return new ResponseEntity<String>(rta, HttpStatus.OK);
	}
	
}
