package com.nephrologists.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nephrologists.demo.model.ZoneModel;


@Repository
public interface IZoneRepository extends CrudRepository<ZoneModel, Long>{

}
