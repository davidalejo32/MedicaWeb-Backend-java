package com.medicaweb.medicaweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.medicaweb.medicaweb.entity.Doctor;

@CrossOrigin(origins= "http://localhost:3000")
@RepositoryRestResource(collectionResourceRel = "doctors", path = "doctors")
public interface DoctorRespository  extends PagingAndSortingRepository<Doctor, Long>, CrudRepository<Doctor, Long>, JpaRepository<Doctor, Long>{
      @Query("SELECT d FROM Doctor d")
      List<Doctor> findAllDoctors();
}
