package com.todoCompras.backend.mapper;
import org.springframework.stereotype.Component;

import com.todoCompras.backend.dto.local.LocalResponseDTO;
import com.todoCompras.backend.dto.solicitudes.SolicitudRegistroLocalRequestDTO;
import com.todoCompras.backend.model.Categoria;
import com.todoCompras.backend.model.Local;
import com.todoCompras.backend.model.SolicitudRegistroLocal;
import com.todoCompras.backend.model.Usuario;

@Component
public class LocalMapper {

    public LocalResponseDTO toResponseDTO(Local local) {
        if (local == null) {
            return null;
        }

        LocalResponseDTO dto = new LocalResponseDTO();
        dto.setId(local.getId());
        dto.setUsuario(mapUsuario(local.getUsuario()));
        dto.setCategoria(mapCategoria(local.getCategoria()));
        dto.setSolicitud(mapSolicitud(local.getSolicitud()));
        dto.setNombre(local.getNombre());
        dto.setProvincia(local.getProvincia());
        dto.setLocalidad(local.getLocalidad());
        dto.setDireccion(local.getDireccion());
        dto.setTelefonoLlamadas(local.getTelefonoLlamadas());
        dto.setTelefonoWhatsapp(local.getTelefonoWhatsapp());
        dto.setUbicacionGoogleMaps(local.getUbicacionGoogleMaps());
        dto.setDescripcion(local.getDescripcion());
        dto.setDiasAtencionDesde(local.getDiasAtencionDesde());
        dto.setDiasAtencionHasta(local.getDiasAtencionHasta());
        dto.setHorarioAtencionDesde(local.getHorarioAtencionDesde());
        dto.setHorarioAtencionHasta(local.getHorarioAtencionHasta());
        dto.setEs24Horas(local.isEs24Horas());
        dto.setLinkInstagram(local.getLinkInstagram());
        dto.setLinkFacebook(local.getLinkFacebook());
        dto.setLinkPaginaWeb(local.getLinkPaginaWeb());
        dto.setFotoPerfil(local.getFotoPerfil());
        dto.setFotoBanner(local.getFotoBanner());

        return dto;
    }

    private LocalResponseDTO.UsuarioMinimalDTO mapUsuario(Usuario usuario) {
        if (usuario == null) {
            return null;
        }
        return new LocalResponseDTO.UsuarioMinimalDTO(
            usuario.getId(),
            usuario.getNombre(),
            usuario.getEmail()
        );
    }

    private LocalResponseDTO.CategoriaMinimalDTO mapCategoria(Categoria categoria) {
        if (categoria == null) {
            return null;
        }
        return new LocalResponseDTO.CategoriaMinimalDTO(
            categoria.getId(),
            categoria.getNombre()
        );
    }

    private LocalResponseDTO.SolicitudMinimalDTO mapSolicitud(SolicitudRegistroLocal solicitud) {
        if (solicitud == null) {
            return null;
        }
        return new LocalResponseDTO.SolicitudMinimalDTO(
            solicitud.getId(),
            solicitud.getEstado().name()
        );
    }

    // Método para convertir de DTO a Entity si lo necesitas
    public Local toEntity(SolicitudRegistroLocalRequestDTO dto) {
        Local local = new Local();
        local.setNombre(dto.getNombre());
        local.setProvincia(dto.getProvincia());
        local.setLocalidad(dto.getLocalidad());
        local.setDireccion(dto.getDireccion());
        local.setTelefonoLlamadas(dto.getTelefonoLlamadas());
        local.setTelefonoWhatsapp(dto.getTelefonoWhatsapp());
        local.setUbicacionGoogleMaps(dto.getUbicacionGoogleMaps());
        local.setDescripcion(dto.getDescripcion());
        local.setDiasAtencionDesde(dto.getDiasAtencionDesde());
        local.setDiasAtencionHasta(dto.getDiasAtencionHasta());
        local.setHorarioAtencionDesde(dto.getHorarioAtencionDesde());
        local.setHorarioAtencionHasta(dto.getHorarioAtencionHasta());
        local.setEs24Horas(dto.isEs24Horas());
        local.setLinkInstagram(dto.getLinkInstagram());
        local.setLinkFacebook(dto.getLinkFacebook());
        local.setLinkPaginaWeb(dto.getLinkPaginaWeb());
        local.setFotoPerfil(dto.getFotoPerfil());
        local.setFotoBanner(dto.getFotoBanner());
        
        return local;
    }
}