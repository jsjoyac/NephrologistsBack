package com.nephrologists.demo.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nephrologists.demo.business.INephrologistBusiness;
import com.nephrologists.demo.business.facade.NephrologistFacade;
import com.nephrologists.demo.dto.NephrologistDTO;
import com.nephrologists.demo.model.NephrologistModel;
import com.nephrologists.demo.service.interfaces.INephrologistService;


@Service
public class NephrologistBusiness implements INephrologistBusiness{
		
	private INephrologistService iNephrologistService;
	
	@Autowired
	public NephrologistBusiness(INephrologistService NephrologistService) {
		super();
		this.iNephrologistService = NephrologistService;		
	}

	@Override
	public List<NephrologistDTO> consultarNefrologos() {		
		NephrologistFacade NephrologistFacade = new NephrologistFacade();
		return NephrologistFacade.obtenerNephrologistDtoList(iNephrologistService.findAll());		 
	}
	
	@Override
	public NephrologistDTO consultarNefrologo(Long id) {
		NephrologistFacade NephrologistFacade = new NephrologistFacade();
		return NephrologistFacade.obtenerNephrologistDTO(iNephrologistService.findById(id));		
	}

	@Override
	public NephrologistDTO guardarNefrologo(NephrologistDTO NephrologistDTO) {
		NephrologistFacade NephrologistFacade = new NephrologistFacade();
		NephrologistModel NephrologistModel = iNephrologistService.save(NephrologistFacade.obtenerNephrologistModel(NephrologistDTO));
		return NephrologistFacade.obtenerNephrologistDTO(NephrologistModel);
	}
	
}
