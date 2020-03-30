package com.nephrologists.demo.dto;

public class NephrologistDTO {
	
	private Long id;
	private String name;
	private Long idNephrologistType;
	private String email;
	private Boolean active;
	
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
	public Long getIdNephrologistType() {
		return idNephrologistType;
	}
	public void setIdNephrologistType(Long idNephrologistType) {
		this.idNephrologistType = idNephrologistType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
	
}
