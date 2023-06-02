package com.integracion.proyecto.Controllers.Paciente;

import com.integracion.proyecto.Entity.Paciente;
import com.integracion.proyecto.Services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/actionsPaciente")
@CrossOrigin("*")
public class PacienteQueryController {
    @Autowired
    private PacienteService service;
    @PostMapping("/postPaciente")
    public ResponseEntity<?> crearDet(@RequestBody Paciente ordenDetails){
        Paciente ordenDetDB= service.guardarPaciente(ordenDetails);
        return ResponseEntity.status(HttpStatus.CREATED).body(ordenDetDB);
    }
    @PutMapping("/putPaciente/{id}")
    public ResponseEntity<?> editarE (@RequestBody Paciente ordenDetails, @RequestParam Integer id){
        Optional<Paciente> o = service.porIdPac(id);
        if(o.isPresent()){
            Paciente ordenDetDB =o.get();
            return ResponseEntity.status(HttpStatus.CREATED).body(service.guardarPaciente(ordenDetDB));
        }
        else
            return ResponseEntity.notFound().build();
    }
    @DeleteMapping("/deletePaciente/{id}")
    public  ResponseEntity<?> deletebyIdPac (@PathVariable int id){
        this.service.deletebyIdPac(id);
        return ResponseEntity.ok(Boolean.TRUE);
    }
}
