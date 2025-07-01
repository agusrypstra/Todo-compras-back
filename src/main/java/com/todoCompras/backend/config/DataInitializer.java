package com.todoCompras.backend.config;

import com.todoCompras.backend.model.Categoria;
import com.todoCompras.backend.model.Local;
import com.todoCompras.backend.model.SolicitudRegistroLocal;
import com.todoCompras.backend.model.Usuario;
import com.todoCompras.backend.repository.CategoriaRepository;
import com.todoCompras.backend.repository.LocalRepository;
import com.todoCompras.backend.repository.SolicitudRegistroLocalRepository;
import com.todoCompras.backend.repository.UsuarioRepository;
import com.todoCompras.backend.utils.factories.CategoriaFactory;
import com.todoCompras.backend.utils.factories.FicticioFactory;
import com.todoCompras.backend.utils.factories.UsuarioFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class DataInitializer {

    @Bean
    public ApplicationRunner initDatabase(UsuarioRepository usuarioRepository,
            CategoriaRepository categoriaRepository,
            LocalRepository localRepository,
            SolicitudRegistroLocalRepository solicitudRepository) {
    return args -> {
        // 1. Crear usuarios
        Usuario admin = usuarioRepository.findByEmail("admin@admin.com")
            .orElseGet(() -> usuarioRepository.save(UsuarioFactory.crearAdmin()));
        
        Usuario user = usuarioRepository.findByEmail("usuario@correo.com")
            .orElseGet(() -> usuarioRepository.save(UsuarioFactory.crearUsuarioComun()));

        // 2. Crear categorías
        
        // ===== 1. Crear categorías padres fijas =====
            Categoria locales = crearCategoriaPadreSiNoExiste(categoriaRepository, "locales");
            Categoria emprendimientos = crearCategoriaPadreSiNoExiste(categoriaRepository, "emprendimientos");
            Categoria profesionales = crearCategoriaPadreSiNoExiste(categoriaRepository, "profesionales");

            // ===== 2. Crear subcategorías para cada padre =====
            // Locales
            crearSubcategoriaSiNoExiste(categoriaRepository, "restaurantes", locales);
            crearSubcategoriaSiNoExiste(categoriaRepository, "cafeterías", locales);
            crearSubcategoriaSiNoExiste(categoriaRepository, "bares", locales);

            // Emprendimientos
            crearSubcategoriaSiNoExiste(categoriaRepository, "artesanías", emprendimientos);
            crearSubcategoriaSiNoExiste(categoriaRepository, "diseño gráfico", emprendimientos);
            crearSubcategoriaSiNoExiste(categoriaRepository, "ropa handmade", emprendimientos);

            // Profesionales
            crearSubcategoriaSiNoExiste(categoriaRepository, "abogados", profesionales);
            crearSubcategoriaSiNoExiste(categoriaRepository, "médicos", profesionales);
            crearSubcategoriaSiNoExiste(categoriaRepository, "arquitectos", profesionales);
        
            
            List<Categoria> subcategorias = categoriaRepository.findByPadreIsNotNull();


        

            if (localRepository.count() == 0) {
                subcategorias.forEach(subcategoria -> {
                    for (int i = 0; i < 1; i++) {
                        // Crear solicitud aprobada
                        SolicitudRegistroLocal solicitud = FicticioFactory.crearSolicitudAprobada(
                            user, 
                            subcategoria,
                            admin
                        );
                        solicitud = solicitudRepository.save(solicitud);
                        
                        // Crear local asociado
                        Local local = FicticioFactory.crearLocalDesdeSolicitud(solicitud);
                        localRepository.save(local);
                    }
                });
            }
    };
}

    private Categoria crearCategoriaPadreSiNoExiste(CategoriaRepository repo, String nombre) {
        return repo.findByNombre(nombre)
            .orElseGet(() -> repo.save(CategoriaFactory.crearCategoriaRaiz(nombre)));
    }

    private void crearSubcategoriaSiNoExiste(CategoriaRepository repo, String nombre, Categoria padre) {
        if (!repo.existsByNombreAndPadreId(nombre, padre.getId())) {
            repo.save(CategoriaFactory.crearCategoria(nombre, padre));
        }
    }
}
