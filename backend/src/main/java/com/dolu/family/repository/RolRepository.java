
package com.dolu.family.repository;

import com.dolu.family.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Integer> {

    @Query("SELECT r FROM Rol r WHERE r.nombre = :nombre")
    Optional<Rol> buscarPorNombre(@Param("nombre") String nombre);

}
