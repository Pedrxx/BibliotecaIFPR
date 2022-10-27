/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.biblioteca.modelo;

import java.text.SimpleDateFormat;
import static java.time.Instant.now;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author admin
 */

@Entity
@Table(name="tb_reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_reserva", unique = true, nullable = false)
    private Integer reservaID;
    
    @Column(name = "id_aluno", unique = false, nullable = false)
    private Integer alunoID;

    @Column(name = "id_armario", unique = false, nullable = false)
    private Integer  armarioID;
    
    @Column(name = "data_emprestimo")
    private Date dataEmprestimo;
    @Column(name = "data_devolucao")
    private Date dataDevolucao;

    public Reserva(Integer reservaID, Integer alunoID, Integer armarioID) {
        
        Date dataAtual = new Date(System.currentTimeMillis()); 
        
        this.reservaID = reservaID;
        this.alunoID = alunoID;
        this.armarioID = armarioID;
        this.dataEmprestimo = dataAtual;
        this.dataDevolucao = dataAtual;
    }
    
    
    
    public Reserva(int id_aluno, int id_armario) {
        
        Date dataAtual = new Date(System.currentTimeMillis());        
        this.alunoID = id_aluno;
        this.armarioID = id_armario;
        this.dataEmprestimo = dataAtual;
    }
    
}
