/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import Entidades.Acessos;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Alan
 */
public class AcessosRepositorio {
        public void inserir(Acessos acessos){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.save(acessos);
        transacao.commit();
        sessao.close();
    }
    public List<Acessos> buscarPorData(Date data) {
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Criteria criterio = 
            sessao.createCriteria(Acessos.class);
        System.out.println("criteria");
        criterio.add(Restrictions.ge("data", new Date(117, 03, 29, 0,0,0))); 
        criterio.add(Restrictions.lt("data",new Date(117, 03, 30, 0,0,0)));

        List<Acessos> acessos = criterio.list();
        
        sessao.close();
        return acessos;
    }
}
