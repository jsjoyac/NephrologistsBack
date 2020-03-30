package com.nephrologists.demo.business.facade;

import java.util.ArrayList;
import java.util.List;

import com.nephrologists.demo.dto.NephrologistDTO;
import com.nephrologists.demo.model.NephrologistModel;

public class NephrologistFacade {
	
	public NephrologistModel obtenerNephrologistModel(NephrologistDTO nephrologistDTO) {

		NephrologistModel nephrologistModel = new NephrologistModel();
		nephrologistModel.setId(nephrologistDTO.getId());
		nephrologistModel.setName(nephrologistDTO.getName());
		nephrologistModel.setIdNephrologistType(nephrologistDTO.getIdNephrologistType());
		nephrologistModel.setEmail(nephrologistDTO.getEmail());
		nephrologistModel.setActive(nephrologistDTO.getActive());

		return nephrologistModel;
	}
	
	
	public NephrologistDTO obtenerNephrologistDTO(NephrologistModel nephrologistModel) {

		NephrologistDTO nephrologistDTO = new NephrologistDTO();
		nephrologistDTO.setId(nephrologistModel.getId());
		nephrologistDTO.setName(nephrologistModel.getName());
		nephrologistDTO.setIdNephrologistType(nephrologistModel.getIdNephrologistType());
		nephrologistDTO.setEmail(nephrologistModel.getEmail());
		nephrologistDTO.setActive(nephrologistModel.getActive());
		
		return nephrologistDTO;
	}
	
	public List<NephrologistDTO> obtenerNephrologistDtoList(List<NephrologistModel> nephrologistModelLst) {

		List<NephrologistDTO> lstNephrologistDTO = new ArrayList<>();
		nephrologistModelLst.stream().forEach(a -> {
			NephrologistDTO nephrologistDTO = new NephrologistDTO();
			nephrologistDTO.setId(a.getId());
			nephrologistDTO.setName(a.getName());
			nephrologistDTO.setIdNephrologistType(a.getIdNephrologistType());
			nephrologistDTO.setEmail(a.getEmail());
			nephrologistDTO.setActive(a.getActive());
			lstNephrologistDTO.add(nephrologistDTO);
		}); 
		
		return lstNephrologistDTO;
	}
}
