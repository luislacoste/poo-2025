package Model;

import java.util.Comparator;

public class ComparadorPorAnio implements Comparator<Libro> {
    public int compare(Libro l1, Libro l2) {
        return Integer.compare(l1.getAnioPublicacion(), l2.getAnioPublicacion());
    }
}
