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
 * @author Aluno
 */
@Entity
@Table(name="tb_aluno")
public class Aluno extends Pessoa {
    
    private Integer alunoID;
    
    @Column(name="ra_aluno")
    private String RA;
    
    public Aluno( String RA, String nome, String CPF, String email, String telefone, String senha, boolean ativo, Date dataCad){
        super(nome,CPF,email,telefone,senha,ativo);
        this.RA = RA;

    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

}
