package com.nephrologists.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nephrologists.demo.model.NephrologistBaseClinicModel;
import com.nephrologists.demo.repository.INephrologistBaseClinicRepository;
import com.nephrologists.demo.service.interfaces.INephrologistBaseClinicService;

@Component
public class NephrologistBaseClinicService implements INephrologistBaseClinicService{
	
	
	private INephrologistBaseClinicRepository repository;
	
	
	@Autowired
	public NephrologistBaseClinicService(INephrologistBaseClinicRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<NephrologistBaseClinicModel> findAll() {
		return (List<NephrologistBaseClinicModel>) repository.findAll();
	}

	@Override
	public NephrologistBaseClinicModel findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public NephrologistBaseClinicModel save(NephrologistBaseClinicModel entity) {
		return repository.save(entity);
	}

}
