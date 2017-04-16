/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;


import Entidades.Paciente;
import Entidades.Prontuario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

/**
 *
 * @author Danilo
 */
public class ProntuarioRepositorio {
     public void inserir(Prontuario prontuario){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.save(prontuario);
        transacao.commit();
        sessao.close();
    }
    public Prontuario buscarPorNome(String nome){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Paciente paciente = new PacienteRepositorio().buscarPorNome(nome);
        int idPaciente = paciente.getId();
        Query query = sessao.createQuery("from Prontuario where paciente_id = :idPaciente");
        query.setParameter("idPaciente", idPaciente);
        List list = query.list();
        Prontuario user = (Prontuario) list.get(0);
        sessao.close();
        return user;
    }

    public List<Prontuario> buscarTudoOrdenado() {
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Criteria criterio = sessao.createCriteria(Prontuario.class);
        criterio.addOrder(Order.asc("id"));   
        List<Prontuario> prontuarios = criterio.list();
        
        sessao.close();
        return prontuarios;
    }

    public void excluir(Prontuario prontuario){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.delete(prontuario);
        transacao.commit();
        sessao.close();
    }
    public void editar(Prontuario prontuario){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();        
        Transaction transacao = sessao.beginTransaction();
        sessao.update(prontuario);
        transacao.commit();
        sessao.close();
    }
}
