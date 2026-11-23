package com.dolu.family.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuari")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuari")
    private Integer idUsuario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "xp")
    private Integer xp;

    @Column(name = "nivell")
    private Integer nivel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_familia", nullable = false)
    private Familia familia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rol", nullable = false)
    private Rol rol;

    // Genera los getters y setters desde NetBeans
}