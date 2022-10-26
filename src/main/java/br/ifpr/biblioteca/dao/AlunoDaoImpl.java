/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.biblioteca.dao;

import br.ifpr.biblioteca.conexao.HibernateUtil;
import br.ifpr.biblioteca.modelo.Aluno;
import br.ifpr.biblioteca.modelo.Pessoa;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.query.Query;

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
    public Aluno buscarPorId(Integer id) {
        Aluno aluno = null;
        try {
            sessao.beginTransaction();
            aluno = (Aluno) sessao.get(Aluno.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aluno;
    }
    
    @Override
    public List<Aluno> buscarPorIdList(Integer id) {
        List<Aluno> aluno = null;
        try {
            sessao.beginTransaction();
            aluno = (List<Aluno>) this.sessao.get(Aluno.class, id);
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
            sessao.save(aluno);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
    
    @Override
    public Aluno RetornaIdPorRa(Integer RA) {
        Aluno aluno = null;
        try {
            sessao.beginTransaction();
            aluno = (Aluno) sessao.createQuery("select pessoaID from Aluno where RA = "+ RA);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aluno;
    }

    @Override
    public List<Aluno> buscarPorCPFList(String cpf) {
        List<Aluno> aluno = null;
            try {
                sessao.beginTransaction();
                aluno = (List<Aluno>) this.sessao.createQuery("from Aluno where cpf_pessoa = " + cpf).list();
                sessao.getTransaction().commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return aluno;    
    }

    @Override
    public List<Aluno> buscarPorNomeList(String nome) {
        List<Aluno> aluno = null;
            try {
                sessao.beginTransaction();
                aluno = (List<Aluno>) this.sessao.createQuery("from Aluno where nome_pessoa like '"+nome+"%'").list();
                sessao.getTransaction().commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return aluno;    }
    
}
