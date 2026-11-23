package com.dolu.family.controller;

import com.dolu.family.config.JwtService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

// Ja no es necessari

@RestController
@RequestMapping("/api")
public class TestAuthController {

    private final JwtService jwtService;

    public TestAuthController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @PostMapping("/auth/login")
    public ResponseEntity login(@RequestBody Map request) {
        String username = request.get("username") != null ? request.get("username").toString() : "usuario_test";
        String role = request.get("role") != null ? request.get("role").toString().toUpperCase() : "FILL";

        String token = jwtService.generateToken(username, role);
        return ResponseEntity.ok(Map.of("token", token));
    }

    @GetMapping("/test/publico")
    public ResponseEntity publico() {
        return ResponseEntity.ok("Acceso público OK: no requiere token.");
    }

    @GetMapping("/test/perfil")
    public ResponseEntity perfil(Authentication authentication) {
        return ResponseEntity.ok(Map.of(
                "usuario", authentication.getName(),
                "permisos", authentication.getAuthorities()
        ));
    }

    @GetMapping("/test/solo-padres")
    public ResponseEntity soloPadres(Authentication authentication) {
        return ResponseEntity.ok("Acceso concedido a zona de administración familiar para: " + authentication.getName());
    }
}