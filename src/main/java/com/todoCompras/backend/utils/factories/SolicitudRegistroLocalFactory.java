package com.todoCompras.backend.utils.factories;

import com.todoCompras.backend.model.*;
import com.todoCompras.backend.model.enums.EstadoSolicitud;
import java.time.LocalDateTime;
import java.util.Collections;

public class SolicitudRegistroLocalFactory {

    public static SolicitudRegistroLocal crearSolicitudPendiente(
        Usuario usuario,
        Categoria categoria
    ) {
        SolicitudRegistroLocal solicitud = new SolicitudRegistroLocal();
        solicitud.setEstado(EstadoSolicitud.PENDIENTE);
        solicitud.setUsuario(usuario);
        solicitud.setCategoria(categoria);
        solicitud.setNombre("Mi Negocio Ejemplo");
        solicitud.setDireccion("Calle Falsa 123");
        solicitud.setProvincia("Buenos Aires");
        solicitud.setLocalidad("La Plata");
        solicitud.setTelefonoLlamadas("221-1234567");
        solicitud.setTelefonoWhatsapp("221-9876543");
        solicitud.setDescripcion("Descripción del negocio");
        solicitud.setDiasAtencionDesde("Lunes");
        solicitud.setDiasAtencionHasta("Viernes");
        solicitud.setHorarioAtencionDesde("08:00");
        solicitud.setHorarioAtencionHasta("18:00");
        solicitud.setFotoPerfil("foto-perfil.jpg");
        solicitud.setFotoBanner("foto-banner.jpg");
        solicitud.setMotivosRechazo(Collections.emptyList());
        return solicitud;
    }

    public static SolicitudRegistroLocal crearSolicitudAprobada(
        Usuario usuario,
        Usuario administrador,
        Categoria categoria
    ) {
        SolicitudRegistroLocal solicitud = crearSolicitudPendiente(usuario, categoria);
        solicitud.setEstado(EstadoSolicitud.APROBADA);
        solicitud.setAdministrador(administrador);
        return solicitud;
    }
}