package com.dolu.family.dto;

public class AuthResponse {
    private String token;
    private String rol;
    private String nombreUsuario;

    public AuthResponse(String token, String rol, String nombreUsuario) {
        this.token = token;
        this.rol = rol;
        this.nombreUsuario = nombreUsuario;
    }

    public String getToken() { return token; }
    public String getRol() { return rol; }
    public String getNombreUsuario() { return nombreUsuario; }
}