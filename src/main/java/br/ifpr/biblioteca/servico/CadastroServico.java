/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.biblioteca.servico;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class CadastroServico {
    
    public static boolean verificaSenhaCadastro(String senha, String cSenha) {
        if (senha == cSenha){
           
           JOptionPane.showMessageDialog(null, "Senha valida!");
           return true;
           
       } else {
           
           JOptionPane.showMessageDialog(null, "Senha não coencide!");
           
           return false;
       
       }  
    }
}
