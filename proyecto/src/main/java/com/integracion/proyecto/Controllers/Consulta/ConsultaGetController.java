package com.integracion.proyecto.Controllers.Consulta;

import com.integracion.proyecto.Entity.Cita;
import com.integracion.proyecto.Entity.Consulta;
import com.integracion.proyecto.Services.CitaService;
import com.integracion.proyecto.Services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/getConsulta")
@CrossOrigin(value="*")
public class ConsultaGetController {
    @Autowired
    private ConsultaService service;
    @GetMapping("/listarConsulta")
    public ResponseEntity<List<Consulta>> listarOrdenDet() {
        return ResponseEntity.ok(service.listarConsultas());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Consulta> porIdOrdenDet(@PathVariable Integer id) {
        Optional<Consulta> o = service.porIdConsulta(id);
        if (o.isPresent()){
            return  ResponseEntity.ok(o.get());
        }
        return ResponseEntity.notFound().build();
    }
}
