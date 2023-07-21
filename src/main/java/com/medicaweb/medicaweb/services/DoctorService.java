package com.medicaweb.medicaweb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.medicaweb.medicaweb.entity.Doctor;
import com.medicaweb.medicaweb.repository.DoctorRespository;
import java.util.List;

@Service
public class DoctorService {

    private final DoctorRespository doctorRepository;

    @Autowired
    public DoctorService(DoctorRespository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public Doctor createDoctorWithSpecialty(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public List<Doctor> findAllDoctors() {
        return doctorRepository.findAll();
    }
}
