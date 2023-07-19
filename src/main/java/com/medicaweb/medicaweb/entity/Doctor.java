package com.medicaweb.medicaweb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Doctor {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String lastName;
  private Long office;
  private String email;
  
  @ManyToOne
  @JoinColumn(name = "specialty_id")
  private Specialty specialty;
  
  public Doctor() {

  }


  public Doctor(Long id, String name, String lastName, Long office, String email) {
    this.id = id;
    this.name = name;
    this.lastName = lastName;
    this.office = office;
    this.email = email;
  }


  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public Long getOffice() {
    return office;
  }


  public void setOffice(Long office) {
    this.office = office;
  }


  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }

  
  
}
