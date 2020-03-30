package com.nephrologists.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nephrologists.demo.model.NephrologistTypeModel;


@Repository
public interface INephrologistTypeRepository extends CrudRepository<NephrologistTypeModel, Long>{

}
