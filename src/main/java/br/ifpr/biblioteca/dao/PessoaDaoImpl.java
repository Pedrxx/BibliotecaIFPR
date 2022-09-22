/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.biblioteca.dao;

import br.ifpr.biblioteca.conexao.HibernateUtil;
import br.ifpr.biblioteca.modelo.Funcionario;
import br.ifpr.biblioteca.modelo.Pessoa;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author pedro
 */
public class PessoaDaoImpl implements PessoaDao {
    
    private Session sessao = HibernateUtil.getSession();

    @Override
    public List<Pessoa> buscarTodos() {
        List<Pessoa> pessoa = null;
        try {
            sessao.beginTransaction();
            pessoa = (List<Pessoa>) this.sessao.createQuery("from Funcionario").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pessoa;
    }

    @Override
    public Pessoa buscarPorId(Integer id) {
        Pessoa pessoa = null;
        try {
            sessao.beginTransaction();
            pessoa = (Funcionario) sessao.get(Funcionario.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pessoa;
    }

    @Override
    public void inserir(Pessoa pessoa) {
        try {
            sessao.beginTransaction();
            sessao.save(pessoa);
            sessao.getTransaction().commit();           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Pessoa pessoa) {
        try {
            sessao.beginTransaction();
            sessao.update(pessoa);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(Pessoa pessoa) {
        try {
            sessao.beginTransaction();
            sessao.delete(pessoa);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
