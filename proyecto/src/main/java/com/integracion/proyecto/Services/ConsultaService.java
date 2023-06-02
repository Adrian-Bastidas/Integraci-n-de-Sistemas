package com.integracion.proyecto.Services;

import com.integracion.proyecto.Entity.Consulta;

import java.util.List;
import java.util.Optional;

public interface ConsultaService {
    List<Consulta> listarConsultas();
    Consulta guardarConsulta(Consulta orden);
    Optional<Consulta> porIdConsulta (Integer id);
    void deletebyIdConsulta(Integer id);
}
