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

import com.nephrologists.demo.business.IClinicBusiness;
import com.nephrologists.demo.dto.ClinicDTO;


@RestController
@RequestMapping(value="/clinic")
@CrossOrigin("*")
public class ClinicController {
		
	private IClinicBusiness iClinicBusiness;
	
	@Autowired
	public ClinicController(IClinicBusiness ClinicBusiness) {
		super();
		this.iClinicBusiness = ClinicBusiness;
	}

	@GetMapping(value="/consultar/clinicas")
	public List<ClinicDTO> findAll() {
		return iClinicBusiness.consultarClinicas();		 
	}

	@GetMapping(value="/buscar/{id}")
	public ResponseEntity<ClinicDTO> findById(@PathVariable("id") Long id) {
		return new ResponseEntity<ClinicDTO>(iClinicBusiness.consultarClinica(id), HttpStatus.OK);
	}
	
	@PostMapping(value="/guardar")
	public ResponseEntity<ClinicDTO> saveClinic(@RequestBody ClinicDTO ClinicDTO) {
		return new ResponseEntity<ClinicDTO>(iClinicBusiness.
				guardarClinica(ClinicDTO), HttpStatus.OK);
	}
	
	@GetMapping(value="/borrar/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
		String rta="";
		if(iClinicBusiness.borrarClinica(id)) {
			rta="Borrado exitoso para el id: "+id;
		}else {
			rta="Error en el Borrado para el id: "+id;
		}
		return new ResponseEntity<String>(rta, HttpStatus.OK);
	}
}
