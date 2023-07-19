package com.medicaweb.medicaweb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Appointment {
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "doctor_id") 
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "user_id") 
    private User user;

    @ManyToOne
    @JoinColumn(name = "specialty_id") 
    private Specialty specialty;

    public Appointment() {

    }

    public Appointment(Long id, Doctor doctor, User user, Specialty specialty) {
      this.id = id;
      this.doctor = doctor;
      this.user = user;
      this.specialty = specialty;
    }

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public Doctor getDoctor() {
      return doctor;
    }

    public void setDoctor(Doctor doctor) {
      this.doctor = doctor;
    }

    public User getUser() {
      return user;
    }

    public void setUser(User user) {
      this.user = user;
    }

    public Specialty getSpecialty() {
      return specialty;
    }

    public void setSpecialty(Specialty specialty) {
      this.specialty = specialty;
    }

    

    
}
