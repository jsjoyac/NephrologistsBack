package com.nephrologists.demo.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nephrologists.demo.business.INephrologistTypeBusiness;
import com.nephrologists.demo.business.facade.NephrologistTypeFacade;
import com.nephrologists.demo.dto.NephrologistTypeDTO;
import com.nephrologists.demo.model.NephrologistTypeModel;
import com.nephrologists.demo.service.interfaces.INephrologistTypeService;


@Service
public class NephrologistTypeBusiness implements INephrologistTypeBusiness{
		
	private INephrologistTypeService iNephrologistTypeService;
	
	@Autowired
	public NephrologistTypeBusiness(INephrologistTypeService NephrologistTypeService) {
		super();
		this.iNephrologistTypeService = NephrologistTypeService;		
	}

	@Override
	public List<NephrologistTypeDTO> consultarTipoNefrologos() {		
		NephrologistTypeFacade NephrologistTypeFacade = new NephrologistTypeFacade();
		return NephrologistTypeFacade.obtenerNephrologistTypeDTOList(
				iNephrologistTypeService.findAll());		 
	}
	
	@Override
	public NephrologistTypeDTO consultarTipoNefrologo(Long id) {
		NephrologistTypeFacade NephrologistTypeFacade = new NephrologistTypeFacade();
		return NephrologistTypeFacade.obtenerNephrologistTypeDTO(iNephrologistTypeService.findById(id));		
	}

	@Override
	public NephrologistTypeDTO guardarTipoNefrologo(NephrologistTypeDTO NephrologistTypeDTO) {
		NephrologistTypeFacade NephrologistTypeFacade = new NephrologistTypeFacade();
		NephrologistTypeModel NephrologistTypeModel = iNephrologistTypeService.save(
				NephrologistTypeFacade.obtenerNephrologistTypeModel(NephrologistTypeDTO));
		return NephrologistTypeFacade.obtenerNephrologistTypeDTO(NephrologistTypeModel);
	}
	
}
