package com.nephrologists.demo.business;

import java.util.List;

import com.nephrologists.demo.dto.ClinicDTO;

public interface IClinicBusiness {

	public ClinicDTO guardarClinica(ClinicDTO ClinicDTO);
	
	public List<ClinicDTO> consultarClinicas();
	
	public ClinicDTO consultarClinica(Long id);	
	
}
