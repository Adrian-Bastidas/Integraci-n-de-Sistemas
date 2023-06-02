package com.integracion.proyecto.Controllers.Consulta;

import com.integracion.proyecto.Entity.Consulta;
import com.integracion.proyecto.Entity.Medico;
import com.integracion.proyecto.Services.ConsultaService;
import com.integracion.proyecto.Services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/queryConsulta")
@CrossOrigin(value="*")
public class ConsultaQueryController {
    @Autowired
    private ConsultaService service;
    @PostMapping("/postConsulta")
    public ResponseEntity<?> crearDet(@RequestBody Consulta ordenDetails){
        Consulta ordenDetDB= service.guardarConsulta(ordenDetails);
        return ResponseEntity.status(HttpStatus.CREATED).body(ordenDetDB);
    }
    @PutMapping("/putConsulta/{id}")
    public ResponseEntity<?> editarE (@RequestBody Consulta ordenDetails, @RequestParam Integer id){
        Optional<Consulta> o = service.porIdConsulta(id);
        if(o.isPresent()){
            Consulta ordenDetDB =o.get();
            return ResponseEntity.status(HttpStatus.CREATED).body(service.guardarConsulta(ordenDetDB));
        }
        else
            return ResponseEntity.notFound().build();
    }
    @DeleteMapping("/deleteMedico/{id}")
    public  ResponseEntity<?> deletebyIdPac (@PathVariable int id){
        this.service.deletebyIdConsulta(id);
        return ResponseEntity.ok(Boolean.TRUE);
    }
}
