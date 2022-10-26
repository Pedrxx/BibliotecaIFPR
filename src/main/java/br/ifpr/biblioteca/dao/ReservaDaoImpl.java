/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.biblioteca.dao;

import br.ifpr.biblioteca.modelo.Funcionario;
import br.ifpr.biblioteca.modelo.Pessoa;
import br.ifpr.biblioteca.modelo.Reserva;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class ReservaDaoImpl implements ReservaDao {

    private Session sessao;
    
    @Override
    public List<Reserva> buscarTodos() {
        List<Reserva> reserva = null;
        try {
            sessao.beginTransaction();
            reserva = (List<Reserva>) this.sessao.createQuery("from Funcionario").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reserva;
    }

    @Override
    public Reserva buscarPorId(Integer id) {
        Reserva reserva = null;
        try {
            sessao.beginTransaction();
            reserva = (Reserva) sessao.get(Reserva.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reserva;
    }

    @Override
    public void inserir(Reserva reserva) {
        try {
            sessao.beginTransaction();
            sessao.save(reserva);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Reserva reserva) {
        try {
            sessao.beginTransaction();
            sessao.update(reserva);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(Reserva reserva) {
        try {
            sessao.beginTransaction();
            sessao.delete(reserva);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
