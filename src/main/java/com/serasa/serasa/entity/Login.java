package com.serasa.serasa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "login")
public class Login implements Serializable {

    private static final long serialVersion = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user", nullable = false)
    private String user;

    @Column(name = "password", nullable = false)
    private String password;
}
