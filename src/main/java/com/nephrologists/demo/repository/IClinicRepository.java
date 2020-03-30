package com.nephrologists.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nephrologists.demo.model.ClinicModel;


@Repository
public interface IClinicRepository extends CrudRepository<ClinicModel, Long>{

}
