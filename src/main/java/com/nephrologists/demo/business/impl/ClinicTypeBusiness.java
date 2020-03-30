package com.nephrologists.demo.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nephrologists.demo.business.IClinicTypeBusiness;
import com.nephrologists.demo.business.facade.ClinicTypeFacade;
import com.nephrologists.demo.dto.ClinicTypeDTO;
import com.nephrologists.demo.model.ClinicTypeModel;
import com.nephrologists.demo.service.interfaces.IClinicTypeService;


@Service
public class ClinicTypeBusiness implements IClinicTypeBusiness{
		
	private IClinicTypeService iClinicTypeService;
	
	@Autowired
	public ClinicTypeBusiness(IClinicTypeService ClinicTypeService) {
		super();
		this.iClinicTypeService = ClinicTypeService;		
	}

	@Override
	public List<ClinicTypeDTO> consultarTipoClinicas() {		
		ClinicTypeFacade ClinicTypeFacade = new ClinicTypeFacade();
		return ClinicTypeFacade.obtenerClinicTypeDtoList(iClinicTypeService.findAll());		 
	}
	
	@Override
	public ClinicTypeDTO consultarTipoClinica(Long id) {
		ClinicTypeFacade ClinicTypeFacade = new ClinicTypeFacade();
		return ClinicTypeFacade.obtenerClinicTypeDTO(iClinicTypeService.findById(id));		
	}

	@Override
	public ClinicTypeDTO guardarTipoClinica(ClinicTypeDTO ClinicTypeDTO) {
		ClinicTypeFacade ClinicTypeFacade = new ClinicTypeFacade();
		ClinicTypeModel ClinicTypeModel = iClinicTypeService.save(
				ClinicTypeFacade.obtenerClinicTypeModel(ClinicTypeDTO));
		return ClinicTypeFacade.obtenerClinicTypeDTO(ClinicTypeModel);
	}

	@Override
	public Boolean borrarTipoClinica(Long id) {
		return iClinicTypeService.deleteById(id);	
	}
	
}
