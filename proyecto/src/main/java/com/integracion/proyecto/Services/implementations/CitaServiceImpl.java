package com.integracion.proyecto.Services.implementations;

import com.integracion.proyecto.Entity.Cita;
import com.integracion.proyecto.Repository.CitaRepository;
import com.integracion.proyecto.Services.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitaServiceImpl implements CitaService {
    @Autowired
    private CitaRepository repo;
    @Override
    public List<Cita> listarCitas() {
        return repo.findAll();
    }

    @Override
    public Cita guardarCitas(Cita orden) {
        return repo.save(orden);
    }

    @Override
    public Optional<Cita> porIdCita(Integer id) {
        return repo.findById(id);
    }

    @Override
    public void deletebyIdCita(Integer id) {
        repo.deleteById(id);
    }
}
