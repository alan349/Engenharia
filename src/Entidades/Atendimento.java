/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Column;
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
public class Atendimento {
    @EmbeddedId
    private AtPK id;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Paciente paciente;
}

class AtPK implements Serializable{
    private String Medico;
    private String Data;
    private String Hora;
}
