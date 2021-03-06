package com.missaoperegrina.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class Voluntario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    
    @Column(unique = true)
    private String email;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date nascimento;
    private String endereco;
    private String telefone;
    private String escolaridade;
    private Boolean voluntariadoAnterior;

    public Voluntario(){

    }

    public Voluntario(Integer id, String nome, Date nascimento, String email, String endereco, String telefone, String escolaridade, Boolean voluntariadoAnterior) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.escolaridade = escolaridade;
        this.voluntariadoAnterior = voluntariadoAnterior;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Boolean getVoluntariadoAnterior() {
        return voluntariadoAnterior;
    }

    public void setVoluntariadoAnterior(Boolean voluntariadoAnterior) {
        this.voluntariadoAnterior = voluntariadoAnterior;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voluntario that = (Voluntario) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
