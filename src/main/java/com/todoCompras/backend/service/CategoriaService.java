package com.todoCompras.backend.service;

import com.todoCompras.backend.dto.CategoriaDTO;
import com.todoCompras.backend.repository.CategoriaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<CategoriaDTO> obtenerCategoriasPadre() {
        return categoriaRepository.findByCategoriaPadreIsNull()
                .stream()
                .map(cat -> new CategoriaDTO(cat.getId(), cat.getNombre()))
                .collect(Collectors.toList());
    }

    public List<CategoriaDTO> obtenerSubcategorias(Long categoriaPadreId) {
        return categoriaRepository.findByCategoriaPadreId(categoriaPadreId)
                .stream()
                .map(cat -> new CategoriaDTO(cat.getId(), cat.getNombre()))
                .collect(Collectors.toList());
    }
}