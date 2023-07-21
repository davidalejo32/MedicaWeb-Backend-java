// AppointmentService.java
package com.medicaweb.medicaweb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicaweb.medicaweb.entity.Appointment;
import com.medicaweb.medicaweb.repository.AppointmentRepository;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public Appointment createAppointment(Appointment appointment) {
        // Aquí puedes implementar la lógica necesaria para crear la cita y guardarla en la base de datos
        // Por ejemplo:
        return appointmentRepository.save(appointment);

        // Si tienes más lógica de negocio, puedes realizarla antes de guardar la cita en la base de datos.
        // Asegúrate de que la entidad Doctor, User y Specialty estén correctamente mapeadas en la base de datos
        // y que se hayan creado previamente antes de guardar la cita.
    }
}
