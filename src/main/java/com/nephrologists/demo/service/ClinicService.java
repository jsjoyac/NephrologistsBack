package com.nephrologists.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nephrologists.demo.model.ClinicModel;
import com.nephrologists.demo.repository.IClinicRepository;
import com.nephrologists.demo.service.interfaces.IClinicService;

@Component
public class ClinicService implements IClinicService{
	
	
	private IClinicRepository repository;
	
	
	@Autowired
	public ClinicService(IClinicRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<ClinicModel> findAll() {
		return (List<ClinicModel>) repository.findAll();
	}

	@Override
	public ClinicModel findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public ClinicModel save(ClinicModel entity) {
		return repository.save(entity);
	}

}
