/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.biblioteca.dao;

import br.ifpr.biblioteca.conexao.HibernateUtil;
import br.ifpr.biblioteca.modelo.Aluno;
import br.ifpr.biblioteca.modelo.Funcionario;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author pedro
 */
public class FuncionarioDaoImpl implements FuncionarioDao {
    
    private Session sessao;
    
    public FuncionarioDaoImpl(){
        this.sessao = HibernateUtil.getSession();
    }

    @Override
    public List<Funcionario> buscarTodos() {
        List<Funcionario> funcionario = null;
        try {
            sessao.beginTransaction();
            funcionario = (List<Funcionario>) this.sessao.createQuery("from Funcionario").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return funcionario;
    }

    @Override
    public Funcionario buscarPorCIAP(Integer CIAP) {
        Funcionario funcionario = null;
        try {
            sessao.beginTransaction();
            funcionario = (Funcionario) sessao.get(Funcionario.class, CIAP);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return funcionario;
    }

    @Override
    public void inserir(Funcionario funcionario) {
        try {
            sessao.beginTransaction();
            sessao.persist(funcionario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Funcionario funcionario) {
        try {
            sessao.beginTransaction();
            sessao.update(funcionario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(Funcionario funcionario) {
        try {
            sessao.beginTransaction();
            sessao.delete(funcionario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
