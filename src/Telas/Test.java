/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Entidades.Acessos;
import Repositorios.AcessosRepositorio;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alan
 */
public class Test {
    public static void main(String[] args) {
            AcessosRepositorio acessosRepositorio = new AcessosRepositorio();
            Date dat = new Date(117,03,29);
            System.out.println(dat);
             List<Acessos> acessoss = acessosRepositorio.buscarPorData(dat);

        System.out.println("chegou");
        for (Acessos acessos : acessoss) {
            System.out.println("Nome " + acessos.getNome());
            System.out.println("Data : " + acessos.getData());
            System.out.println("Usuario: " + acessos.getUsuario());

        }
        /* Acessos acessos = new Acessos();
        
        acessos.setData(new Date());
        acessos.setNome("aa");
        acessos.setUsuario("a");
        
        AcessosRepositorio acessosRepositorio = new AcessosRepositorio();
        
        acessosRepositorio.inserir(acessos);
        */  
    }
}
