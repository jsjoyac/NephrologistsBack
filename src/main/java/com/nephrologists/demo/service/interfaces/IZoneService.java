package com.nephrologists.demo.service.interfaces;

import java.util.List;

import com.nephrologists.demo.model.ZoneModel;

public interface IZoneService {
	
	public List<ZoneModel> findAll();
	public ZoneModel findById(Long id);
	public ZoneModel save(ZoneModel entity);
	
}
