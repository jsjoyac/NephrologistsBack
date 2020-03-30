package com.nephrologists.demo.business;

import java.util.List;

import com.nephrologists.demo.dto.ClinicTypeDTO;

public interface IClinicTypeBusiness {

	public ClinicTypeDTO guardarTipoClinica(ClinicTypeDTO ClinicTypeDTO);
	
	public List<ClinicTypeDTO> consultarTipoClinicas();
	
	public ClinicTypeDTO consultarTipoClinica(Long id);	
	
	public Boolean borrarTipoClinica(Long id);	
}
