package com.integracion.proyecto.Entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name="Cita")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCita;
    private Date fechaCita;
    private Time HoraCita;

    private Integer idPaciente;
    private Integer idMedico;
}
