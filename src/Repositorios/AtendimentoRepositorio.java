/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import Entidades.Atendimento;
import Entidades.AtendimentoPK;
import Entidades.Paciente;
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

    public void inserir(Atendimento atendimento) {
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.save(atendimento);
        transacao.commit();
        sessao.close();
    }
    
    public void editar(Atendimento atendimento) {
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.update(atendimento);
        transacao.commit();
        sessao.close();
    }
    
    public void excluir(Atendimento atendimento){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.delete(atendimento);
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
    
    public List<Atendimento> buscarTudoEspec() {
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Criteria criterio = sessao.createCriteria(Atendimento.class);
        criterio.addOrder(Order.asc("Especialidade"));
        List<Atendimento> atendimentos = criterio.list();
        sessao.close();
        return atendimentos;
    }

    public List<Atendimento> buscarPorMedico(String medico) {
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Query query = sessao.createQuery("from Atendimento where Medico = :med ORDER BY STR_TO_DATE(Data, '%M-%Y') DESC");
        query.setParameter("med", medico);

        List<Atendimento> atendimentos = query.list();
        if (atendimentos.isEmpty()) {
            sessao.close();
            return null;
        }
        sessao.close();
        return atendimentos;
    }
    
    public List<Atendimento> buscarPorData(String data) {
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Query query = sessao.createQuery("from Atendimento where Data = :date ORDER BY STR_TO_DATE(Data, '%D %M %Y') DESC");
        query.setParameter("date", data);

        List<Atendimento> atendimentos = query.list();
        if (atendimentos.isEmpty()) {
            sessao.close();
            return null;
        }
        sessao.close();
        return atendimentos;
    }

    public List<Atendimento> buscarPorPacienteMedico(String medico, String paciente) {
        PacienteRepositorio pacienteRepositorio = new PacienteRepositorio();
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Paciente pacBusca = pacienteRepositorio.buscarPorNome(paciente);
        if (pacBusca == null) {
            sessao.close();
            return null;
        }

        Query query = sessao.createQuery("from Atendimento where Medico = :med AND paciente_id = :pac ORDER BY STR_TO_DATE(Data, '%D %M %Y') DESC");
        query.setParameter("med", medico);
        query.setParameter("pac", pacBusca.getId());
        List<Atendimento> atendimentos = query.list();
        if (atendimentos.isEmpty()) {
            sessao.close();
            return null;
        }
        sessao.close();
        return atendimentos;
    }

    public List<Atendimento> buscarPorDataMedico(String medico, String data) {
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Query query = sessao.createQuery("from Atendimento where Medico = :med AND Data = :date ORDER BY STR_TO_DATE(Data, '%D %M %Y') DESC");
        query.setParameter("med", medico);
        query.setParameter("date", data);
        List<Atendimento> atendimentos = query.list();
        if (atendimentos.isEmpty()) {
            sessao.close();
            return null;
        }
        sessao.close();
        return atendimentos;
    }

    public Atendimento buscarUnicaDataMedico(String medico, String data) {
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Query query = sessao.createQuery("from Atendimento where Medico = :med AND Data = :date ORDER BY STR_TO_DATE(Data, '%D %M %Y') DESC");
        query.setParameter("med", medico);
        query.setParameter("date", data);
        List<Atendimento> atendimentos = query.list();
        if (atendimentos.isEmpty()) {
            sessao.close();
            return null;
        }
        Atendimento atendimento = atendimentos.get(0);
        sessao.close();
        return atendimento;
    }
}
