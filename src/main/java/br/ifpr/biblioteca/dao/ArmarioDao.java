/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.ifpr.biblioteca.dao;

import br.ifpr.biblioteca.modelo.Armario;
import java.util.List;

/**
 *
 * @author pedro
 */
public interface ArmarioDao {
    
    public List<Armario> buscarTodos();

    public Armario buscarPorId(Integer id);

    public void atualizar(Armario localizacao);

    public void excluir(Armario localizacao);

    public void inserir(Armario localizacao);
    
}
