package com.nephrologists.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nephrologists.demo.model.NephrologistModel;


@Repository
public interface INephrologistRepository extends CrudRepository<NephrologistModel, Long>{
		
}
