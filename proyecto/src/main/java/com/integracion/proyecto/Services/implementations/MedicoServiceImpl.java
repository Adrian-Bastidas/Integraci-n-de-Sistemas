package com.integracion.proyecto.Services.implementations;

import com.integracion.proyecto.Entity.Medico;
import com.integracion.proyecto.Repository.MedicoRepository;
import com.integracion.proyecto.Services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoServiceImpl implements MedicoService {
    @Autowired
    private MedicoRepository repo;
    @Override
    public List<Medico> listarMedicos() {
        return repo.findAll();
    }

    @Override
    public Medico guardarMedico(Medico orden) {
        return repo.save(orden);
    }

    @Override
    public Optional<Medico> porIdOrden(Integer id) {
        return repo.findById(id);
    }

    @Override
    public void deletebyIdMed(Integer id) {
        repo.deleteById(id);
    }
}
