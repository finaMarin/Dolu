package com.dolu.family.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Tarea")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tasca")
    private Integer idTarea;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "fecha_limite")
    private LocalDateTime fechaLimite;

    @Column(name = "xp")
    private Integer xp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_creador", nullable = false)
    private Usuario creador;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_familia", nullable = false)
    private Familia familia;

    // Genera los getters y setters desde NetBeans
}