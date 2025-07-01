package com.todoCompras.backend.service;

import com.todoCompras.backend.dto.local.LocalResponseDTO;
import com.todoCompras.backend.dto.solicitudes.SolicitudRegistroLocalRequestDTO;
import com.todoCompras.backend.mapper.LocalMapper;
import com.todoCompras.backend.model.Local;
import com.todoCompras.backend.repository.LocalRepository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalService {
    private final LocalRepository localRepository;
    private final LocalMapper localMapper;

    @Autowired
    public LocalService(LocalRepository localRepository, LocalMapper localMapper) {
        this.localRepository = localRepository;
        this.localMapper = localMapper;
    }
    public List<LocalResponseDTO> obtenerLocales() {
        List<Local> locales = localRepository.findAll();
        return locales.stream()
                .map(localMapper::toResponseDTO)
                .collect(Collectors.toList());
    }
    public List<Local> obtenerLocalPorCategoriaId(Long categoriaId) {
        return localRepository.obtenerLocalPorCategoriaId(categoriaId);
    }

    public Local registrarLocal(SolicitudRegistroLocalRequestDTO dto) {
        Local local = localMapper.toEntity(dto);
        return localRepository.save(local);
    }
    public Local findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

}
