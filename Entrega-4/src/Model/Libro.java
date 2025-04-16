package Model;

import java.util.*;

public class Libro {
    /*   Clase Model.Libro:
       Atributos: título, autor, año de publicación e ISBN.
       Implementar el método toString() para mostrar la información del libro.
       Implementar interfaces de comparación (Comparable y Comparator) para poder comparar libros por título, autor y año de publicación.

       Gestión de Colecciones:
       Utilizar una colección adecuada (como ArrayList o HashSet) para almacenar los libros.
       Implementar métodos para agregar y eliminar libros de la colección.
       Implementar la búsqueda de libros dentro de la colección utilizando un iterador.
   */
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String isbn;


    public Libro(String titulo, String autor, int anioPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.isbn = isbn;
    }


    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año de publicación: " + anioPublicacion + ", ISBN: " + isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return isbn.equals(libro.isbn);
    }

}


