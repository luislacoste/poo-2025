package Ejercicio2;
public class Vehiculo {
    // Atributos
    private String marca;
    private double velocidad;
    
    // Constructor
    public Vehiculo(String marca, double velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }
    
    // Método desplazar
    public String desplazar() {
        return "Vehículo desplazándose";
    }
    
    // Getters y Setters
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public double getVelocidad() {
        return velocidad;
    }
    
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Vehículo marca " + marca + " con velocidad máxima de " + velocidad + " km/h";
    }
}