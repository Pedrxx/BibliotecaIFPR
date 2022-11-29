
import br.ifpr.biblioteca.conexao.HibernateUtil;
import br.ifpr.biblioteca.dao.PessoaDao;
import br.ifpr.biblioteca.dao.PessoaDaoImpl;
import br.ifpr.biblioteca.dao.ReservaDaoImpl;
import br.ifpr.biblioteca.modelo.Pessoa;
import br.ifpr.biblioteca.modelo.Reserva;
import org.hibernate.Session;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
public class TesteHibernate {
    
    public static void main(String[] args) {
        
        HibernateUtil sessao = new HibernateUtil();
        
        sessao.getSession();

        
        ReservaDaoImpl dao = new ReservaDaoImpl();
        Reserva reserva = new Reserva(01,01);
        
        System.out.println(reserva.getAlunoID());
        System.out.println(reserva.getArmarioID());
        System.out.println(reserva.getReservaID());
        System.out.println(reserva.getDataDevolucao());
        System.out.println(reserva.getDataEmprestimo());
 
        dao.inserir(reserva);
        
        HibernateUtil.encerraSession();
        /*
        sessao.beginTransaction();
        
        Pessoa pessoa = new Pessoa(
                "Pedro",
                "10364592923",
                "pedr@prats.com.br",
                "4499828795",
                "1234",
                true
        );
        
        sessao.save(pessoa);
        sessao.getTransaction().commit();
        HibernateUtil.encerraSession();
        */
        
        
    }
            
    
}
