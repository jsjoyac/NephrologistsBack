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

import com.nephrologists.demo.business.INephrologistTypeBusiness;
import com.nephrologists.demo.dto.NephrologistTypeDTO;


@RestController
@RequestMapping(value="/nephrologisttype")
@CrossOrigin("*")
public class NephrologistTypeController {
		
	private INephrologistTypeBusiness iNephrologistTypeBusiness;
	
	@Autowired
	public NephrologistTypeController(INephrologistTypeBusiness NephrologistTypeBusiness) {
		super();
		this.iNephrologistTypeBusiness = NephrologistTypeBusiness;
	}

	@GetMapping(value="/consultar/tiposNefrologos")
	public List<NephrologistTypeDTO> findAll() {
		return iNephrologistTypeBusiness.consultarTipoNefrologos();		 
	}

	@GetMapping(value="/buscar/{id}")
	public ResponseEntity<NephrologistTypeDTO> findById(@PathVariable("id") Long id) {
		return new ResponseEntity<NephrologistTypeDTO>(
				iNephrologistTypeBusiness.consultarTipoNefrologo(id), HttpStatus.OK);
	}
	
	@PostMapping(value="/guardar")
	public ResponseEntity<NephrologistTypeDTO> saveNephrologistType(
			@RequestBody NephrologistTypeDTO NephrologistTypeDTO) {
		return new ResponseEntity<NephrologistTypeDTO>(iNephrologistTypeBusiness.
				guardarTipoNefrologo(NephrologistTypeDTO), HttpStatus.OK);
	}
	
	@GetMapping(value="/borrar/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
		String rta="";
		if(iNephrologistTypeBusiness.borrarTipoNefrologo(id)) {
			rta="Borrado exitoso para el id: "+id;
		}else {
			rta="Error en el Borrado para el id: "+id;
		}
		return new ResponseEntity<String>(rta, HttpStatus.OK);
	}
}
