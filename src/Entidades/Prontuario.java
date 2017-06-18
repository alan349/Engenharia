/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Danilo
 */
@Entity
public class Prontuario {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Paciente paciente;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Usuario medico;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @Column(length = 3 ,nullable = false)
    private Double altura;
    @Column (length = 3,nullable = false)
    private Double peso;
    @Column (length = 2500)
    private String anotacoes;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

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
     * @return the medico
     */
    public Usuario getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(Usuario medico) {
        this.medico = medico;
    }

    /**
     * @return the altura
     */
   

    /**
     * @return the anotacoes
     */
    public String getAnotacoes() {
        return anotacoes;
    }

    /**
     * @param anotacoes the anotacoes to set
     */
    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the altura
     */
    public Double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }

   
}
