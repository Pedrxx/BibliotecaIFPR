/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.biblioteca.controle;

import br.ifpr.biblioteca.servico.CadastroServico;
import br.ifpr.biblioteca.servico.LoginServico;

/**
 *
 * @author pedro
 */
public class CadastroControlador {
    
    public boolean verificaSenhaCadastro(String senha, String cSenha) {
        
        return CadastroServico.verificaSenhaCadastro(senha, cSenha);
    }
    
}
