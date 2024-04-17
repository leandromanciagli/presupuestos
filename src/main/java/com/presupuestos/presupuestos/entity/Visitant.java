package com.presupuestos.presupuestos.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "visitant")
public class Visitant {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;
}
