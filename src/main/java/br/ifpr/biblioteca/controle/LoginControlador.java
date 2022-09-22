/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.biblioteca.controle;

import br.ifpr.biblioteca.servico.LoginServico;

/**
 *
 * @author pedro
 */
public class LoginControlador {

    public boolean verifica(String RA, String senha) {
        
        return LoginServico.verifica(RA,senha);
        
    }
    
    
}
