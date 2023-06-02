package com.integracion.proyecto.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPac;
    private String nombrePac;
    private Date fechaNacimeintoPac;
    private String emailPac;

    public Integer getIdPac() {
        return idPac;
    }

    public void setIdPac(Integer idPac) {
        this.idPac = idPac;
    }

    public String getNombrePac() {
        return nombrePac;
    }

    public void setNombrePac(String nombrePac) {
        this.nombrePac = nombrePac;
    }

    public Date getFechaNacimeintoPac() {
        return fechaNacimeintoPac;
    }

    public void setFechaNacimeintoPac(Date fechaNacimeintoPac) {
        this.fechaNacimeintoPac = fechaNacimeintoPac;
    }

    public String getEmailPac() {
        return emailPac;
    }

    public void setEmailPac(String emailPac) {
        this.emailPac = emailPac;
    }
}
