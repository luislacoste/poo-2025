import java.util.Scanner;

// import Ejercicio1.Televisor;
import Ejercicio2.Pantalla;
// import Ejercicio2.TelevisorEj2;
import Ejercicio3.TelevisorEj3;

public class App {
    public static void main(String[] args) {

        //Main Ejercicio 1

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Ingrese la marca del televisor: ");
        // String marca = scanner.nextLine();

        // System.out.print("Ingrese el modelo del televisor: ");
        // String modelo = scanner.nextLine();

        // System.out.print("Ingrese el año de fabricación del televisor: ");
        // int anioDeFabricacion = scanner.nextInt();

        // System.out.print("Ingrese el tipo del televisor (P: Plasma, L: LCD, O: OLED): ");
        // char tipo = scanner.next().toUpperCase().charAt(0);

        // while (tipo != 'P' && tipo != 'L' && tipo != 'O') {
        //     System.out.print("Tipo inválido. Ingrese P, L o O: ");
        //     tipo = scanner.next().toUpperCase().charAt(0);
        // }

        // System.out.print("¿El televisor es Smart? (true/false): ");
        // boolean esSmart = scanner.nextBoolean();

        // System.out.print("Ingrese el tamaño de la pantalla (en pulgadas): ");
        // int tamanoDePantalla = scanner.nextInt();

        // System.out.print("Ingrese la resolución del televisor (ej. 1080p, 4K): ");
        // scanner.nextLine(); // Limpiar buffer
        // String resolucion = scanner.nextLine();

        // Televisor televisor = new Televisor(marca, modelo, anioDeFabricacion, tipo, esSmart, tamanoDePantalla, resolucion);

        // System.out.println("\nInformación del televisor:");
        // System.out.println(televisor.mostrarInfo());
        
        // scanner.close();

        //Main Ejercicio 2
    //     Pantalla pantallaCompartida = new Pantalla(55, "4K");

    //     TelevisorEj2 tv1 = new TelevisorEj2("Samsung", "Series 9", 2023, 'O', true, pantallaCompartida);
    //     TelevisorEj2 tv2 = new TelevisorEj2("LG", "NanoCell", 2022, 'L', true, pantallaCompartida);

    //     System.out.println("Información inicial:");
    //     System.out.println(tv1.mostrarInfo());
    //     System.out.println(tv2.mostrarInfo());

    //     System.out.println("\nModificando la pantalla compartida...");
    //     pantallaCompartida.setResolucion("8K");
    //     pantallaCompartida.setTamano(65);

    //     System.out.println("Información actualizada:");
    //     System.out.println(tv1.mostrarInfo());
    //     System.out.println(tv2.mostrarInfo());
    // }

    //Main Ejercicio 3
        Scanner scanner = new Scanner(System.in);

        Pantalla pantallaCompartida = new Pantalla(55, "4K");

        TelevisorEj3 tv1 = new TelevisorEj3("Samsung", "Series 9", 2023, 'O', true, pantallaCompartida);
        TelevisorEj3 tv2 = new TelevisorEj3("LG", "NanoCell", 2022, 'L', true, pantallaCompartida);

        int opcion;
        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Encender TV 1");
            System.out.println("2. Apagar TV 1");
            System.out.println("3. Encender TV 2");
            System.out.println("4. Apagar TV 2");
            System.out.println("5. Ver estado de los televisores");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    tv1.encender();
                    break;
                case 2:
                    tv1.apagar();
                    break;
                case 3:
                    tv2.encender();
                    break;
                case 4:
                    tv2.apagar();
                    break;
                case 5:
                    System.out.println("\nEstado actual de los televisores:");
                    System.out.println(tv1.mostrarInfo());
                    System.out.println(tv2.mostrarInfo());
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}

