package com.integracion.proyecto.Services;

import com.integracion.proyecto.Entity.Cita;

import java.util.List;
import java.util.Optional;

public interface CitaService {
    List<Cita> listarCitas();
    Cita guardarCitas(Cita orden);
    Optional<Cita> porIdCita (Integer id);
    void deletebyIdCita(Integer id);
}
