package com.integracion.proyecto.Services;

import com.integracion.proyecto.Entity.Paciente;

import java.util.List;
import java.util.Optional;

public interface PacienteService {
    List<Paciente> listarPacientes();
    Paciente guardarPaciente(Paciente paciente);
    Optional<Paciente> porIdPac (Integer id);
    void deletebyIdPac(Integer id);
}
