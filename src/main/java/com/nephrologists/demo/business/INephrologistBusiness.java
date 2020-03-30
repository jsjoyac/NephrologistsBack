package com.nephrologists.demo.business;

import java.util.List;

import com.nephrologists.demo.dto.NephrologistDTO;

public interface INephrologistBusiness {

	public NephrologistDTO guardarNefrologo(NephrologistDTO NephrologistDTO);
	
	public List<NephrologistDTO> consultarNefrologos();
	
	public NephrologistDTO consultarNefrologo(Long id);	
	
}
