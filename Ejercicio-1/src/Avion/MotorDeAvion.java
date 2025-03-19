package Avion;

public class MotorDeAvion {
    private String marca;
    private int caballosDeFuerza;
    private int empuje;

    public MotorDeAvion(String marca, int caballosDeFuerza, int empuje) {
        this.marca = marca;
        this.caballosDeFuerza = caballosDeFuerza;
        this.empuje = empuje;
    }

    public void encender() {
        System.out.println("El motor de la marca " + marca + " está encendido.");
    }
    public void apagar() {
        System.out.println("El motor de la marca " + marca + " está apagado.");
    }
    public void imprimirDatosMotor() {
        System.out.println("Marca: " + marca);
        System.out.println("Caballos de fuerza: " + caballosDeFuerza);
        System.out.println("Empuje: " + empuje);
    }
    
}
