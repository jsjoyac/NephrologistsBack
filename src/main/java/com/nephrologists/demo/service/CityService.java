package com.nephrologists.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nephrologists.demo.model.CityModel;
import com.nephrologists.demo.repository.ICityRepository;
import com.nephrologists.demo.service.interfaces.ICityService;

@Component
public class CityService implements ICityService{
	
	
	private ICityRepository repository;
	
	
	@Autowired
	public CityService(ICityRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<CityModel> findAll() {
		return (List<CityModel>) repository.findAll();
	}

	@Override
	public CityModel findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public CityModel save(CityModel entity) {
		return repository.save(entity);
	}

}
