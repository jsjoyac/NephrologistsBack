package com.nephrologists.demo.business;

import java.util.List;

import com.nephrologists.demo.dto.NephrologistTypeDTO;

public interface INephrologistTypeBusiness {

	public NephrologistTypeDTO guardarTipoNefrologo(NephrologistTypeDTO NephrologistTypeDTO);
	
	public List<NephrologistTypeDTO> consultarTipoNefrologos();
	
	public NephrologistTypeDTO consultarTipoNefrologo(Long id);	

	public Boolean borrarTipoNefrologo(Long id);	
}
