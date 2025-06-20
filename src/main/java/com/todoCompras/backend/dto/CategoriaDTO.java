package com.todoCompras.backend.dto;

import java.util.List;

public class CategoriaDTO {
    private Long id;
    private String nombre;
    private Long padreId;
    private List<CategoriaDTO> subcategorias;

    // Constructores
    public CategoriaDTO() {}

    public CategoriaDTO(Long id, String nombre, Long padreId, List<CategoriaDTO> subcategorias) {
        this.id = id;
        this.nombre = nombre;
        this.padreId = padreId;
        this.subcategorias = subcategorias;
    }

    public CategoriaDTO(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPadreId() {
        return padreId;
    }

    public void setPadreId(Long padreId) {
        this.padreId = padreId;
    }

    public List<CategoriaDTO> getSubcategorias() {
        return subcategorias;
    }

    public void setSubcategorias(List<CategoriaDTO> subcategorias) {
        this.subcategorias = subcategorias;
    }
}
