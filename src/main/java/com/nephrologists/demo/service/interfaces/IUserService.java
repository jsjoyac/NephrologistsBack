package com.nephrologists.demo.service.interfaces;

import java.util.List;

import com.nephrologists.demo.model.UserModel;

public interface IUserService {

	public List<UserModel> findAll();
	public UserModel findById(Long id);
	public UserModel save(UserModel entity);
	

}
