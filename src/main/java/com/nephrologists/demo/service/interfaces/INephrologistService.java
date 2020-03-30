package com.nephrologists.demo.service.interfaces;

import java.util.List;

import com.nephrologists.demo.model.NephrologistModel;

public interface INephrologistService {
	
	public List<NephrologistModel> findAll();
	public NephrologistModel findById(Long id);
	public NephrologistModel save(NephrologistModel entity);
	public Boolean deleteById(Long id);
	
}
