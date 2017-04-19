/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import Entidades.Usuario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

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
public Usuario buscarPorNome(String nome){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Query query = sessao.createQuery("from Usuario where nome = :nome");
        query.setParameter("nome", nome);
        List list = query.list();
        
        Usuario user = (Usuario) list.get(0);
        sessao.close();
        return user;
    }

public List<Usuario> buscarTudoOrdenado() {
        Session sessao
                = Hibernate.NewHibernateUtil.getSessionFactory().openSession();

        Criteria criterio = 
            sessao.createCriteria(Usuario.class);
        criterio.addOrder(Order.asc("nome"));   
        List<Usuario> usuarios = criterio.list();
        
        sessao.close();
        return usuarios;
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

public List<Usuario> buscarPorNP(Integer np){
        Session sessao
                = Hibernate.NewHibernateUtil.getSessionFactory().openSession();

        Criteria criterio = 
            sessao.createCriteria(Usuario.class);
        criterio.add(Restrictions.eq("NP", np));
        criterio.addOrder(Order.asc("nome"));   
        List<Usuario> usuarios = criterio.list();
        sessao.close();
        return usuarios;
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
