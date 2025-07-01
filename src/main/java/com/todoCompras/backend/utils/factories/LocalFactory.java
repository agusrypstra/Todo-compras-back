package com.todoCompras.backend.utils.factories;

import com.todoCompras.backend.model.*;

public class LocalFactory {

    public static Local crearRestaurante(Usuario usuario, Categoria categoria, SolicitudRegistroLocal solicitud) {
        Local local = new Local();
        local.setNombre("El Buen Sabor");
        local.setUsuario(usuario);
        local.setCategoria(categoria);
        local.setSolicitud(solicitud);
        local.setProvincia("Buenos Aires");
        local.setLocalidad("La Plata");
        local.setDireccion("Calle 123");
        local.setTelefonoLlamadas("221-1234567");
        local.setTelefonoWhatsapp("221-7654321");
        local.setDescripcion("Comida casera y pizzas al horno de barro");
        local.setDiasAtencionDesde("Lunes");
        local.setDiasAtencionHasta("Domingo");
        local.setHorarioAtencionDesde("10:00");
        local.setHorarioAtencionHasta("23:00");
        local.setFotoPerfil("restaurante-perfil.jpg");
        local.setFotoBanner("restaurante-banner.jpg");
        return local;
    }

    public static Local crearArtesania(Usuario usuario, Categoria categoria, SolicitudRegistroLocal solicitud) {
        Local local = new Local();
        local.setNombre("Manos Creativas");
        local.setUsuario(usuario);
        local.setCategoria(categoria);
        local.setSolicitud(solicitud);
        local.setProvincia("Córdoba");
        local.setLocalidad("Villa Carlos Paz");
        local.setDireccion("Av. San Martín 456");
        local.setTelefonoLlamadas("3541-987654");
        local.setTelefonoWhatsapp("3541-123456");
        local.setDescripcion("Artesanías en cuero y cerámica");
        local.setDiasAtencionDesde("Martes");
        local.setDiasAtencionHasta("Sábado");
        local.setHorarioAtencionDesde("09:00");
        local.setHorarioAtencionHasta("18:00");
        local.setFotoPerfil("artesania-perfil.jpg");
        local.setFotoBanner("artesania-banner.jpg");
        return local;
    }
}