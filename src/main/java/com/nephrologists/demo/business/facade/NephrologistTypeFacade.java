package com.nephrologists.demo.business.facade;

import java.util.ArrayList;
import java.util.List;

import com.nephrologists.demo.dto.NephrologistTypeDTO;
import com.nephrologists.demo.model.NephrologistTypeModel;

public class NephrologistTypeFacade {
	
	public NephrologistTypeModel obtenerNephrologistTypeModel(NephrologistTypeDTO nephrologistTypeDTO) {
		NephrologistTypeModel nephrologistTypeModel = new NephrologistTypeModel();
		nephrologistTypeModel.setId(nephrologistTypeDTO.getId());
		nephrologistTypeModel.setDescription(nephrologistTypeDTO.getDescription());
		return nephrologistTypeModel;
	}
	
	
	public NephrologistTypeDTO obtenerNephrologistTypeDTO(NephrologistTypeModel nephrologistTypeModel) {
		NephrologistTypeDTO nephrologistTypeDTO = new NephrologistTypeDTO();
		nephrologistTypeDTO.setId(nephrologistTypeModel.getId());
		nephrologistTypeDTO.setDescription(nephrologistTypeModel.getDescription());		
		return nephrologistTypeDTO;
	}
	
	public List<NephrologistTypeDTO> obtenerNephrologistTypeDTOList(List<NephrologistTypeModel> nephrologistTypeModelLst) {
		List<NephrologistTypeDTO> lstNephrologistTypeDTO = new ArrayList<>();
		nephrologistTypeModelLst.stream().forEach(a -> {
			NephrologistTypeDTO nephrologistTypeDTO = new NephrologistTypeDTO();
			nephrologistTypeDTO.setId(a.getId());
			nephrologistTypeDTO.setDescription(a.getDescription());
			lstNephrologistTypeDTO.add(nephrologistTypeDTO);
		}); 		
		return lstNephrologistTypeDTO;
	}
}
