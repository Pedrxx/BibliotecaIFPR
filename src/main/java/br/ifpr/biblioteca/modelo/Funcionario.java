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
import java.util.Date;

/**
 *
 * @author pedro
 */
@Entity
@Table(name="tb_funcionario")
public class Funcionario extends Pessoa{
    
    @Column(name="siape_funcionario", unique=true, nullable=false)
    private String SIAPE;
    
    public Funcionario() {}
    
    public Funcionario(String SIAPE, String nome, String CPF, String email, String telefone, String senha) {   
        super(nome,CPF,email,telefone,senha);
        this.SIAPE = SIAPE;
    
    }
    
}
