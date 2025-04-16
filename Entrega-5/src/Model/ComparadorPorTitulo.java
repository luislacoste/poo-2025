package Model;

import java.util.Comparator;

public class ComparadorPorTitulo implements Comparator<Libro> {
    public int compare(Libro l1, Libro l2) {
        return l1.getTitulo().compareToIgnoreCase(l2.getTitulo());
    }
}
