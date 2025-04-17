package com.todoCompras.backend.service;

import com.todoCompras.backend.dto.solicitudes.SolicitudRegistroLocalRequestDTO;
import com.todoCompras.backend.model.*;
import com.todoCompras.backend.model.enums.EstadoSolicitud;
import com.todoCompras.backend.repository.*;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SolicitudRegistroLocalService {

    private final SolicitudRegistroLocalRepository solicitudRepo;
    private final UsuarioRepository usuarioRepo;
    private final CategoriaRepository categoriaRepo;

    public SolicitudRegistroLocalService(
            SolicitudRegistroLocalRepository solicitudRepo,
            UsuarioRepository usuarioRepo,
            CategoriaRepository categoriaRepo
    ) {
        this.solicitudRepo = solicitudRepo;
        this.usuarioRepo = usuarioRepo;
        this.categoriaRepo = categoriaRepo;
    }

    @Transactional
    public Long crearSolicitud(SolicitudRegistroLocalRequestDTO dto) {
        Usuario usuario = usuarioRepo.findById(dto.getUsuarioId())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        Categoria categoria = categoriaRepo.findById(dto.getCategoriaId())
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada con ID: " + dto.getCategoriaId()));

        SolicitudRegistroLocal solicitud = mapFromDTO(dto, usuario, categoria);
        solicitudRepo.save(solicitud);

        return solicitud.getId();
    }

    private SolicitudRegistroLocal mapFromDTO(SolicitudRegistroLocalRequestDTO dto, Usuario usuario, Categoria categoria) {
        SolicitudRegistroLocal s = new SolicitudRegistroLocal();
        s.setUsuario(usuario);
        s.setCategoria(categoria);
        s.setNombre(dto.getNombre());
        s.setDireccion(dto.getDireccion());
        s.setTelefonoLlamadas(dto.getTelefonoLlamadas());
        s.setTelefonoWhatsapp(dto.getTelefonoWhatsapp());
        s.setUbicacionGoogleMaps(dto.getUbicacionGoogleMaps());
        s.setDescripcion(dto.getDescripcion());
        s.setDiasAtencionDesde(dto.getDiasAtencionDesde());
        s.setDiasAtencionHasta(dto.getDiasAtencionHasta());
        s.setHorarioAtencionDesde(dto.getHorarioAtencionDesde());
        s.setHorarioAtencionHasta(dto.getHorarioAtencionHasta());
        s.setEs24Horas(dto.isEs24Horas());
        s.setLinkInstagram(dto.getLinkInstagram());
        s.setLinkFacebook(dto.getLinkFacebook());
        s.setLinkPaginaWeb(dto.getLinkPaginaWeb());
        s.setFotoPerfil(dto.getFotoPerfil());
        s.setFotoBanner(dto.getFotoBanner());
        s.setEstado(EstadoSolicitud.PENDIENTE);
        return s;
    }
}
