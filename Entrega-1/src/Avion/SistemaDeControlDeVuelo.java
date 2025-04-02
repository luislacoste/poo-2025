package Avion;

public class SistemaDeControlDeVuelo {
    private String fabricante;
    private int numeroDeModos;
    private String tipoDeSistema;

    public SistemaDeControlDeVuelo(String fabricante, int numeroDeModos, String tipoDeSistema) {
        this.fabricante = fabricante;
        this.numeroDeModos = numeroDeModos;
        this.tipoDeSistema = tipoDeSistema;
    }

    public void cambiarModo(){
        System.out.println("El sistema de control de vuelo está cambiando de modo.");
    }

    public void imprimirDatos(){
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Número de modos: " + numeroDeModos);
        System.out.println("Tipo de sistema: " + tipoDeSistema);
    }
}
