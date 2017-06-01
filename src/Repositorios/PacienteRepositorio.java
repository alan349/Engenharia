/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import Entidades.Paciente;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author Alan
 */
public class PacienteRepositorio {
    public void inserir(Paciente paciente){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        try{
            sessao.save(paciente);
        } catch (ConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Foi encontrada uma duplicidade com algum CPF já cadastrado.");
            sessao.close();
            Thread.currentThread().stop();
        }
        transacao.commit();
        sessao.close();
    }
    
    public void editar(Paciente paciente){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();        
        Transaction transacao = sessao.beginTransaction();
        sessao.update(paciente);
        transacao.commit();
        sessao.close();
    }
    
    public Paciente buscarPorNome(String nome){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Query query = sessao.createQuery("from Paciente where nome = :nome");
        query.setParameter("nome", nome);
        List list = query.list();
        if(list.isEmpty()){
            sessao.close();
            return null;
        }
        Paciente paciente = (Paciente) list.get(0);
        sessao.close();
        return paciente;
    }

    public List<Paciente> buscarTudoOrdenado() {
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Criteria criterio = sessao.createCriteria(Paciente.class);
        criterio.addOrder(Order.asc("Nome"));   
        List<Paciente> pacientes = criterio.list();
        
        sessao.close();
        return pacientes;
    }

    public Paciente buscarPorCpf(String cpf){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Query query = sessao.createQuery("from Paciente where CPF = :cpf");
        query.setParameter("cpf", cpf);
        List list = query.list();
        if (list.isEmpty() || list == null){
            sessao.close();
            return null;
        }
        Paciente user = (Paciente) list.get(0);
        sessao.close();
        return user;
    }
    public void excluir(Paciente paciente){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.delete(paciente);
        transacao.commit();
        sessao.close();
    }
    
}
