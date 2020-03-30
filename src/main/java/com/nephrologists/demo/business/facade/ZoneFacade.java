package com.nephrologists.demo.business.facade;

import java.util.ArrayList;
import java.util.List;

import com.nephrologists.demo.dto.ZoneDTO;
import com.nephrologists.demo.model.ZoneModel;

public class ZoneFacade {
	
	public ZoneModel obtenerZoneModel(ZoneDTO zoneDTO) {

		ZoneModel zoneModel = new ZoneModel();
		zoneModel.setId(zoneDTO.getId());
		zoneModel.setDescription(zoneDTO.getDescription());
		
		return zoneModel;
	}
	
	
	public ZoneDTO obtenerZoneDTO(ZoneModel zoneModel) {

		ZoneDTO zoneDTO = new ZoneDTO();
		zoneDTO.setId(zoneModel.getId());
		zoneDTO.setDescription(zoneModel.getDescription());
		
		return zoneDTO;
	}
	
	public List<ZoneDTO> obtenerZoneDtoList(List<ZoneModel> zoneModelLst) {

		List<ZoneDTO> lstZoneDTO = new ArrayList<>();
		zoneModelLst.stream().forEach(a -> {
			ZoneDTO zoneDTO = new ZoneDTO();
			zoneDTO.setId(a.getId());
			zoneDTO.setDescription(a.getDescription());
			lstZoneDTO.add(zoneDTO);
		}); 
		
		return lstZoneDTO;
	}
}
