package com.integracion.proyecto.Controllers.Cita;

import com.integracion.proyecto.Entity.Cita;
import com.integracion.proyecto.Entity.Medico;
import com.integracion.proyecto.Services.CitaService;
import com.integracion.proyecto.Services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/queryCita")
@CrossOrigin(value="*")
public class CitaqueryController {
    @Autowired
    private CitaService service;
    @PostMapping("/postCita")
    public ResponseEntity<?> crearDet(@RequestBody Cita ordenDetails){
        Cita ordenDetDB= service.guardarCitas(ordenDetails);
        return ResponseEntity.status(HttpStatus.CREATED).body(ordenDetDB);
    }
    @PutMapping("/putCita/{id}")
    public ResponseEntity<?> editarE (@RequestBody Cita ordenDetails, @RequestParam Integer id){
        Optional<Cita> o = service.porIdCita(id);
        if(o.isPresent()){
            Cita ordenDetDB =o.get();
            return ResponseEntity.status(HttpStatus.CREATED).body(service.guardarCitas(ordenDetDB));
        }
        else
            return ResponseEntity.notFound().build();
    }
    @DeleteMapping("/deleteCita/{id}")
    public  ResponseEntity<?> deletebyIdCita (@PathVariable int id){
        this.service.deletebyIdCita(id);
        return ResponseEntity.ok(Boolean.TRUE);
    }
}
