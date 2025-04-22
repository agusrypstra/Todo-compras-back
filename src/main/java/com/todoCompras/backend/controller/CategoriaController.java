package com.todoCompras.backend.controller;

import com.todoCompras.backend.dto.CategoriaDTO;
import com.todoCompras.backend.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
@CrossOrigin(origins = "*")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping("/padres")
    public List<CategoriaDTO> getCategoriasPadre() {
        return categoriaService.obtenerCategoriasPadre();
    }

    @GetMapping("/subcategorias/{padreId}")
    public List<CategoriaDTO> getSubcategorias(@PathVariable Long padreId) {
        return categoriaService.obtenerSubcategorias(padreId);
    }
}