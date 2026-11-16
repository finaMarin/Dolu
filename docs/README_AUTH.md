# Autenticación JWT - DOLU Family (SPIKE-01)

Prueba de concepto de autenticación sin estado (*stateless*) mediante **JSON Web Tokens (JWT)** en Spring Boot con control de roles (`PARE` y `FILL`).

## 1. Obtener Token (Login de prueba)

* **Endpoint:** `POST http://localhost:8080/api/auth/login`

* **Header:** `Content-Type: application/json`

* **Body:**

  ```
  {
    "username": "miguel",
    "role": "PARE"
  }
  ```

* **Respuesta (`200 OK`):**

  ```
  {
    "token": "eyJhbGciOiJIUzI1NiJ9..."
  }
  ```

## 2. Uso del Token en Peticiones Protegidas

Incluir el token recibido en la cabecera HTTP `Authorization` de cada petición (validez de 24 horas):

```
Authorization: Bearer <token>
```

## 3. Endpoints Disponibles en el Spike

| Ruta | Método | Acceso | Descripción | 
| ----- | ----- | ----- | ----- | 
| `/api/auth/login` | `POST` | Público | Genera un token JWT de prueba. | 
| `/api/test/publico` | `GET` | Público | Endpoint abierto sin autenticación. | 
| `/api/test/perfil` | `GET` | Autenticado (`PARE` / `FILL`) | Devuelve usuario y rol extraídos del token. | 
| `/api/test/solo-padres` | `GET` | Solo rol `PARE` | Devuelve `403 Forbidden` si no es `PARE`. | 