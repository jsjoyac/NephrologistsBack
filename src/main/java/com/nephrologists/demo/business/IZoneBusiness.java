package com.nephrologists.demo.business;

import java.util.List;

import com.nephrologists.demo.dto.ZoneDTO;

public interface IZoneBusiness {

	public ZoneDTO guardarZona(ZoneDTO ZoneDTO);
	
	public List<ZoneDTO> consultarZonas();
	
	public ZoneDTO consultarZona(Long id);	
	
}
