/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.biblioteca.modelo;

import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name="tb_aluno")
public class Aluno extends Pessoa{

    
    
    @Column(name="ra_aluno")
    private String RA;
    
    public Aluno() {}

    public Aluno(String nome, String CPF, String email, String telefone, String senha) {
        super(nome, CPF, email, telefone, senha);
        this.RA = geraRaAluno();
    }
    
    public Aluno(Integer pessoaID, String nome, String CPF, String email, String telefone,boolean ativo, String RA) {
        super(pessoaID ,nome, CPF, email, telefone, ativo);
        this.RA = RA;
    }
    
    
    
    
    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }
    
    public static String geraRaAluno() {
        
        
        Random gerador = new Random();
        Calendar cal = GregorianCalendar.getInstance();     
        
        String ano = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
        int num;

        while(true) { // Gerador de numero aleatorio positivo
            num = gerador.nextInt();
            if(num > 0 && num < 999999) {
                break;
            }
        }
        
        String alunoRa  = ano + Integer.toString(num);
        
        return alunoRa;
        
        
    }
    

}
