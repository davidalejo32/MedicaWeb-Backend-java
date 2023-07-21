package com.medicaweb.medicaweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medicaweb.medicaweb.entity.Doctor;
import com.medicaweb.medicaweb.entity.Specialty;
import com.medicaweb.medicaweb.repository.SpecialtyRepository;
import com.medicaweb.medicaweb.services.DoctorService;

@RestController
@CrossOrigin(origins= "*")
public class DoctorController {

    private final DoctorService doctorService;
    private final SpecialtyRepository specialtyRepository;

    @Autowired
    public DoctorController(DoctorService doctorService, SpecialtyRepository specialtyRepository) {
        this.doctorService = doctorService;
        this.specialtyRepository = specialtyRepository;
    }

    @PostMapping("/doctors")
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        // Obtener la especialidad por su id y asignarla al doctor
        Specialty specialty = specialtyRepository.findById(doctor.getSpecialty().getId()).orElse(null);
        doctor.setSpecialty(specialty);

        return doctorService.createDoctorWithSpecialty(doctor);
    }

    @GetMapping("/doctors")
    public List<Doctor> getAllDoctors() {
        return doctorService.findAllDoctors();
    }
}
