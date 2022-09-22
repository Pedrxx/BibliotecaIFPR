/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.biblioteca.dao;

import br.ifpr.biblioteca.conexao.HibernateUtil;
import br.ifpr.biblioteca.modelo.Aluno;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author pedro
 */
public class AlunoDaoImpl implements AlunoDao {
    
    private Session sessao;
    
    public AlunoDaoImpl() {
        this.sessao = HibernateUtil.getSession();

    }

    @Override
    public List<Aluno> buscarTodos() {
        List<Aluno> aluno = null;
        try {
            sessao.beginTransaction();
            aluno = (List<Aluno>) this.sessao.createQuery("from Aluno").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aluno;
    }

    @Override
    public Aluno buscarPorRA(Integer RA) {
        Aluno aluno = null;
        try {
            sessao.beginTransaction();
            aluno = (Aluno) sessao.get(Aluno.class, RA);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aluno;
    }

    @Override
    public void inserir(Aluno aluno) {
        try {
            sessao.beginTransaction();
            sessao.persist(aluno);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Aluno aluno) {
        try {
            sessao.beginTransaction();
            sessao.update(aluno);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(Aluno aluno) {
        try {
            sessao.beginTransaction();
            sessao.delete(aluno);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
