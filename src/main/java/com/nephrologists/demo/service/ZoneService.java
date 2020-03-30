package com.nephrologists.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nephrologists.demo.model.ZoneModel;
import com.nephrologists.demo.repository.IZoneRepository;
import com.nephrologists.demo.service.interfaces.IZoneService;

@Component
public class ZoneService implements IZoneService{
	
	
	private IZoneRepository repository;
	
	
	@Autowired
	public ZoneService(IZoneRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<ZoneModel> findAll() {
		return (List<ZoneModel>) repository.findAll();
	}

	@Override
	public ZoneModel findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public ZoneModel save(ZoneModel entity) {
		return repository.save(entity);
	}

}
