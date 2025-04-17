package com.todoCompras.backend.service;


import com.todoCompras.backend.dto.solicitudes.SolicitudRegistroLocalRequestDTO;
import com.todoCompras.backend.mapper.LocalMapper;
import com.todoCompras.backend.model.Local;
import com.todoCompras.backend.repository.LocalRepository;
import com.todoCompras.backend.repository.UsuarioRepository;
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

    public Local registrarLocal(SolicitudRegistroLocalRequestDTO dto) {
        Local local = localMapper.toEntity(dto);
        return localRepository.save(local);
    }

}
