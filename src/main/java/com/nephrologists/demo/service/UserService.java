package com.nephrologists.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nephrologists.demo.model.UserModel;
import com.nephrologists.demo.repository.IUserRepository;
import com.nephrologists.demo.service.interfaces.IUserService;

@Component
public class UserService implements IUserService{
		
	private IUserRepository repository;	
	
	@Autowired
	public UserService(IUserRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<UserModel> findAll() {
		return (List<UserModel>) repository.findAll();
	}

	@Override
	public UserModel findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public UserModel save(UserModel entity) {
		return repository.save(entity);
	}

	@Override
	public Boolean deleteById(Long id) {
		Boolean rta=true;
		try {
			repository.deleteById(id);
		}catch(Exception e) {
			e.getMessage();
			rta=false;
		}
		return rta;
	}

}
