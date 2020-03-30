package com.nephrologists.demo.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nephrologists.demo.business.INephrologistBaseClinicBusiness;
import com.nephrologists.demo.business.facade.NephrologistBaseClinicFacade;
import com.nephrologists.demo.dto.NephrologistBaseClinicDTO;
import com.nephrologists.demo.model.NephrologistBaseClinicModel;
import com.nephrologists.demo.service.interfaces.INephrologistBaseClinicService;


@Service
public class NephrologistBaseClinicBusiness implements INephrologistBaseClinicBusiness{
		
	private INephrologistBaseClinicService iNephrologistBaseClinicService;
	
	@Autowired
	public NephrologistBaseClinicBusiness(INephrologistBaseClinicService NephrologistBaseClinicService) {
		super();
		this.iNephrologistBaseClinicService = NephrologistBaseClinicService;		
	}

	@Override
	public List<NephrologistBaseClinicDTO> consultarNefrologosBaseClinica() {		
		NephrologistBaseClinicFacade NephrologistBaseClinicFacade = new NephrologistBaseClinicFacade();
		return NephrologistBaseClinicFacade.obtenerNephrologistBaseClinicDTOList(
				iNephrologistBaseClinicService.findAll());		 
	}
	
	@Override
	public NephrologistBaseClinicDTO consultarNefrologoBaseClinica(Long id) {
		NephrologistBaseClinicFacade NephrologistBaseClinicFacade = new NephrologistBaseClinicFacade();
		return NephrologistBaseClinicFacade.obtenerNephrologistBaseClinicDTO(
				iNephrologistBaseClinicService.findById(id));		
	}

	@Override
	public NephrologistBaseClinicDTO guardarNefrologoBaseClinica(NephrologistBaseClinicDTO NephrologistBaseClinicDTO) {
		NephrologistBaseClinicFacade NephrologistBaseClinicFacade = new NephrologistBaseClinicFacade();
		NephrologistBaseClinicModel NephrologistBaseClinicModel = iNephrologistBaseClinicService.save(
				NephrologistBaseClinicFacade.obtenerNephrologistBaseClinicModel(NephrologistBaseClinicDTO));
		return NephrologistBaseClinicFacade.obtenerNephrologistBaseClinicDTO(NephrologistBaseClinicModel);
	}

	@Override
	public Boolean borrarNefrologoBaseClinica(Long id) {
		return iNephrologistBaseClinicService.deleteById(id);	
	}
	
}
