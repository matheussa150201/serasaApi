package com.serasa.serasa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "vendedor")
public class Vendedor implements Serializable {

    private static final long serialVersion = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "dataInlcusao")
    private Date dataInlcusao;

    @Column(name = "nome")
    private String nome;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "idade")
    private Integer idade;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "estado ")
    private String estado;

    @Column(name = "regiao ")
    private String regiao;

}
