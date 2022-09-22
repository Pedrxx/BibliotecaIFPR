/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.biblioteca.modelo;

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
    
    @Column
    private Date dataEmprestimo;
    @Column
    private Date dataDevolucao;
    
    
}
