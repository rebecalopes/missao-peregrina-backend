package com.missaoperegrina.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admininstracao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String email;
    private String senha;

}
