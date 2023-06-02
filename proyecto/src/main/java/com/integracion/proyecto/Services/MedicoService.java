package com.integracion.proyecto.Services;

import com.integracion.proyecto.Entity.Medico;

import java.util.List;
import java.util.Optional;

public interface MedicoService {
    List<Medico> listarMedicos();
    Medico guardarMedico(Medico orden);
    Optional<Medico> porIdOrden (Integer id);
    void deletebyIdMed(Integer id);
}
