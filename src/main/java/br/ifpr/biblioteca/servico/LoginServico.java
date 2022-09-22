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
public class LoginServico {

    public static boolean verifica(String RA, String senha){
       if (RA.equals("20190005050") && senha.equals("12345")){
           
           JOptionPane.showMessageDialog(null, "Sucesso!");
           
           return true;
           
       } else {
           
           JOptionPane.showMessageDialog(null, "Login ou senha inválidos!");
           
           return false;
       
       }     
    } 
    
}
