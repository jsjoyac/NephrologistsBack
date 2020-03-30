package com.nephrologists.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nephrologists.demo.model.ClinicTypeModel;


@Repository
public interface IClinicTypeRepository extends CrudRepository<ClinicTypeModel, Long>{
		
}
