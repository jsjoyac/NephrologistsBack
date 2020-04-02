package com.nephrologists.demo.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nephrologists.demo.business.IUserBusiness;
import com.nephrologists.demo.dto.UserDTO;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


@RestController
//@RequestMapping(value="/user")
//@CrossOrigin("*")
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
	
	@GetMapping(value="/buscarPorLogin/{login}")
	public ResponseEntity<UserDTO> findByLogin(@PathVariable("login") String login) {
		return new ResponseEntity<UserDTO>(iUserBusiness.consultarUsuarioPorLogin(login), HttpStatus.OK);
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
	
	/**
	 * Funcion para Login - Implementacion JWT
	 * */
	@PostMapping("user")
	public UserDTO login(@RequestParam("user") String username, 
			@RequestParam("password") String pwd) {
		
		UserDTO user = new UserDTO();
		String token = null;
		if(username!=null && !username.isEmpty() && 
				pwd!=null && !pwd.isEmpty()) {			
			if(iUserBusiness.consultarUsuarioPorLogin(username)!=null) {				
				token = getJWTToken(username);		
				user.setLogin(username);
				user.setPassword(token);
			}else {
				user.setError("Usuario no existe en BD!");
			}
		}else {
			user.setError("Es necesario ingresar usuario y password!");
		}
		return user;
		
	}

	private String getJWTToken(String username) {
		String secretKey = "12345Key";
//		List grantedAuthorities = AuthorityUtils
//				.commaSeparatedStringToAuthorityList("ROLE_USER");
		
		String token = Jwts
				.builder()
				.setId("idJWT")
				.setSubject(username)
//				.claim("authorities",
//						grantedAuthorities.stream().map(GrantedAuthority::getAuthority)
//								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		return "Bearer " + token;
	}
	
	
}
