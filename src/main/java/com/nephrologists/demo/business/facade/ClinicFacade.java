package com.nephrologists.demo.business.facade;

import java.util.ArrayList;
import java.util.List;

import com.nephrologists.demo.dto.ClinicDTO;
import com.nephrologists.demo.model.ClinicModel;

public class ClinicFacade {
	
	public ClinicModel obtenerClinicModel(ClinicDTO clinicDTO) {

		ClinicModel clinicModel = new ClinicModel();
		clinicModel.setId(clinicDTO.getId());
		clinicModel.setName(clinicDTO.getName());
		clinicModel.setAdministrator(clinicDTO.getAdministrator());
		clinicModel.setEmail(clinicDTO.getEmail());
		clinicModel.setDirector(clinicDTO.getDirector());
		clinicModel.setIdCity(clinicDTO.getIdCity());
		clinicModel.setCapacity(clinicDTO.getCapacity());
		clinicModel.setIdClinicType(clinicDTO.getIdClinicType());
		
		return clinicModel;
	}
	
	
	public ClinicDTO obtenerClinicDTO(ClinicModel clinicModel) {

		ClinicDTO clinicDTO = new ClinicDTO();
		clinicDTO.setId(clinicModel.getId());
		clinicDTO.setName(clinicModel.getName());
		clinicDTO.setAdministrator(clinicModel.getAdministrator());
		clinicDTO.setEmail(clinicModel.getEmail());
		clinicDTO.setDirector(clinicModel.getDirector());
		clinicDTO.setIdCity(clinicModel.getIdCity());
		clinicDTO.setCapacity(clinicModel.getCapacity());
		clinicDTO.setIdClinicType(clinicModel.getIdClinicType());
		
		return clinicDTO;
	}
	
	public List<ClinicDTO> obtenerClinicDtoList(List<ClinicModel> clinicModel) {

		List<ClinicDTO> lstClinicDTO = new ArrayList<>();
		
		clinicModel.stream().forEach(a -> {
			ClinicDTO clinicDTO = new ClinicDTO();
			clinicDTO.setId(a.getId());
			clinicDTO.setName(a.getName());
			clinicDTO.setAdministrator(a.getAdministrator());
			clinicDTO.setEmail(a.getEmail());
			clinicDTO.setDirector(a.getDirector());
			clinicDTO.setIdCity(a.getIdCity());
			clinicDTO.setCapacity(a.getCapacity());
			clinicDTO.setIdClinicType(a.getIdClinicType());
			lstClinicDTO.add(clinicDTO);
		}); 
		
		return lstClinicDTO;
	}
	
}
