package com.todoCompras.backend.repository;

import com.todoCompras.backend.model.Local;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long> {
    @Query("SELECT l FROM Local l JOIN FETCH l.categoria c WHERE c.id = :categoriaId")
    List<Local> obtenerLocalPorCategoriaId(@Param("categoriaId") Long categoriaId);
    
}