package com.medicaweb.medicaweb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.medicaweb.medicaweb.entity.Appointment;



@RepositoryRestResource(collectionResourceRel = "appointments", path = "appointments")
public interface AppointmentRepository extends PagingAndSortingRepository<Appointment, Long>, CrudRepository<Appointment, Long>{
  
}
