
import br.ifpr.biblioteca.conexao.HibernateUtil;
import br.ifpr.biblioteca.dao.PessoaDao;
import br.ifpr.biblioteca.dao.PessoaDaoImpl;
import br.ifpr.biblioteca.modelo.Pessoa;
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
