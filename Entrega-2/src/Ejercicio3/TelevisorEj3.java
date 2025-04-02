package Ejercicio3;
import Ejercicio2.Pantalla;
;

public class TelevisorEj3 {
    private String marca;
    private String modelo;
    private int anioDeFabricacion;
    private char tipo;
    private boolean esSmart;
    private Pantalla pantalla;
    private boolean encendido; 

    public TelevisorEj3(String marca, String modelo, int anioDeFabricacion, char tipo, boolean esSmart, Pantalla pantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioDeFabricacion = anioDeFabricacion;
        this.tipo = tipo;
        this.esSmart = esSmart;
        this.pantalla = pantalla;
        this.encendido = false;
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("El televisor " + marca + " " + modelo + " ha sido encendido.");
        } else {
            System.out.println("El televisor ya está encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("El televisor " + marca + " " + modelo + " ha sido apagado.");
        } else {
            System.out.println("El televisor ya está apagado.");
        }
    }

    public String estadoActual() {
        return encendido ? "Encendido" : "Apagado";
    }

    public String mostrarInfo() {
        String tipoStr;
        switch (tipo) {
            case 'P': tipoStr = "Plasma"; break;
            case 'L': tipoStr = "LCD"; break;
            case 'O': tipoStr = "OLED"; break;
            default: tipoStr = "Desconocido"; break;
        }
        return marca + " " + modelo + " -- " + tipoStr + " -- " + pantalla + " -- " + (esSmart ? "Smart" : "No Smart") + " -- Estado: " + estadoActual();
    }
}
