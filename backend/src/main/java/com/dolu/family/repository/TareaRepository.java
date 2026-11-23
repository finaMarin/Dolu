package com.dolu.family.repository;

import com.dolu.family.entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface TareaRepository extends JpaRepository<Tarea, Integer> {

    @Query("SELECT t FROM Tarea t WHERE t.familia.idFamilia = :familiaId")
    List<Tarea> buscarPorFamilia(@Param("familiaId") Integer familiaId);

}