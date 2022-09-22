/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.biblioteca.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


/**
 *
 * @author Aluno
 */

@Entity
@Table(name="tb_pessoa")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pessoa implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_pessoa", unique = true, nullable = false)
    private Integer pessoaID;
    
    @Column(name = "nome_pessoa", unique = false, nullable = false)
    private String nome;
    @Column(name = "cpf_pessoa", unique = true, nullable = false)
    private String CPF;
    @Column(name = "email_pessoa", unique = true, nullable = false)
    private String email;
    @Column(name = "telefone_pessoa", unique = false, nullable = false)
    private String telefone;
    @Column(name = "senha_pessoa", unique = false, nullable = false)
    private String senha;
    @Column(name = "ativo_pessoa", unique = false, nullable = false)
    private boolean ativo;
    

    public Pessoa() {

    }

    public Pessoa(String nome, String CPF, String email, String telefone, String senha, boolean ativo) {
        super();
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.ativo = ativo;
        
    }

    

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the ativo
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    /**
     * @return the pessoaID
     */
    public Integer getPessoaID() {
        return pessoaID;
    }

    /**
     * @param pessoaID the pessoaID to set
     */
    public void setPessoaID(Integer pessoaID) {
        this.pessoaID = pessoaID;
    }

}
    
    
   
