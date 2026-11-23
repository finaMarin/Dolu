package com.dolu.family.repository;

import com.dolu.family.entity.AsignacionTarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface AsignacionTareaRepository extends JpaRepository<AsignacionTarea, Integer> {

    @Query("SELECT a FROM AsignacionTarea a WHERE a.usuario.idUsuario = :usuarioId")
    List<AsignacionTarea> buscarPorUsuario(@Param("usuarioId") Integer usuarioId);

    @Query("SELECT a FROM AsignacionTarea a WHERE a.tarea.idTarea = :tareaId")
    List<AsignacionTarea> buscarPorTarea(@Param("tareaId") Integer tareaId);

}