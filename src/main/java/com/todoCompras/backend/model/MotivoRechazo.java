package com.todoCompras.backend.model;

import jakarta.persistence.*;

@Entity
public class MotivoRechazo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "solicitud_id")
    private SolicitudRegistroLocal solicitud;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public SolicitudRegistroLocal getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(SolicitudRegistroLocal solicitud) {
        this.solicitud = solicitud;
    }
}