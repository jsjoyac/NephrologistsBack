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

import com.nephrologists.demo.business.INephrologistBusiness;
import com.nephrologists.demo.dto.NephrologistDTO;


@RestController
@RequestMapping(value="/nephrologist")
@CrossOrigin("*")
public class NephrologistController {
		
	private INephrologistBusiness iNephrologistBusiness;
	
	@Autowired
	public NephrologistController(INephrologistBusiness NephrologistBusiness) {
		super();
		this.iNephrologistBusiness = NephrologistBusiness;
	}

	@GetMapping(value="/consultar/nefrologos")
	public List<NephrologistDTO> findAll() {
		return iNephrologistBusiness.consultarNefrologos();		 
	}

	@GetMapping(value="/buscar/{id}")
	public ResponseEntity<NephrologistDTO> findById(@PathVariable("id") Long id) {
		return new ResponseEntity<NephrologistDTO>(
				iNephrologistBusiness.consultarNefrologo(id), HttpStatus.OK);
	}
	
	@PostMapping(value="/guardar")
	public ResponseEntity<NephrologistDTO> saveNephrologist(
			@RequestBody NephrologistDTO NephrologistDTO) {
		return new ResponseEntity<NephrologistDTO>(iNephrologistBusiness.
				guardarNefrologo(NephrologistDTO), HttpStatus.OK);
	}
	
}
