/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.ifpr.biblioteca.dao;

import br.ifpr.biblioteca.modelo.Funcionario;
import java.util.List;

/**
 *
 * @author pedro
 */
public interface FuncionarioDao {
    
    public List<Funcionario> buscarTodos();

    public Funcionario buscarPorCIAP(Integer CIAP);

    public void atualizar(Funcionario localizacao);

    public void excluir(Funcionario localizacao);

    public void inserir(Funcionario localizacao);
    
}
