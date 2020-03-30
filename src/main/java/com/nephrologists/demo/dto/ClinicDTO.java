package com.nephrologists.demo.dto;

import java.math.BigInteger;


public class ClinicDTO {
	

	private Long id;
	private String name;
	private String administrator;
	private String email;
	private String director;
	private Long idCity;
	private BigInteger capacity;
	private Long idClinicType;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdministrator() {
		return administrator;
	}
	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Long getIdCity() {
		return idCity;
	}
	public void setIdCity(Long idCity) {
		this.idCity = idCity;
	}
	public BigInteger getCapacity() {
		return capacity;
	}
	public void setCapacity(BigInteger capacity) {
		this.capacity = capacity;
	}
	public Long getIdClinicType() {
		return idClinicType;
	}
	public void setIdClinicType(Long idClinicType) {
		this.idClinicType = idClinicType;
	}
	
	
	
}
