package com.integracion.proyecto.Repository;

import com.integracion.proyecto.Entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
}
