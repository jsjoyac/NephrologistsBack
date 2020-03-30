package com.nephrologists.demo.service.interfaces;

import java.util.List;

import com.nephrologists.demo.model.NephrologistTypeModel;

public interface INephrologistTypeService {

	public List<NephrologistTypeModel> findAll();
	public NephrologistTypeModel findById(Long id);
	public NephrologistTypeModel save(NephrologistTypeModel entity);
	

}
