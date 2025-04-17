package com.todoCompras.backend.controller;

import com.todoCompras.backend.dto.solicitudes.SolicitudRegistroLocalRequestDTO;
import com.todoCompras.backend.model.Local;
import com.todoCompras.backend.service.LocalService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/locales")
public class LocalesController {
    private final LocalService localService;

    @Autowired
    public LocalesController(LocalService localService) {
        this.localService = localService;
    }
    @GetMapping

    @PostMapping
    public ResponseEntity<?> crearLocal(@RequestBody SolicitudRegistroLocalRequestDTO dto) {
        Local nuevoLocal = localService.registrarLocal(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoLocal);
    }
}
