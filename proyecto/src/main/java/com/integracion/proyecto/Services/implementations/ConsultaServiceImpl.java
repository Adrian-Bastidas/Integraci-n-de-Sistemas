package com.integracion.proyecto.Services.implementations;

import com.integracion.proyecto.Entity.Consulta;
import com.integracion.proyecto.Repository.ConsultaRepository;
import com.integracion.proyecto.Services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultaServiceImpl implements ConsultaService {
    @Autowired
    private ConsultaRepository repo;
    @Override
    public List<Consulta> listarConsultas() {
        return repo.findAll();
    }

    @Override
    public Consulta guardarConsulta(Consulta orden) {
        return repo.save(orden);
    }

    @Override
    public Optional<Consulta> porIdConsulta(Integer id) {
        return repo.findById(id);
    }

    @Override
    public void deletebyIdConsulta(Integer id) {
        repo.deleteById(id);
    }
}
