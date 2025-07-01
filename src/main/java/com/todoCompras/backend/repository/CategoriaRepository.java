package com.todoCompras.backend.repository;

import com.todoCompras.backend.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    List<Categoria> findByPadreIsNull(); // Para padres
    List<Categoria> findByPadreIsNotNull(); // Para padres
    List<Categoria> findByPadreId(Long id);
    Optional<Categoria> findByNombre(String nombre);

    @Query("SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END " +
           "FROM Categoria c WHERE c.nombre = :nombre AND c.padre.id = :padreId")
    boolean existsByNombreAndPadreId(
        @Param("nombre") String nombre,
        @Param("padreId") Long padreId
    );


}