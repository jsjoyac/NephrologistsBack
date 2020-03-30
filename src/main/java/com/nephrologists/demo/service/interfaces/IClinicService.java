package com.nephrologists.demo.service.interfaces;

import java.util.List;

import com.nephrologists.demo.model.ClinicModel;

public interface IClinicService {
	
	public List<ClinicModel> findAll();
	public ClinicModel findById(Long id);
	public ClinicModel save(ClinicModel entity);
	public Boolean deleteById(Long id);	
}
