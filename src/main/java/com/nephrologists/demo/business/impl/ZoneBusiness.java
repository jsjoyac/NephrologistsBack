package com.nephrologists.demo.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nephrologists.demo.business.IZoneBusiness;
import com.nephrologists.demo.business.facade.ZoneFacade;
import com.nephrologists.demo.dto.ZoneDTO;
import com.nephrologists.demo.model.ZoneModel;
import com.nephrologists.demo.service.interfaces.IZoneService;


@Service
public class ZoneBusiness implements IZoneBusiness{
		
	private IZoneService iZoneService;
	
	@Autowired
	public ZoneBusiness(IZoneService ZoneService) {
		super();
		this.iZoneService = ZoneService;		
	}

	@Override
	public List<ZoneDTO> consultarZonas() {		
		ZoneFacade ZoneFacade = new ZoneFacade();
		return ZoneFacade.obtenerZoneDtoList(iZoneService.findAll());		 
	}
	
	@Override
	public ZoneDTO consultarZona(Long id) {
		ZoneFacade ZoneFacade = new ZoneFacade();
		return ZoneFacade.obtenerZoneDTO(iZoneService.findById(id));		
	}

	@Override
	public ZoneDTO guardarZona(ZoneDTO ZoneDTO) {
		ZoneFacade ZoneFacade = new ZoneFacade();
		ZoneModel ZoneModel = iZoneService.save(ZoneFacade.obtenerZoneModel(ZoneDTO));
		return ZoneFacade.obtenerZoneDTO(ZoneModel);
	}
	
	@Override
	public Boolean borrarZona(Long id) {
		return iZoneService.deleteById(id);		
	}
	
}
