/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import Entidades.Atendimento;
import Entidades.AtendimentoPK;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

/**
 *
 * @author Alan
 */
public class AtendimentoRepositorio {
       public void inserir(Atendimento atendimento){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.save(atendimento);
        transacao.commit();
        sessao.close();
    }
    public List<Atendimento> buscarTudoOrdenado() {
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Criteria criterio = sessao.createCriteria(Atendimento.class);
        criterio.addOrder(Order.asc("id"));   
        List<Atendimento> atendimentos = criterio.list();
        sessao.close();
        return atendimentos;
    }
    
    
}
