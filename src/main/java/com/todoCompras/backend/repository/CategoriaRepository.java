package com.todoCompras.backend.repository;

import com.todoCompras.backend.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    List<Categoria> findByPadreIsNull(); // Para padres
    List<Categoria> findByPadreId(Long id);
    Optional<Categoria> findByNombre(String nombre);
}