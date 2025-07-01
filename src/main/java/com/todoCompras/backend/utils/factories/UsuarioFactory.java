package com.todoCompras.backend.utils.factories;

import com.todoCompras.backend.model.Usuario;
import com.todoCompras.backend.model.enums.GeneroEnum;
import java.time.LocalDate;

public class UsuarioFactory {

    public static Usuario crearAdmin() {
        Usuario admin = new Usuario();
        admin.setNombre("Admin");
        admin.setApellido("Principal");
        admin.setEmail("admin@admin.com");
        admin.setContrasena("admin1234");
        admin.setTelefono("+5490000000000");
        admin.setFechaNacimiento(LocalDate.of(1990, 1, 1));
        admin.setGenero(GeneroEnum.OTRO);
        admin.setAceptaTerminos(true);
        admin.setEsAdmin(true);
        return admin;
    }

    public static Usuario crearUsuarioComun() {
        Usuario user = new Usuario();
        user.setNombre("Juan");
        user.setApellido("Pérez");
        user.setEmail("usuario@correo.com");
        user.setContrasena("usuario1234");
        user.setTelefono("+5491111111111");
        user.setFechaNacimiento(LocalDate.of(1995, 5, 15));
        user.setGenero(GeneroEnum.MASCULINO);
        user.setAceptaTerminos(true);
        return user;
    }
}