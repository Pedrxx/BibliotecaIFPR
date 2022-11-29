/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.ifpr.biblioteca.dao;

import br.ifpr.biblioteca.modelo.Pessoa;
import br.ifpr.biblioteca.modelo.Reserva;
import java.util.List;

/**
 *
 * @author admin
 */
public interface ReservaDao {
    
    public List<Reserva> buscarTodos();
    
    public Reserva buscarPorId(Integer id);
    
    public List<Reserva> buscaIdReservaPorIdAluno(int id);

    public void atualizar(Reserva reserva);

    public void excluir(Reserva reserva);

    public void inserir(Reserva reserva);
    
}
