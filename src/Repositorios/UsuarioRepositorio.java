/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import Entidades.Usuario;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Danilo Cardoso
 */
public class UsuarioRepositorio {
    public void inserir(Usuario usuario){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.save(usuario);
        transacao.commit();
        sessao.close();
    }
public Usuario buscarPorUsuario(String usuario){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Query query = sessao.createQuery("from Usuario where usuario = :usuario");
        query.setParameter("usuario", usuario);
        List list = query.list();
        Usuario user = (Usuario) list.get(0);
        sessao.close();
        return user;
    }
public void excluir(Usuario usuario){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.delete(usuario);
        transacao.commit();
        sessao.close();
    }
public void editar(Usuario usuario){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();        
        Transaction transacao = sessao.beginTransaction();
        sessao.update(usuario);
        transacao.commit();
        sessao.close();
    }
}
