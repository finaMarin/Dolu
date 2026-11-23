package com.dolu.family.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Familia")
public class Familia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_familia")
    private Integer idFamilia;

    @Column(name = "nombre")
    private String nombre;

    // Genera los getters y setters desde NetBeans
}