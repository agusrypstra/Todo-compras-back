package com.todoCompras.backend.controller;

import com.todoCompras.backend.dto.local.LocalResponseDTO;
import com.todoCompras.backend.dto.solicitudes.SolicitudRegistroLocalRequestDTO;
import com.todoCompras.backend.mapper.LocalMapper;
import com.todoCompras.backend.model.Local;
import com.todoCompras.backend.service.LocalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/locales")
public class LocalesController {
    private final LocalService localService;
    private final LocalMapper localMapper;

    @Autowired
    public LocalesController(LocalService localService) {
        this.localMapper = new LocalMapper();
        this.localService = localService;
    }

    @GetMapping
    public ResponseEntity<List<LocalResponseDTO>> obtenerLocales() {
        List<LocalResponseDTO> locales = localService.obtenerLocales();
        return ResponseEntity.ok(locales);
    }
    @GetMapping("/{id}")
    public ResponseEntity<LocalResponseDTO> getLocalById(@PathVariable Long id) {
        Local local = localService.findById(id);
        return ResponseEntity.ok(localMapper.toResponseDTO(local));
    }
    @GetMapping("/categoria/{categoriaId}")
    public ResponseEntity<List<Local>> getLocalesByCategoriaId(
            @PathVariable Long categoriaId
    ) {
        List<Local> locales = localService.obtenerLocalPorCategoriaId(categoriaId);
        return ResponseEntity.ok(locales);
    }
    @PostMapping
    public ResponseEntity<?> crearLocal(@RequestBody SolicitudRegistroLocalRequestDTO dto) {
        Local nuevoLocal = localService.registrarLocal(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoLocal);
    }
}
