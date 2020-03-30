package com.nephrologists.demo.business;

import java.util.List;

import com.nephrologists.demo.dto.CityDTO;

public interface ICityBusiness {

	public CityDTO guardarCiudad(CityDTO cityDTO);
	
	public List<CityDTO> consultarCiudades();
	
	public CityDTO consultarCiudad(Long id);	
	
}
