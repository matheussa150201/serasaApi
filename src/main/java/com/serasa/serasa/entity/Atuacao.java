package com.serasa.serasa.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "atuacao")
public class Atuacao {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "regiao")
    private String regiao;

    @Column(name = "estados ")
    private ArrayList<String> estados = new ArrayList<String>();

}
