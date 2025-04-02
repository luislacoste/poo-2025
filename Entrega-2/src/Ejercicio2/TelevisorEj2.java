package Ejercicio2;

public class TelevisorEj2 {
    private String marca;
    private String modelo;
    private int anioDeFabricacion;
    private char tipo;
    private boolean esSmart;
    private Pantalla pantalla;

    public TelevisorEj2(String marca, String modelo, int anioDeFabricacion, char tipo, boolean esSmart, Pantalla pantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioDeFabricacion = anioDeFabricacion;
        this.tipo = tipo;
        this.esSmart = esSmart;
        this.pantalla = pantalla;
    }

    public String mostrarInfo() {
        String tipoStr;
        switch (tipo) {
            case 'P': tipoStr = "Plasma"; break;
            case 'L': tipoStr = "LCD"; break;
            case 'O': tipoStr = "OLED"; break;
            default: tipoStr = "Desconocido"; break;
        }
        return marca + " " + modelo + " -- " + tipoStr + " -- " + pantalla + " -- " + (esSmart ? "Smart" : "No Smart");
    }
}
