package com.nephrologists.demo.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nephrologist_base_clinic")
public class NephrologistBaseClinicModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="id_nephrologist")
	private Long idNephrologist; 
	
	@Column(name="id_clinic")
	private Long idClinic;
	
	@Column(name="salary")
	private BigDecimal salary;
	
	@Column(name="dedicationHours")
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
