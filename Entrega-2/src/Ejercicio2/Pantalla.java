package Ejercicio2;
public class Pantalla {
    private int tamano;
    private String resolucion;

    public Pantalla(int tamano, String resolucion) {
        this.tamano = tamano;
        this.resolucion = resolucion;
    }

    public String getResolucion() {
        return resolucion;
    }

    public int getTamano() {
        return tamano;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return tamano + " pulgadas, " + resolucion;
    }

}
