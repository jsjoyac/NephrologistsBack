package com.nephrologists.demo.service.interfaces;

import java.util.List;

import com.nephrologists.demo.model.CityModel;

public interface ICityService {
	
	public List<CityModel> findAll();
	public CityModel findById(Long id);
	public CityModel save(CityModel entity);
	public Boolean deleteById(Long id);
	
}
 
 
 
 
 
 
 
 