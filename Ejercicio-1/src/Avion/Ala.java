package Avion;
public class Ala {
    private String envergadura;
    private String tipoDeMaterial;
    private String color;

    public Ala(String envergadura, String tipoDeMaterial, String color) {
        this.envergadura = envergadura;
        this.tipoDeMaterial = tipoDeMaterial;
        this.color = color;
    }

    public void flap() {
        System.out.println("El ala de color " + color + " y de material " + tipoDeMaterial + " está activando los flaps.");
    }
    public void mostrarDatos() {
        System.out.println("Envergadura: " + envergadura);
        System.out.println("Tipo de material: " + tipoDeMaterial);
        System.out.println("Color: " + color);
    }
}
