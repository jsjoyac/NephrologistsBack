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

import com.nephrologists.demo.business.IZoneBusiness;
import com.nephrologists.demo.dto.ZoneDTO;


@RestController
@RequestMapping(value="/zone")
@CrossOrigin("*")
public class ZoneController {
		
	private IZoneBusiness iZoneBusiness;
	
	@Autowired
	public ZoneController(IZoneBusiness ZoneBusiness) {
		super();
		this.iZoneBusiness = ZoneBusiness;
	}

	@GetMapping(value="/consultar/zonas")
	public List<ZoneDTO> findAll() {
		return iZoneBusiness.consultarZonas();		 
	}

	@GetMapping(value="/buscar/{id}")
	public ResponseEntity<ZoneDTO> findById(@PathVariable("id") Long id) {
		return new ResponseEntity<ZoneDTO>(iZoneBusiness.consultarZona(id), HttpStatus.OK);
	}
	
	@PostMapping(value="/guardar")
	public ResponseEntity<ZoneDTO> saveZone(@RequestBody ZoneDTO ZoneDTO) {
		return new ResponseEntity<ZoneDTO>(iZoneBusiness.guardarZona(ZoneDTO), HttpStatus.OK);
	}
	
}
