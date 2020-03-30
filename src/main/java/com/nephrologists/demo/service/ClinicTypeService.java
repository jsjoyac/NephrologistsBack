package com.nephrologists.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nephrologists.demo.model.ClinicTypeModel;
import com.nephrologists.demo.repository.IClinicTypeRepository;
import com.nephrologists.demo.service.interfaces.IClinicTypeService;

@Component
public class ClinicTypeService implements IClinicTypeService{
		
	private IClinicTypeRepository repository;	
	
	@Autowired
	public ClinicTypeService(IClinicTypeRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<ClinicTypeModel> findAll() {
		return (List<ClinicTypeModel>) repository.findAll();
	}

	@Override
	public ClinicTypeModel findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public ClinicTypeModel save(ClinicTypeModel entity) {
		return repository.save(entity);
	}

	@Override
	public Boolean deleteById(Long id) {
		Boolean rta=true;
		try {
			repository.deleteById(id);
		}catch(Exception e) {
			e.getMessage();
			rta=false;
		}
		return rta;
	}

}
