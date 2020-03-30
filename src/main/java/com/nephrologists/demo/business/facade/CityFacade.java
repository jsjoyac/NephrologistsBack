package com.nephrologists.demo.business.facade;

import java.util.ArrayList;
import java.util.List;

import com.nephrologists.demo.dto.CityDTO;
import com.nephrologists.demo.model.CityModel;

public class CityFacade {
	
	
	public CityModel obtenerCityModel(CityDTO cityDTO) {

		CityModel cityModel = new CityModel();
		cityModel.setId(cityDTO.getId());
		cityModel.setDescription(cityDTO.getDescription());
		cityModel.setIdZone(cityDTO.getIdZone());
		
		return cityModel;
	}
	
	
	public CityDTO obtenerCityDTO(CityModel cityModel) {

		CityDTO cityDTO = new CityDTO();
		cityDTO.setId(cityModel.getId());
		cityDTO.setDescription(cityModel.getDescription());
		cityDTO.setIdZone(cityModel.getIdZone());
		
		return cityDTO;
	}
	
	public List<CityDTO> obtenerCityDtoList(List<CityModel> cityModel) {

		List<CityDTO> lstCityDTO = new ArrayList<>();
		cityModel.stream().forEach(a -> {
			CityDTO cityDTO = new CityDTO();
			cityDTO.setId(a.getId());
			cityDTO.setDescription(a.getDescription());
			cityDTO.setIdZone(a.getIdZone());
			lstCityDTO.add(cityDTO);
		}); 
		
		return lstCityDTO;
	}
	
	
}
