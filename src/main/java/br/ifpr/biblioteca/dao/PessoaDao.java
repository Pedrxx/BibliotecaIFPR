/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.ifpr.biblioteca.dao;

import br.ifpr.biblioteca.modelo.Aluno;
import br.ifpr.biblioteca.modelo.Pessoa;
import java.util.List;

/**
 *
 * @author pedro
 */
public interface PessoaDao {
    
    public List<Pessoa> buscarTodos();

    public Pessoa buscarPorId(Integer id);
        
    public List<Pessoa> buscarPorIdList(Integer id);
    
    public List<Pessoa> buscarPorCPFList(String cpf);
    
    public List<Pessoa> buscarPorNomeList(String nome);

    public void atualizar(Pessoa pessoa);

    public void excluir(Pessoa pessoa);

    public void inserir(Pessoa pessoa);
    
    public Pessoa getNome(String RA);
    
}
