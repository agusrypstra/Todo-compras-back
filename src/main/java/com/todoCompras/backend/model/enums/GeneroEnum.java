package com.todoCompras.backend.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GeneroEnum {
    MASCULINO("Masculino"),
    FEMENINO("Femenino"),
    OTRO("Otro"),
    NO_BINARIO("No binario"),
    PREFIERO_NO_DECIR("Prefiero no decir");

    private final String descripcion;

    GeneroEnum(String descripcion) {
        this.descripcion = descripcion;
    }

    // Para serialización JSON (API responses)
    @JsonValue
    public String getDescripcion() {
        return descripcion;
    }

    // Para deserialización JSON (API requests)
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static GeneroEnum fromDescripcion(String descripcion) {
        for (GeneroEnum genero : values()) {
            if (genero.descripcion.equalsIgnoreCase(descripcion)) {
                return genero;
            }
        }
        throw new IllegalArgumentException("Género no válido: " + descripcion);
    }

    // Versión simplificada para usar en @RequestParam
    public static GeneroEnum fromString(String text) {
        try {
            return GeneroEnum.valueOf(text.toUpperCase());
        } catch (IllegalArgumentException e) {
            return PREFIERO_NO_DECIR; // Valor por defecto
        }
    }
}