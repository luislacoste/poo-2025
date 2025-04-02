package Ejercicio1;
import java.util.Scanner;

public class Televisor {
    private String marca;
    private String modelo;
    private int anioDeFabricacion;
    private char tipo;
    private boolean esSmart;
    private int tamanoDePantalla;
    private String resolucion;

    public Televisor(String marca, String modelo, int anioDeFabricacion, char tipo, boolean esSmart, int tamanoDePantalla, String resolucion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioDeFabricacion = anioDeFabricacion;
        this.tipo = tipo;
        this.esSmart = esSmart;
        this.tamanoDePantalla = tamanoDePantalla;
        this.resolucion = resolucion;
    }

    public String mostrarInfo() {
        String tipoStr;
        switch (tipo) {
            case 'P': tipoStr = "Plasma"; break;
            case 'L': tipoStr = "LCD"; break;
            case 'O': tipoStr = "OLED"; break;
            default: tipoStr = "Desconocido"; break;
        }
        String pantalla = tamanoDePantalla + " pulgadas " + resolucion;
        return marca + " " + modelo + " -- " + tipoStr + " -- " + pantalla + " -- " + (esSmart ? "Smart" : "No Smart");
    }
}
