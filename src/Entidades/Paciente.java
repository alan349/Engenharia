/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Alan
 */
@Entity
public class Paciente {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String Nome;
    @Column(length = 20, nullable = false, unique = true)
    private String CPF;
    @Column(length = 20)
    private String SUS;
    @Column(nullable = false)
    private String DataNasc;
    @Column(nullable = false)
    private String Endereco;
    @Column(nullable = false)
    private String Fone;

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
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the SUS
     */
    public String getSUS() {
        return SUS;
    }

    /**
     * @param SUS the SUS to set
     */
    public void setSUS(String SUS) {
        this.SUS = SUS;
    }

    /**
     * @return the DataNasc
     */
    public String getDataNasc() {
        return DataNasc;
    }

    /**
     * @param DataNasc the DataNasc to set
     */
    public void setDataNasc(String DataNasc) {
        this.DataNasc = DataNasc;
    }

    /**
     * @return the Endereco
     */
    public String getEndereco() {
        return Endereco;
    }

    /**
     * @param Endereco the Endereco to set
     */
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    /**
     * @return the Fone
     */
    public String getFone() {
        return Fone;
    }

    /**
     * @param Fone the Fone to set
     */
    public void setFone(String Fone) {
        this.Fone = Fone;
    }
}
