package com.integracion.proyecto.Controllers.Medico;

import com.integracion.proyecto.Entity.Medico;
import com.integracion.proyecto.Entity.Paciente;
import com.integracion.proyecto.Services.MedicoService;
import com.integracion.proyecto.Services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/getMedico")
@CrossOrigin(value="*")
public class MedicoGetController {
    @Autowired
    private MedicoService service;
    @GetMapping("/listarMedicos")
    public ResponseEntity<List<Medico>> listarOrdenDet() {
        return ResponseEntity.ok(service.listarMedicos());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Medico> porIdOrdenDet(@PathVariable Integer id) {
        Optional<Medico> o = service.porIdOrden(id);
        if (o.isPresent()){
            return  ResponseEntity.ok(o.get());
        }
        return ResponseEntity.notFound().build();
    }
}
