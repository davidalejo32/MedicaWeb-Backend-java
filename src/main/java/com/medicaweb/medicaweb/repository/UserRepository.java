package com.medicaweb.medicaweb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.medicaweb.medicaweb.entity.User;

@CrossOrigin(origins= "http://localhost:3000")
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long>, CrudRepository<User, Long>{
  User findByIdNumber(Long idNumber);
}
