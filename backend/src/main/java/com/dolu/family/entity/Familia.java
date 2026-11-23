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

    public Integer getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(Integer idFamilia) {
        this.idFamilia = idFamilia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}