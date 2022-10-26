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
public interface AlunoDao {
    
    public List<Aluno> buscarTodos();

    public Aluno buscarPorId(Integer Id);
    
    
    public List<Aluno> buscarPorIdList(Integer id);
    
    public List<Aluno> buscarPorCPFList(String cpf);
    
    public List<Aluno> buscarPorNomeList(String nome);

    public void atualizar(Aluno aluno);

    public void excluir(Aluno aluno);

    public void inserir(Aluno aluno);
    
    public Aluno RetornaIdPorRa(Integer RA);
    
}
