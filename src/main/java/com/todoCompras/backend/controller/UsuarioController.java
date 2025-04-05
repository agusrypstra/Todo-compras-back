package com.todoCompras.backend.controller;

import com.todoCompras.backend.dto.UsuarioRespuestaDTO;
import com.todoCompras.backend.model.Usuario;
import com.todoCompras.backend.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @GetMapping
    public List<UsuarioRespuestaDTO> listarUsuarios() {
        return usuarioService.obtenerTodosUsuarios()
                .stream()
                .map(UsuarioRespuestaDTO::new)
                .collect(Collectors.toList());
    }
    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@Valid @RequestBody Usuario usuario) {
        Usuario nuevoUsuario = usuarioService.registrarUsuario(usuario);
        return new ResponseEntity<>(nuevoUsuario, HttpStatus.CREATED);
    }
}
