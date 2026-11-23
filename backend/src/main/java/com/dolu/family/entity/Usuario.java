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

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    
}