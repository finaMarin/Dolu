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

    public Integer getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(Integer idTarea) {
        this.idTarea = idTarea;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDateTime getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDateTime fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public Usuario getCreador() {
        return creador;
    }

    public void setCreador(Usuario creador) {
        this.creador = creador;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

}