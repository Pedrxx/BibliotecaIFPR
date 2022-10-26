/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.biblioteca.servico;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class CadastroServico {
    
    public static boolean verificaSenhaCadastro(String senha, String cSenha) {
        if (senha.equals(cSenha)){
           
           JOptionPane.showMessageDialog(null, "Senha válida!");
           return true;
           
       } else {
           
           JOptionPane.showMessageDialog(null, "Senha não confere!");        
           return false;
       
       }  
    }
    
}
