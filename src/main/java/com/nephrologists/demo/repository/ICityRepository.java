package com.nephrologists.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nephrologists.demo.model.CityModel;


@Repository
public interface ICityRepository extends CrudRepository<CityModel, Long>{
	
}
