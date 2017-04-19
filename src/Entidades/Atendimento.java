/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Alan
 */
@Entity
public class Atendimento implements Serializable {
    @EmbeddedId
    private AtendimentoPK id;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Paciente paciente;

    /**
     * @return the id
     */
    

    /**
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the id
     */
    public AtendimentoPK getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(AtendimentoPK id) {
        this.id = id;
    }
}
