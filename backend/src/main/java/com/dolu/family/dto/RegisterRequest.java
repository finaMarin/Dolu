package com.dolu.family.dto;

public class RegisterRequest {
    private String nombreFamilia;
    private String nombreUsuario;
    private String email;
    private String password;

    public String getNombreFamilia() { return nombreFamilia; }
    public void setNombreFamilia(String nombreFamilia) { this.nombreFamilia = nombreFamilia; }

    public String getNombreUsuario() { return nombreUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}