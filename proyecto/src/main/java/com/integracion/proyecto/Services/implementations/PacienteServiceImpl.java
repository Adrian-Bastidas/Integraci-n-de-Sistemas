package com.integracion.proyecto.Services.implementations;

import com.integracion.proyecto.Entity.Paciente;
import com.integracion.proyecto.Repository.PacienteRepository;
import com.integracion.proyecto.Services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PacienteServiceImpl implements PacienteService {
    @Autowired
    private PacienteRepository repo;
    @Override
    public List<Paciente> listarPacientes() {
        return repo.findAll();
    }

    @Override
    public Paciente guardarPaciente(Paciente paciente) {
        return repo.save(paciente);
    }

    @Override
    public Optional<Paciente> porIdPac(Integer id) {
        return repo.findById(id);
    }

    @Override
    public void deletebyIdPac(Integer id) {
        repo.deleteById(id);
    }
}
