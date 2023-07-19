package com.medicaweb.medicaweb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.medicaweb.medicaweb.entity.Doctor;


@RepositoryRestResource(collectionResourceRel = "doctors", path = "doctors")
public interface DoctorRespository  extends PagingAndSortingRepository<Doctor, Long>, CrudRepository<Doctor, Long>{
  
}
