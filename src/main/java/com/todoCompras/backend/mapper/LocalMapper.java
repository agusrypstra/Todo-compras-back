package com.todoCompras.backend.mapper;

import com.todoCompras.backend.dto.solicitudes.SolicitudRegistroLocalRequestDTO;
import com.todoCompras.backend.model.Categoria;
import com.todoCompras.backend.repository.CategoriaRepository;
import com.todoCompras.backend.repository.UsuarioRepository;
import com.todoCompras.backend.model.Local;
import com.todoCompras.backend.model.Usuario;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LocalMapper {

    private final UsuarioRepository usuarioRepository;
    private final CategoriaRepository categoriaRepository;

    @Autowired
    public LocalMapper(UsuarioRepository usuarioRepository, CategoriaRepository categoriaRepository) {
        this.usuarioRepository = usuarioRepository;
        this.categoriaRepository = categoriaRepository;
    }

    public Local toEntity(SolicitudRegistroLocalRequestDTO dto) {
        Local local = new Local();

        local.setNombre(dto.getNombre());

        Categoria categoria = categoriaRepository.findById(dto.getCategoriaId())
                .orElseThrow(() -> new EntityNotFoundException("Categoría no encontrada"));

        local.setCategoria(categoria);

        local.setDireccion(dto.getDireccion());
        local.setProvincia(dto.getProvincia());
        local.setLocalidad(dto.getLocalidad());
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

        Usuario usuario = usuarioRepository.findById(dto.getUsuarioId())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con ID: " + dto.getUsuarioId()));

        local.setUsuario(usuario);

        return local;
    }
}
