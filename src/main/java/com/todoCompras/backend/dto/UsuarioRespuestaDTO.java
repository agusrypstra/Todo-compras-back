package com.todoCompras.backend.dto;

import com.todoCompras.backend.model.Usuario;
import java.time.LocalDateTime;
import java.util.UUID;


    public record UsuarioRespuestaDTO(
            UUID id,
            String nombre,
            String apellido,
            String email,
            String telefono,
            LocalDateTime fechaRegistro
    ) {
        // Constructor que acepta la entidad Usuario
        public UsuarioRespuestaDTO(Usuario usuario) {
            this(
                    usuario.getId(),
                    usuario.getNombre(),
                    usuario.getApellido(),
                    usuario.getEmail(),
                    usuario.getTelefono(),
                    usuario.getFechaRegistro()
            );
        }
    }
