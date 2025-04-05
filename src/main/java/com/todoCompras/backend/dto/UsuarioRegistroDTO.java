package com.todoCompras.backend.dto;

import com.todoCompras.backend.model.enums.GeneroEnum;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

public class UsuarioRegistroDTO {
    @NotBlank @Size(max = 50)
    private String nombre;

    @NotBlank @Size(max = 50)
    private String apellido;

    @Email
    private String email;

    @NotBlank @Size(min = 8)
    private String contrasena;

    @Pattern(regexp = "^\\+[0-9]+$")
    private String telefono;

    @Past
    private LocalDate fechaNacimiento;

    private GeneroEnum genero;

    @AssertTrue
    private boolean aceptaTerminos;

    // Getters y Setters
}

