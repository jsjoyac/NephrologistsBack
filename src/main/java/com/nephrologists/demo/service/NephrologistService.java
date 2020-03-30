package com.nephrologists.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nephrologists.demo.model.NephrologistModel;
import com.nephrologists.demo.repository.INephrologistRepository;
import com.nephrologists.demo.service.interfaces.INephrologistService;

@Component
public class NephrologistService implements INephrologistService{
	
	
	private INephrologistRepository repository;
	
	
	@Autowired
	public NephrologistService(INephrologistRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<NephrologistModel> findAll() {
		return (List<NephrologistModel>) repository.findAll();
	}

	@Override
	public NephrologistModel findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public NephrologistModel save(NephrologistModel entity) {
		return repository.save(entity);
	}

}
