package com.nephrologists.demo.business.facade;

import java.util.ArrayList;
import java.util.List;

import com.nephrologists.demo.dto.ClinicTypeDTO;
import com.nephrologists.demo.model.ClinicTypeModel;

public class ClinicTypeFacade {
	
	public ClinicTypeModel obtenerClinicTypeModel(ClinicTypeDTO clinicTypeDTO) {

		ClinicTypeModel clinicTypeModel = new ClinicTypeModel();
		clinicTypeModel.setId(clinicTypeDTO.getId());
		clinicTypeModel.setDescription(clinicTypeDTO.getDescription());
		
		return clinicTypeModel;
	}
	
	
	public ClinicTypeDTO obtenerClinicTypeDTO(ClinicTypeModel clinicTypeModel) {

		ClinicTypeDTO clinicTypeDTO = new ClinicTypeDTO();
		clinicTypeDTO.setId(clinicTypeModel.getId());
		clinicTypeDTO.setDescription(clinicTypeModel.getDescription());
		
		return clinicTypeDTO;
	}
	
	public List<ClinicTypeDTO> obtenerClinicTypeDtoList(List<ClinicTypeModel> clinicTypeModelLst) {

		List<ClinicTypeDTO> lstClinicTypeDTO = new ArrayList<>();
		clinicTypeModelLst.stream().forEach(a -> {
			
			ClinicTypeDTO clinicTypeDTO = new ClinicTypeDTO();
			clinicTypeDTO.setId(a.getId());
			clinicTypeDTO.setDescription(a.getDescription());
			
			lstClinicTypeDTO.add(clinicTypeDTO);
		}); 
		
		return lstClinicTypeDTO;
	}
	
	
}
