package com.integracion.proyecto.Repository;

import com.integracion.proyecto.Entity.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Integer> {
}
