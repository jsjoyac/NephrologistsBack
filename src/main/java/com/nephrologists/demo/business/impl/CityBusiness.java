package com.nephrologists.demo.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nephrologists.demo.business.ICityBusiness;
import com.nephrologists.demo.business.facade.CityFacade;
import com.nephrologists.demo.dto.CityDTO;
import com.nephrologists.demo.model.CityModel;
import com.nephrologists.demo.service.interfaces.ICityService;


@Service
public class CityBusiness implements ICityBusiness{
	
	
	private ICityService iCityService;
	
	@Autowired
	public CityBusiness(ICityService CityService) {
		super();
		this.iCityService = CityService;		
	}

	@Override
	public List<CityDTO> consultarCiudades() {		
		CityFacade cityFacade = new CityFacade();
		return cityFacade.obtenerCityDtoList(iCityService.findAll());		 
	}
	
	@Override
	public CityDTO consultarCiudad(Long id) {
		CityFacade cityFacade = new CityFacade();
		return cityFacade.obtenerCityDTO(iCityService.findById(id));		
	}

	@Override
	public CityDTO guardarCiudad(CityDTO cityDTO) {
		CityFacade cityFacade = new CityFacade();
		CityModel cityModel = iCityService.save(cityFacade.obtenerCityModel(cityDTO));
		return cityFacade.obtenerCityDTO(cityModel);
	}


	
	
}
