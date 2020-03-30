package com.nephrologists.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nephrologists.demo.model.NephrologistBaseClinicModel;

@Repository
public interface INephrologistBaseClinicRepository extends CrudRepository<NephrologistBaseClinicModel, Long>{		
	
}
