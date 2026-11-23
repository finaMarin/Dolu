package com.dolu.family.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Recompensa")
public class Recompensa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recompensa")
    private Integer idRecompensa;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "nivel_requerido")
    private Integer nivelRequerido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_familia", nullable = false)
    private Familia familia;

    // Genera los getters y setters desde NetBeans
}