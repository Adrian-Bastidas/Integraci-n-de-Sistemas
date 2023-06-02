package com.integracion.proyecto.Controllers.Cita;

import com.integracion.proyecto.Entity.Cita;
import com.integracion.proyecto.Entity.Medico;
import com.integracion.proyecto.Services.CitaService;
import com.integracion.proyecto.Services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/getCita")
@CrossOrigin(value="*")
public class CitaGetController {
    @Autowired
    private CitaService service;
    @GetMapping("/listarMedicos")
    public ResponseEntity<List<Cita>> listarOrdenDet() {
        return ResponseEntity.ok(service.listarCitas());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cita> porIdOrdenDet(@PathVariable Integer id) {
        Optional<Cita> o = service.porIdCita(id);
        if (o.isPresent()){
            return  ResponseEntity.ok(o.get());
        }
        return ResponseEntity.notFound().build();
    }
}
