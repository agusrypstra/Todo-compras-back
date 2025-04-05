package com.todoCompras.backend.model;

import jakarta.persistence.*;

@Entity
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String direccion;
    private String telefono;
    @OneToOne(mappedBy = "local")
    private SolicitudRegistroLocal solicitud;
}
