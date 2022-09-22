/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.ifpr.biblioteca.dao;

import br.ifpr.biblioteca.modelo.Pessoa;
import java.util.List;

/**
 *
 * @author pedro
 */
public interface PessoaDao {
    
    public List<Pessoa> buscarTodos();

    public Pessoa buscarPorId(Integer id);

    public void atualizar(Pessoa localizacao);

    public void excluir(Pessoa localizacao);

    public void inserir(Pessoa localizacao);
    
}
