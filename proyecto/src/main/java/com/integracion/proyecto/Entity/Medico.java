package com.integracion.proyecto.Entity;

import javax.persistence.*;

@Entity
@Table(name="Medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMed;
    private String nombreMed;
    private String especialidadMed;
    private String emailMed;

    public Integer getIdMed() {
        return idMed;
    }

    public void setIdMed(Integer idMed) {
        this.idMed = idMed;
    }

    public String getNombreMed() {
        return nombreMed;
    }

    public void setNombreMed(String nombreMed) {
        this.nombreMed = nombreMed;
    }

    public String getEspecialidadMed() {
        return especialidadMed;
    }

    public void setEspecialidadMed(String especialidadMed) {
        this.especialidadMed = especialidadMed;
    }

    public String getEmailMed() {
        return emailMed;
    }

    public void setEmailMed(String emailMed) {
        this.emailMed = emailMed;
    }
}
