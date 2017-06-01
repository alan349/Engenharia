/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import Entidades.Usuario;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.HibernateError;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author Danilo Cardoso
 */
public class UsuarioRepositorio {
    public void inserir(Usuario usuario){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        try{
            sessao.save(usuario);
        } catch (ConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Foi encontrada uma duplicidade com algum CPF ou Usuario já cadastrado.");
            sessao.close();
            Thread.currentThread().stop();
        }
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

public List<Usuario> buscarTudoEspec() {
        Session sessao
                = Hibernate.NewHibernateUtil.getSessionFactory().openSession();

        Criteria criterio = 
            sessao.createCriteria(Usuario.class);
        criterio.addOrder(Order.asc("Especialidade"));   
        List<Usuario> usuarios = criterio.list();
        
        sessao.close();
        return usuarios;
    }

public Usuario buscarPorUsuario(String usuario){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Query query = sessao.createQuery("from Usuario where usuario = :usuario");
        query.setParameter("usuario", usuario);
        List list = query.list();
        if (list.isEmpty() || list == null){
            return null;
        }
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

public List<Usuario> buscarPorEspec(String spec){
        Session sessao
                = Hibernate.NewHibernateUtil.getSessionFactory().openSession();

        Criteria criterio = 
            sessao.createCriteria(Usuario.class);
        criterio.add(Restrictions.eq("Especialidade", spec));
        criterio.addOrder(Order.asc("Especialidade"));   
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
