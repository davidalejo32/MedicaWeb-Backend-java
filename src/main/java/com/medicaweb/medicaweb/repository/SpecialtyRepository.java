package com.medicaweb.medicaweb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.medicaweb.medicaweb.entity.Specialty;

@CrossOrigin(origins= "http://localhost:3000")
@RepositoryRestResource(collectionResourceRel = "specialties", path = "specialties")
public interface SpecialtyRepository extends PagingAndSortingRepository<Specialty, Long>, CrudRepository<Specialty, Long> {
  
}
