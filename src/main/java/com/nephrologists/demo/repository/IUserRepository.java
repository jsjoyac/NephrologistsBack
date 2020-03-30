package com.nephrologists.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nephrologists.demo.model.UserModel;


@Repository
public interface IUserRepository extends CrudRepository<UserModel, Long>{
		
}
