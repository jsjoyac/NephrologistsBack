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

import com.nephrologists.demo.business.IClinicTypeBusiness;
import com.nephrologists.demo.dto.ClinicTypeDTO;


@RestController
@RequestMapping(value="/clinictype")
@CrossOrigin("*")
public class ClinicTypeController {
		
	private IClinicTypeBusiness iClinicTypeBusiness;
	
	@Autowired
	public ClinicTypeController(IClinicTypeBusiness ClinicTypeBusiness) {
		super();
		this.iClinicTypeBusiness = ClinicTypeBusiness;
	}

	@GetMapping(value="/consultar/tiposclinica")
	public List<ClinicTypeDTO> findAll() {
		return iClinicTypeBusiness.consultarTipoClinicas();		 
	}

	@GetMapping(value="/buscar/{id}")
	public ResponseEntity<ClinicTypeDTO> findById(@PathVariable("id") Long id) {
		return new ResponseEntity<ClinicTypeDTO>(iClinicTypeBusiness.consultarTipoClinica(id), HttpStatus.OK);
	}
	
	@PostMapping(value="/guardar")
	public ResponseEntity<ClinicTypeDTO> saveClinicType(@RequestBody ClinicTypeDTO ClinicTypeDTO) {
		return new ResponseEntity<ClinicTypeDTO>(iClinicTypeBusiness.guardarTipoClinica(ClinicTypeDTO), HttpStatus.OK);
	}
	
}
