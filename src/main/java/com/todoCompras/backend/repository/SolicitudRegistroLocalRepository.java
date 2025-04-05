package com.todoCompras.backend.repository;

import com.todoCompras.backend.model.EstadoSolicitud;
import com.todoCompras.backend.model.SolicitudRegistroLocal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SolicitudRegistroLocalRepository extends JpaRepository<SolicitudRegistroLocal, Long> {
    List<SolicitudRegistroLocal> findByEstado(EstadoSolicitud estado);
}