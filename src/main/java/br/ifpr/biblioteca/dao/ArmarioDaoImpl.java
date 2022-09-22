/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.biblioteca.dao;

import br.ifpr.biblioteca.conexao.HibernateUtil;
import br.ifpr.biblioteca.modelo.Aluno;
import br.ifpr.biblioteca.modelo.Armario;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author pedro
 */
public class ArmarioDaoImpl implements ArmarioDao {

    private Session sessao;

    public ArmarioDaoImpl(){
        this.sessao = HibernateUtil.getSession();
    }
    
    @Override
    public List<Armario> buscarTodos() {
        List<Armario> armario = null;
        try {
            sessao.beginTransaction();
            armario = (List<Armario>) this.sessao.createQuery("from Aluno").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return armario;
    }

    @Override
    public Armario buscarPorId(Integer id) {
        Armario armario = null;
        try {
            sessao.beginTransaction();
            armario = (Armario) sessao.get(Armario.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return armario;
    }

    @Override
    public void inserir(Armario armario) {
        try {
            sessao.beginTransaction();
            sessao.persist(armario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Armario aluno) {
        try {
            sessao.beginTransaction();
            sessao.update(aluno);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(Armario Armario) {
        try {
            sessao.beginTransaction();
            sessao.delete(Armario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
