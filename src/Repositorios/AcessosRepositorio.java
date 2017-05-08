/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import Entidades.Acessos;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    public List<Acessos> buscarPorData(String date) throws ParseException {
        DateFormat formatorData = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Criteria criterio = sessao.createCriteria(Acessos.class);
        criterio.add(Restrictions.ge("data", formatorData.parse(date+" 00:00:00")));
        criterio.add(Restrictions.le("data", formatorData.parse(date+" 23:59:59")));
        List<Acessos> acessos = criterio.list();

        sessao.close();
        return acessos;
    }
}
