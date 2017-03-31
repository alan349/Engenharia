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
    public List<Acessos> buscarPorData() {
        DateFormat formatorData = new SimpleDateFormat("dd/MM/yyyy");
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Criteria criterio
                = sessao.createCriteria(Acessos.class);
        System.out.println("criteria");
        try {
            criterio.add(Restrictions.ge("data", formatorData.parse("20/03/2017")));
            criterio.add(Restrictions.lt("data", formatorData.parse("31/03/2017")));

        } catch (ParseException ex) {
            Logger.getLogger(AcessosRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }

        List<Acessos> acessos = criterio.list();

        sessao.close();
        return acessos;
    }
}
