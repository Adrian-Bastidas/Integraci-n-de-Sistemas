package com.integracion.proyecto.Controllers.Paciente;

import com.integracion.proyecto.Entity.Paciente;
import com.integracion.proyecto.Services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/getPaciente")
@CrossOrigin(value="*")
public class PacienteGetController {
    @Autowired
    private PacienteService service;
    @GetMapping("/listarOrden")
    public ResponseEntity<List<Paciente>> listarOrdenDet() {
        return ResponseEntity.ok(service.listarPacientes());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Paciente> porIdOrdenDet(@PathVariable Integer id) {
        Optional<Paciente> o = service.porIdPac(id);
        if (o.isPresent()){
            return  ResponseEntity.ok(o.get());
        }
        return ResponseEntity.notFound().build();
    }
}
