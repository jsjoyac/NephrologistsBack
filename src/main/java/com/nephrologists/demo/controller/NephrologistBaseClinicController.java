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

import com.nephrologists.demo.business.INephrologistBaseClinicBusiness;
import com.nephrologists.demo.dto.NephrologistBaseClinicDTO;


@RestController
@RequestMapping(value="/nephrologistbaseclinic")
@CrossOrigin("*")
public class NephrologistBaseClinicController {
		
	private INephrologistBaseClinicBusiness iNephrologistBaseClinicBusiness;
	
	@Autowired
	public NephrologistBaseClinicController(INephrologistBaseClinicBusiness NephrologistBaseClinicBusiness) {
		super();
		this.iNephrologistBaseClinicBusiness = NephrologistBaseClinicBusiness;
	}

	@GetMapping(value="/consultar/nefrologos")
	public List<NephrologistBaseClinicDTO> findAll() {
		return iNephrologistBaseClinicBusiness.consultarNefrologosBaseClinica();		 
	}

	@GetMapping(value="/buscar/{id}")
	public ResponseEntity<NephrologistBaseClinicDTO> findById(@PathVariable("id") Long id) {
		return new ResponseEntity<NephrologistBaseClinicDTO>(
				iNephrologistBaseClinicBusiness.consultarNefrologoBaseClinica(id), HttpStatus.OK);
	}
	
	@PostMapping(value="/guardar")
	public ResponseEntity<NephrologistBaseClinicDTO> saveNephrologistBaseClinic(
			@RequestBody NephrologistBaseClinicDTO NephrologistBaseClinicDTO) {
		return new ResponseEntity<NephrologistBaseClinicDTO>(iNephrologistBaseClinicBusiness.
				guardarNefrologoBaseClinica(NephrologistBaseClinicDTO), HttpStatus.OK);
	}
	
	@GetMapping(value="/borrar/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
		String rta="";
		if(iNephrologistBaseClinicBusiness.borrarNefrologoBaseClinica(id)) {
			rta="Borrado exitoso para el id: "+id;
		}else {
			rta="Error en el Borrado para el id: "+id;
		}
		return new ResponseEntity<String>(rta, HttpStatus.OK);
	}
}
