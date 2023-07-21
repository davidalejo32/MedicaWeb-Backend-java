package com.medicaweb.medicaweb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicaweb.medicaweb.entity.Specialty;
import com.medicaweb.medicaweb.repository.SpecialtyRepository;

@Service
public class SpecialtyService {

    private final SpecialtyRepository specialtyRepository;

    @Autowired
    public SpecialtyService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    public Specialty getSpecialtyById(Long specialtyId) {
        return specialtyRepository.findById(specialtyId).orElse(null);
    }
}

