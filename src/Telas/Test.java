/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Entidades.Acessos;
import Entidades.Usuario;
import Repositorios.AcessosRepositorio;
import Repositorios.UsuarioRepositorio;
import java.sql.Time;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alan
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        AcessosRepositorio acessosRepositorio = new AcessosRepositorio();            
        List<Acessos> acessoss = acessosRepositorio.buscarPorData("05/04/2017");

        for (Acessos acessos : acessoss) {
            System.out.println("Nome " + acessos.getNome());
            System.out.println("Data : " + acessos.getData());
            System.out.println("Usuario: " + acessos.getUsuario());
        }
        
        /*
        Acessos acessos = new Acessos();
        acessos.setData(new Date());
        acessos.setNome("aa");
        acessos.setUsuario("a");
        AcessosRepositorio acessosRepositorio = new AcessosRepositorio();
        acessosRepositorio.inserir(acessos);
        
        Usuario usuario = new Usuario();
        UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();
        usuario.setCPF(55555555f);
        usuario.setRG("123123123132");
        usuario.setNome("a");
        usuario.setUsuario("a");
        usuario.setSenha("123");
        usuario.setNP(1);
        usuarioRepositorio.inserir(usuario);
        usuario.setCPF(5555555f);
        usuario.setRG("12312312332");
        usuario.setNome("b");
        usuario.setUsuario("b");
        usuario.setSenha("123");
        usuario.setNP(2);
        usuarioRepositorio.inserir(usuario);
        usuario.setCPF(555555f);
        usuario.setRG("1231231132");
        usuario.setNome("c");
        usuario.setUsuario("c");
        usuario.setSenha("123");
        usuario.setNP(3);
        usuarioRepositorio.inserir(usuario);
        */
        
    }
}
