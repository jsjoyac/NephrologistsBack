package com.nephrologists.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nephrologists.demo.model.NephrologistTypeModel;
import com.nephrologists.demo.repository.INephrologistTypeRepository;
import com.nephrologists.demo.service.interfaces.INephrologistTypeService;

@Component
public class NephrologistTypeService implements INephrologistTypeService{
	
	
	private INephrologistTypeRepository repository;
	
	
	@Autowired
	public NephrologistTypeService(INephrologistTypeRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<NephrologistTypeModel> findAll() {
		return (List<NephrologistTypeModel>) repository.findAll();
	}

	@Override
	public NephrologistTypeModel findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public NephrologistTypeModel save(NephrologistTypeModel entity) {
		return repository.save(entity);
	}

}
