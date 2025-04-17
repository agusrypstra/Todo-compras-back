package com.todoCompras.backend.controller;

import com.todoCompras.backend.dto.solicitudes.SolicitudRegistroLocalRequestDTO;
import com.todoCompras.backend.model.SolicitudRegistroLocal;
import com.todoCompras.backend.service.SolicitudRegistroLocalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/api/solicitudes")
public class SolicitudRegistroLocalController {

    private final SolicitudRegistroLocalService solicitudService;

    public SolicitudRegistroLocalController(SolicitudRegistroLocalService solicitudService) {
        this.solicitudService = solicitudService;
    }

    @PostMapping
    public ResponseEntity<Void> crearSolicitud(@RequestBody SolicitudRegistroLocalRequestDTO dto) {
        Long id = solicitudService.crearSolicitud(dto);
        return ResponseEntity.created(URI.create("/api/solicitudes/" + id)).build();
    }
}