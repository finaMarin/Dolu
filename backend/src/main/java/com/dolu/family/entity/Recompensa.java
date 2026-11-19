
package com.dolu.family.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Recompensa")
public class Recompensa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recompensa")
    private Integer idRecompensa;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "descripcion", length = 500)
    private String descripcion;

    @Column(name = "nivel_requerido")
    private Integer nivelRequerido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_familia", nullable = false)
    private Familia familia;

    public Integer getIdRecompensa() {
        return idRecompensa;
    }

    public void setIdRecompensa(Integer idRecompensa) {
        this.idRecompensa = idRecompensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNivelRequerido() {
        return nivelRequerido;
    }

    public void setNivelRequerido(Integer nivelRequerido) {
        this.nivelRequerido = nivelRequerido;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public Recompensa() {
    }
}
