
import br.ifpr.biblioteca.dao.AlunoDaoImpl;
import br.ifpr.biblioteca.modelo.Aluno;
import br.ifpr.biblioteca.servico.ValidaUser;
import br.ifpr.biblioteca.view.ConfirmaLogin;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
public class TestaSenha {
    
    public static void main(String[] args) {
        
        ValidaUser vu = new ValidaUser();
        
        Aluno aluno = new Aluno();
        AlunoDaoImpl dao = new AlunoDaoImpl();   
        
        vu.verifica(dao.buscarPorId(1).getCPF(), dao.buscarPorId(1).getSenha());
        
    }
    
}
