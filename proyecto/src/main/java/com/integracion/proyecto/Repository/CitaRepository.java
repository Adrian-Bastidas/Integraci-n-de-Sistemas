package com.integracion.proyecto.Repository;

import com.integracion.proyecto.Entity.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitaRepository extends JpaRepository<Cita, Integer> {
}
