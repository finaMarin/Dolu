package com.dolu.family.controller;

import com.dolu.family.dto.AuthResponse;
import com.dolu.family.dto.LoginRequest;
import com.dolu.family.dto.RegisterRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    // Aquí inyectaremos AuthService en cuanto Fina suba las entidades y repositorios

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) {
        // Pendiente de conectar con AuthService
        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        // Pendiente de conectar con AuthService
        return ResponseEntity.ok().build();
    }
}