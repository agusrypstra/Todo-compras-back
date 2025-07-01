package com.todoCompras.backend.utils.factories;

import com.github.javafaker.Faker;
import com.todoCompras.backend.model.Categoria;
import com.todoCompras.backend.model.Local;
import com.todoCompras.backend.model.SolicitudRegistroLocal;
import com.todoCompras.backend.model.Usuario;
import com.todoCompras.backend.model.enums.EstadoSolicitud;

import java.time.LocalDateTime;
import java.util.Locale;

public class FicticioFactory {
    private static final Faker faker = new Faker(new Locale("es"));

    public static SolicitudRegistroLocal crearSolicitudAprobada(Usuario usuario, Categoria categoria, Usuario admin) {
        SolicitudRegistroLocal solicitud = new SolicitudRegistroLocal();
        solicitud.setEstado(EstadoSolicitud.APROBADA);
        solicitud.setUsuario(usuario);
        solicitud.setAdministrador(admin);
        solicitud.setCategoria(categoria);
        solicitud.setFechaSolicitud(LocalDateTime.now());
        
        // Datos del negocio
        solicitud.setNombre(faker.company().name());
        solicitud.setDireccion(faker.address().fullAddress());
        solicitud.setProvincia(faker.address().state());
        solicitud.setLocalidad(faker.address().city());
        solicitud.setTelefonoLlamadas(faker.phoneNumber().phoneNumber());
        solicitud.setTelefonoWhatsapp(faker.phoneNumber().cellPhone());
        solicitud.setDescripcion(faker.lorem().paragraph());
        solicitud.setDiasAtencionDesde("Lunes");
        solicitud.setDiasAtencionHasta("Viernes");
        solicitud.setHorarioAtencionDesde("08:00");
        solicitud.setHorarioAtencionHasta("18:00");
        solicitud.setFotoPerfil("https://picsum.photos/200/300");
        solicitud.setFotoBanner("https://picsum.photos/800/200");
        
        return solicitud;
    }

    public static Local crearLocalDesdeSolicitud(SolicitudRegistroLocal solicitud) {
        Local local = new Local();
        local.setUsuario(solicitud.getUsuario());
        local.setCategoria(solicitud.getCategoria());
        local.setSolicitud(solicitud);
        
        // Copiar datos de la solicitud al local
        local.setNombre(solicitud.getNombre());
        local.setProvincia(solicitud.getProvincia());
        local.setLocalidad(solicitud.getLocalidad());
        local.setDireccion(solicitud.getDireccion());
        local.setTelefonoLlamadas(solicitud.getTelefonoLlamadas());
        local.setTelefonoWhatsapp(solicitud.getTelefonoWhatsapp());
        local.setDescripcion(solicitud.getDescripcion());
        local.setDiasAtencionDesde(solicitud.getDiasAtencionDesde());
        local.setDiasAtencionHasta(solicitud.getDiasAtencionHasta());
        local.setHorarioAtencionDesde(solicitud.getHorarioAtencionDesde());
        local.setHorarioAtencionHasta(solicitud.getHorarioAtencionHasta());
        local.setFotoPerfil(solicitud.getFotoPerfil());
        local.setFotoBanner(solicitud.getFotoBanner());
        
        return local;
    }
}