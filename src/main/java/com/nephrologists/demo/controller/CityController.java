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

import com.nephrologists.demo.business.ICityBusiness;
import com.nephrologists.demo.dto.CityDTO;


@RestController
@RequestMapping(value="/city")
@CrossOrigin("*")
public class CityController {
		
	private ICityBusiness iCityBusiness;
	
	@Autowired
	public CityController(ICityBusiness CityBusiness) {
		super();
		this.iCityBusiness = CityBusiness;
	}

	@GetMapping(value="/consultar/ciudades")
	public List<CityDTO> findAll() {
		return iCityBusiness.consultarCiudades();		 
	}

	@GetMapping(value="/buscar/{id}")
	public ResponseEntity<CityDTO> findById(@PathVariable("id") Long id) {
		return new ResponseEntity<CityDTO>(iCityBusiness.consultarCiudad(id), HttpStatus.OK);
	}
	
	@PostMapping(value="/guardar")
	public ResponseEntity<CityDTO> saveCity(@RequestBody CityDTO CityDTO) {
		return new ResponseEntity<CityDTO>(iCityBusiness.guardarCiudad(CityDTO), HttpStatus.OK);
	}
	
}
