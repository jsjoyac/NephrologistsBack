package com.nephrologists.demo.service.interfaces;

import java.util.List;

import com.nephrologists.demo.model.NephrologistBaseClinicModel;

public interface INephrologistBaseClinicService {

	public List<NephrologistBaseClinicModel> findAll();
	public NephrologistBaseClinicModel findById(Long id);
	public NephrologistBaseClinicModel save(NephrologistBaseClinicModel entity);
	

}
