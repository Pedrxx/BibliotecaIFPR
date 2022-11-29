/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.biblioteca.servico;

import br.ifpr.biblioteca.dao.AlunoDaoImpl;
import br.ifpr.biblioteca.modelo.Aluno;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class ValidaUser {

    public static boolean verifica(String CPF, String senha){
        
       if (senha.equals(RetornaSenhaporCPF(CPF))){
           
           //JOptionPane.showMessageDialog(null, "Sucesso!");
           
           return true;
           
       } else {
           
           //JOptionPane.showMessageDialog(null, "Login ou senha inválidos!");
           
           return false;
       
       }     
    }

    private static String RetornaSenhaporCPF(String CPF) {
        AlunoDaoImpl dao = new AlunoDaoImpl();
        
        List<Aluno> listaAluno = new ArrayList();
        
        listaAluno = dao.buscarPorCPFList(CPF);  
        
        String senha = listaAluno.get(0).getSenha();
   
        return(senha);
    }
    
    
    
}
