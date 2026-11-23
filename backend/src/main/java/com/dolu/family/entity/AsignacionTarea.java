
package com.dolu.family.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Asignacion_tarea")
public class AsignacionTarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignacion")
    private Integer idAsignacion;

    @Column(name = "estado", nullable = false, length = 20)
    private String estado;

    @Column(name = "fecha_completada")
    private LocalDateTime fechaCompletada;

    @Column(name = "fecha_creada", nullable = false,
            insertable = false, updatable = false)
    private LocalDateTime fechaCreada;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuari", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tasca", nullable = false)
    private Tarea tarea;

    public Integer getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(Integer idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaCompletada() {
        return fechaCompletada;
    }

    public void setFechaCompletada(LocalDateTime fechaCompletada) {
        this.fechaCompletada = fechaCompletada;
    }

    public LocalDateTime getFechaCreada() {
        return fechaCreada;
    }

    public void setFechaCreada(LocalDateTime fechaCreada) {
        this.fechaCreada = fechaCreada;
    }

    public Usuario getUsuari() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public AsignacionTarea() {
    }
}
