import Model.Libro;
import java.util.*;
import Model.ComparadorPorTitulo;
import Model.ComparadorPorAnio;


public class Main {
    private static Set<Libro> libros = new HashSet<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = -1;
        while (opcion != 0) {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            if (opcion == 1) {
                agregarLibro();
            } else if (opcion == 2) {
                eliminarLibro();
            } else if (opcion == 3) {
                buscarLibro();
            } else if (opcion == 4) {
                mostrarLibros();
            } else if (opcion == 5) {
                ordenarPorTitulo();
            } else if (opcion == 6) {
                ordenarPorAnio();
            } else if (opcion == 0) {
                System.out.println("Saliendo del sistema.");
            } else {
                System.out.println("Opción no válida.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú Biblioteca ---");
        System.out.println("1. Agregar libro");
        System.out.println("2. Eliminar libro");
        System.out.println("3. Buscar libro por ISBN");
        System.out.println("4. Mostrar todos los libros");
        System.out.println("5. Mostrar libros ordenados por título");
        System.out.println("6. Mostrar libros ordenados por año de publicación");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void agregarLibro() {
        // libros de ejemplo
        Libro libro1 = new Libro("Boca", "Gago", 2025, "978-3-16-148410-0");
        Libro libro2 = new Libro("Racing", "Costas", 1999, "978-3-16-148410-1");
        Libro libro3 = new Libro("River", "Ponzio", 2020, "978-3-16-148410-2");
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);

        System.out.println("Libros de ejemplo agregados.");
    }

    private static void eliminarLibro() {
        System.out.print("Ingrese el ISBN del libro a eliminar: ");
        String isbn = scanner.nextLine();

        Iterator<Libro> iterator = libros.iterator();
        while (iterator.hasNext()) {
            Libro libro = iterator.next();
            if (libro.getIsbn().equals(isbn)) {
                iterator.remove();
                System.out.println("Libro eliminado exitosamente.");
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    private static void buscarLibro() {
        System.out.print("Ingrese el ISBN del libro a buscar: ");
        String isbn = scanner.nextLine();

        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                System.out.println("Libro encontrado: " + libro);
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    private static void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            System.out.println("Libros en la biblioteca:");
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }

    private static void ordenarPorTitulo() {
        List<Libro> lista = new ArrayList<>(libros);
        lista.sort(new ComparadorPorTitulo());
        System.out.println("Libros ordenados por título:");
        for (Libro libro : lista) {
            System.out.println(libro);
        }
    }

    private static void ordenarPorAnio() {
        List<Libro> lista = new ArrayList<>(libros);
        lista.sort(new ComparadorPorAnio());
        System.out.println("Libros ordenados por año de publicación:");
        for (Libro libro : lista) {
            System.out.println(libro);
        }
    }

}