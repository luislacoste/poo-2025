package Ejercicio2;
//Clase base abstracta que podría contener lógica común para vehículos motorizados
public abstract class VehiculoMotorizado extends Vehiculo {
 private int cilindrada;
 private String tipoCombustible;
 
 public VehiculoMotorizado(String marca, double velocidad, int cilindrada, String tipoCombustible) {
     super(marca, velocidad);
     this.cilindrada = cilindrada;
     this.tipoCombustible = tipoCombustible;
 }
 
 // Método abstracto para arrancar motor
 public abstract String arrancarMotor();
 
 // Getters y setters
 public int getCilindrada() { return cilindrada; }
 public String getTipoCombustible() { return tipoCombustible; }
 // ... setters
}