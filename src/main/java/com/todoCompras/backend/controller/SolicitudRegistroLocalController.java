package com.todoCompras.backend.controller;

import com.todoCompras.backend.dto.local.LocalRequestDTO;
import com.todoCompras.backend.model.SolicitudRegistroLocal;
import com.todoCompras.backend.service.SolicitudRegistroLocalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitudes")
public class SolicitudRegistroLocalController {
    private final SolicitudRegistroLocalService solicitudService;

    public SolicitudRegistroLocalController(SolicitudRegistroLocalService solicitudService) {
        this.solicitudService = solicitudService;
    }

    @PostMapping
    public ResponseEntity<SolicitudRegistroLocal> crearSolicitud(@RequestBody LocalRequestDTO localRequestDTO) {
        SolicitudRegistroLocal solicitud = new SolicitudRegistroLocal();
        return ResponseEntity.ok(solicitudService.crearSolicitud(solicitud));
    }

    @GetMapping("/pendientes")
    public ResponseEntity<List<SolicitudRegistroLocal>> obtenerSolicitudesPendientes() {
        return ResponseEntity.ok(solicitudService.obtenerSolicitudesPendientes());
    }

    @PutMapping("/{id}/aprobar")
    public ResponseEntity<SolicitudRegistroLocal> aprobarSolicitud(@PathVariable Long id) {
        return ResponseEntity.ok(solicitudService.aprobarSolicitud(id));
    }

    @PutMapping("/{id}/rechazar")
    public ResponseEntity<SolicitudRegistroLocal> rechazarSolicitud(@PathVariable Long id, @RequestBody List<String> motivos) {
        return ResponseEntity.ok(solicitudService.rechazarSolicitud(id, motivos));
    }
}
