package com.nephrologists.demo.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nephrologists.demo.business.IClinicBusiness;
import com.nephrologists.demo.business.facade.ClinicFacade;
import com.nephrologists.demo.dto.ClinicDTO;
import com.nephrologists.demo.model.ClinicModel;
import com.nephrologists.demo.service.interfaces.IClinicService;


@Service
public class ClinicBusiness implements IClinicBusiness{
		
	private IClinicService iClinicService;
	
	@Autowired
	public ClinicBusiness(IClinicService ClinicService) {
		super();
		this.iClinicService = ClinicService;		
	}

	@Override
	public List<ClinicDTO> consultarClinicas() {		
		ClinicFacade ClinicFacade = new ClinicFacade();
		return ClinicFacade.obtenerClinicDtoList(iClinicService.findAll());		 
	}
	
	@Override
	public ClinicDTO consultarClinica(Long id) {
		ClinicFacade ClinicFacade = new ClinicFacade();
		return ClinicFacade.obtenerClinicDTO(iClinicService.findById(id));		
	}

	@Override
	public ClinicDTO guardarClinica(ClinicDTO ClinicDTO) {
		ClinicFacade ClinicFacade = new ClinicFacade();
		ClinicModel ClinicModel = iClinicService.save(ClinicFacade.obtenerClinicModel(ClinicDTO));
		return ClinicFacade.obtenerClinicDTO(ClinicModel);
	}
	
}
