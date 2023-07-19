package com.medicaweb.medicaweb.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class User {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String lastName;
  private Long idNumber;
  private LocalDate birthDate;
  private Long phoneNumber;

  @ManyToOne
  @JoinColumn(name = "specialty_id") 
  private Specialty specialty;

  public User() {
  
  }

  public User(Long id, String name, String lastName, Long idNumber, LocalDate birthDate, Long phoneNumber) {
    this.id = id;
    this.name = name;
    this.lastName = lastName;
    this.idNumber = idNumber;
    this.birthDate = birthDate;
    this.phoneNumber = phoneNumber;
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

  public Long getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(Long idNumber) {
    this.idNumber = idNumber;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public Long getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(Long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

}
