package com.nephrologists.demo.business;

import java.util.List;

import com.nephrologists.demo.dto.NephrologistBaseClinicDTO;

public interface INephrologistBaseClinicBusiness {

	public NephrologistBaseClinicDTO guardarNefrologoBaseClinica(NephrologistBaseClinicDTO NephrBaseClinDTO);
	
	public List<NephrologistBaseClinicDTO> consultarNefrologosBaseClinica();
	
	public NephrologistBaseClinicDTO consultarNefrologoBaseClinica(Long id);	
	
	public Boolean borrarNefrologoBaseClinica(Long id);	
}
