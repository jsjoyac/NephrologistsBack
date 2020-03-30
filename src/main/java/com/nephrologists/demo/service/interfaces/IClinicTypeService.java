package com.nephrologists.demo.service.interfaces;

import java.util.List;

import com.nephrologists.demo.model.ClinicTypeModel;

public interface IClinicTypeService {

	public List<ClinicTypeModel> findAll();
	public ClinicTypeModel findById(Long id);
	public ClinicTypeModel save(ClinicTypeModel entity);
	public Boolean deleteById(Long id);
	
}
