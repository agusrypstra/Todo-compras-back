package com.todoCompras.backend.config;

import com.todoCompras.backend.model.enums.GeneroEnum;
import com.todoCompras.backend.model.Categoria;
import com.todoCompras.backend.model.Usuario;
import com.todoCompras.backend.repository.CategoriaRepository;
import com.todoCompras.backend.repository.UsuarioRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.UUID;

@Configuration
public class DataInitializer {

    @Bean
    public ApplicationRunner initDatabase(UsuarioRepository usuarioRepository, CategoriaRepository categoriaRepository) {
        return new ApplicationRunner() {
            @Override
            public void run(ApplicationArguments args) {
                // Crear usuario administrador si no existe
                if (usuarioRepository.findByEmail("admin@admin.com").isEmpty()) {
                    Usuario admin = new Usuario();
                    admin.setNombre("Admin");
                    admin.setApellido("Principal");
                    admin.setEmail("admin@admin.com");
                    admin.setContrasena("admin1234"); // En producción, hashearla
                    admin.setTelefono("+5490000000000");
                    admin.setFechaNacimiento(LocalDate.of(1990, 1, 1));
                    admin.setGenero(GeneroEnum.OTRO);
                    admin.setAceptaTerminos(true);
                    admin.setEsAdmin(true);
                    usuarioRepository.save(admin);
                }

                // Crear usuario común si no existe
                if (usuarioRepository.findByEmail("usuario@correo.com").isEmpty()) {
                    Usuario user = new Usuario();
                    user.setNombre("Juan");
                    user.setApellido("Pérez");
                    user.setEmail("usuario@correo.com");
                    user.setContrasena("usuario1234");
                    user.setTelefono("+5491111111111");
                    user.setFechaNacimiento(LocalDate.of(1995, 5, 15));
                    user.setGenero(GeneroEnum.MASCULINO);
                    user.setAceptaTerminos(true);
                    user.setEsAdmin(false);
                    usuarioRepository.save(user);
                }

                // Crear categorías principales y subcategorías
                Categoria locales = categoriaRepository.save(new Categoria("locales"));
                Categoria emprendimientos = categoriaRepository.save(new Categoria("emprendimientos"));
                Categoria oficios = categoriaRepository.save(new Categoria("oficios"));

                createCategoriaIfNotExists(categoriaRepository, "restaurantes", locales.getId());
                createCategoriaIfNotExists(categoriaRepository, "artesanias", emprendimientos.getId());
                createCategoriaIfNotExists(categoriaRepository, "electricistas", oficios.getId());
            }
        };
    }

    private static void createCategoriaIfNotExists(CategoriaRepository categoriaRepository, String nombre, Long padreId) {
        if (categoriaRepository.findByNombre(nombre).isPresent()) return;

        Categoria categoria = new Categoria(nombre);

        if (padreId != null) {
            categoriaRepository.findById(padreId).ifPresent(categoria::setPadre);
        }

        categoriaRepository.save(categoria);
    }
}
