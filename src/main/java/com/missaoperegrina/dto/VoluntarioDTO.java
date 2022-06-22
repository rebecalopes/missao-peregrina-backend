package com.missaoperegrina.dto;

import java.io.Serializable;
import java.util.Date;

import com.missaoperegrina.domain.Voluntario;


public class VoluntarioDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private Date nascimento;
    private String endereco;
    private String telefone;
    private String escolaridade;
    private Boolean voluntariadoAnterior;

    public VoluntarioDTO(){

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



}