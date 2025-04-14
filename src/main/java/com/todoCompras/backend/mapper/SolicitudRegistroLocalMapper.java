package com.todoCompras.backend.mapper;

import com.todoCompras.backend.model.Local;
import com.todoCompras.backend.model.SolicitudRegistroLocal;

public class SolicitudRegistroLocalMapper {

    public static Local toLocal(SolicitudRegistroLocal solicitud) {
        Local local = new Local();
        local.setNombre(solicitud.getNombre());
        local.setDireccion(solicitud.getDireccion());
        local.setTelefonoLlamadas(solicitud.getTelefonoLlamadas());
        local.setTelefonoWhatsapp(solicitud.getTelefonoWhatsapp());
        local.setUbicacionGoogleMaps(solicitud.getUbicacionGoogleMaps());
        local.setDescripcion(solicitud.getDescripcion());
        local.setDiasAtencionDesde(solicitud.getDiasAtencionDesde());
        local.setDiasAtencionHasta(solicitud.getDiasAtencionHasta());
        local.setHorarioAtencionDesde(solicitud.getHorarioAtencionDesde());
        local.setHorarioAtencionHasta(solicitud.getHorarioAtencionHasta());
        local.setEs24Horas(solicitud.isEs24Horas());
        local.setLinkInstagram(solicitud.getLinkInstagram());
        local.setLinkFacebook(solicitud.getLinkFacebook());
        local.setLinkPaginaWeb(solicitud.getLinkPaginaWeb());
        local.setFotoPerfil(solicitud.getFotoPerfil());
        local.setFotoBanner(solicitud.getFotoBanner());
        local.setUsuario(solicitud.getUsuario());
        return local;
    }
}
