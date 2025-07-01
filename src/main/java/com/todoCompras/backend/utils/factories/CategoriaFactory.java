package com.todoCompras.backend.utils.factories;

import com.todoCompras.backend.model.Categoria;

public class CategoriaFactory {

    public static Categoria crearCategoriaRaiz(String nombre) {
        Categoria categoria = new Categoria(nombre);
        categoria.setPadre(null); // Asegura que sea raíz
        return categoria;
    }

    public static Categoria crearCategoria(String nombre, Categoria padre) {
        Categoria categoria = new Categoria(nombre);
        categoria.setPadre(padre);
        return categoria;
    }
}