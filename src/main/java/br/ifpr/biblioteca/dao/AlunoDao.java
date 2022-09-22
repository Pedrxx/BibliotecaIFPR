/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.ifpr.biblioteca.dao;

import br.ifpr.biblioteca.modelo.Aluno;
import java.util.List;

/**
 *
 * @author pedro
 */
public interface AlunoDao {
    
    public List<Aluno> buscarTodos();

    public Aluno buscarPorRA(Integer RA);

    public void atualizar(Aluno localizacao);

    public void excluir(Aluno localizacao);

    public void inserir(Aluno localizacao);
    
}
