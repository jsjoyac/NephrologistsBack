package com.nephrologists.demo.business.facade;

import java.util.ArrayList;
import java.util.List;

import com.nephrologists.demo.dto.NephrologistBaseClinicDTO;
import com.nephrologists.demo.model.NephrologistBaseClinicModel;

public class NephrologistBaseClinicFacade {
	
	public NephrologistBaseClinicModel obtenerNephrologistBaseClinicModel(NephrologistBaseClinicDTO nephrologistBaseClinicDTO) {

		NephrologistBaseClinicModel nephrologistBaseClinicModel = new NephrologistBaseClinicModel();
		nephrologistBaseClinicModel.setId(nephrologistBaseClinicDTO.getId());
		nephrologistBaseClinicModel.setIdNephrologist(nephrologistBaseClinicDTO.getIdNephrologist());
		nephrologistBaseClinicModel.setIdClinic(nephrologistBaseClinicDTO.getIdClinic());
		nephrologistBaseClinicModel.setSalary(nephrologistBaseClinicDTO.getSalary());
		nephrologistBaseClinicModel.setDedicationHours(nephrologistBaseClinicDTO.getDedicationHours());
		
		return nephrologistBaseClinicModel;
	}
	
	
	public NephrologistBaseClinicDTO obtenerNephrologistBaseClinicDTO(NephrologistBaseClinicModel nephrologistBaseClinicModel) {

		NephrologistBaseClinicDTO nephrologistBaseClinicDTO = new NephrologistBaseClinicDTO();
		nephrologistBaseClinicDTO.setId(nephrologistBaseClinicModel.getId());
		nephrologistBaseClinicDTO.setIdNephrologist(nephrologistBaseClinicModel.getIdNephrologist());
		nephrologistBaseClinicDTO.setIdClinic(nephrologistBaseClinicModel.getIdClinic());
		nephrologistBaseClinicDTO.setSalary(nephrologistBaseClinicModel.getSalary());
		nephrologistBaseClinicDTO.setDedicationHours(nephrologistBaseClinicModel.getDedicationHours());
		
		return nephrologistBaseClinicDTO;
	}
	
	public List<NephrologistBaseClinicDTO> obtenerNephrologistBaseClinicDTOList(List<NephrologistBaseClinicModel> nephrologistBaseClinicModelLst) {

		List<NephrologistBaseClinicDTO> lstNephrologistBaseClinicDTO = new ArrayList<>();
		nephrologistBaseClinicModelLst.stream().forEach(a -> {
			NephrologistBaseClinicDTO nephrologistBaseClinicDTO = new NephrologistBaseClinicDTO();
			nephrologistBaseClinicDTO.setId(a.getId());
			nephrologistBaseClinicDTO.setIdNephrologist(a.getIdNephrologist());
			nephrologistBaseClinicDTO.setIdClinic(a.getIdClinic());
			nephrologistBaseClinicDTO.setSalary(a.getSalary());
			nephrologistBaseClinicDTO.setDedicationHours(a.getDedicationHours());
			lstNephrologistBaseClinicDTO.add(nephrologistBaseClinicDTO);
		}); 
		
		return lstNephrologistBaseClinicDTO;
	}
	
}
