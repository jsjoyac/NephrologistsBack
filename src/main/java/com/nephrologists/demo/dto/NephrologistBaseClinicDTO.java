package com.nephrologists.demo.dto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class NephrologistBaseClinicDTO {
	
	private Long id;
	private Long idNephrologist; 
	private Long idClinic;
	private BigDecimal salary;
	private Integer dedicationHours;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdNephrologist() {
		return idNephrologist;
	}
	
	public void setIdNephrologist(Long idNephrologist) {
		this.idNephrologist = idNephrologist;
	}
	
	public Long getIdClinic() {
		return idClinic;
	}
	public void setIdClinic(Long idClinic) {
		this.idClinic = idClinic;
	}
	
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public Integer getDedicationHours() {
		return dedicationHours;
	}
	public void setDedicationHours(Integer dedicationHours) {
		this.dedicationHours = dedicationHours;
	}
	
	
	
}
