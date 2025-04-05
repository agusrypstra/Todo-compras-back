package com.todoCompras.backend.repository;

import com.todoCompras.backend.model.MotivoRechazo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotivoRechazoRepository extends JpaRepository<MotivoRechazo, Long> {
}
