package com.dolu.family.repository;

import com.dolu.family.entity.Recompensa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface RecompensaRepository extends JpaRepository<Recompensa, Integer> {

    @Query("SELECT r FROM Recompensa r WHERE r.familia.idFamilia = :familiaId")
    List<Recompensa> buscarPorFamilia(@Param("familiaId") Integer familiaId);

}