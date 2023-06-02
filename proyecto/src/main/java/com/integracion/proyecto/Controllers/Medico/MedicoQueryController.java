package com.integracion.proyecto.Controllers.Medico;

import com.integracion.proyecto.Entity.Medico;
import com.integracion.proyecto.Entity.Paciente;
import com.integracion.proyecto.Services.MedicoService;
import com.integracion.proyecto.Services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/queryMedico")
@CrossOrigin(value="*")
public class MedicoQueryController {
    @Autowired
    private MedicoService service;
    @PostMapping("/postMedico")
    public ResponseEntity<?> crearDet(@RequestBody Medico ordenDetails){
        Medico ordenDetDB= service.guardarMedico(ordenDetails);
        return ResponseEntity.status(HttpStatus.CREATED).body(ordenDetDB);
    }
    @PutMapping("/putMedico/{id}")
    public ResponseEntity<?> editarE (@RequestBody Medico ordenDetails, @RequestParam Integer id){
        Optional<Medico> o = service.porIdOrden(id);
        if(o.isPresent()){
            Medico ordenDetDB =o.get();
            return ResponseEntity.status(HttpStatus.CREATED).body(service.guardarMedico(ordenDetDB));
        }
        else
            return ResponseEntity.notFound().build();
    }
    @DeleteMapping("/deleteMedico/{id}")
    public  ResponseEntity<?> deletebyIdPac (@PathVariable int id){
        this.service.deletebyIdMed(id);
        return ResponseEntity.ok(Boolean.TRUE);
    }
}
