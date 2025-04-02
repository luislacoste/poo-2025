package Ejercicio5;
import Ejercicio2.Vehiculo;
import Ejercicio2.VehiculoMotorizado;
import Ejercicio3.Coche;
import Ejercicio2.Moto;
import Ejercicio2.Bicicleta;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de vehículo
        Coche coche = new Coche("Toyota", 180, 2000, "Gasolina", 5, "Sedán");
        Moto moto = new Moto("Honda", 120, 600, "Gasolina", false, "Deportivo");
        Bicicleta bici = new Bicicleta("Trek", 30, 21, "Disco", true);
        
        // Demostración de sobrescritura (override)
        System.out.println("=== Demostración de sobrescritura ===");
        System.out.println(coche.desplazar());  // Método de Coche
        System.out.println(moto.desplazar());   // Método de Moto
        System.out.println(bici.desplazar());   // Método sobrescrito de Bicicleta
        
        // Demostración de sobrecarga (overload) en Coche
        System.out.println("\n=== Demostración de sobrecarga ===");
        System.out.println(coche.desplazar(Coche.ModoConduccion.NORMAL));
        System.out.println(coche.desplazar(Coche.ModoConduccion.AUTOMATICO));
        System.out.println(coche.desplazar(Coche.ModoConduccion.DEPORTIVO));
        System.out.println(coche.desplazar(Coche.ModoConduccion.ECO));
        
        // Demostración de polimorfismo con array de Vehículo
        System.out.println("\n=== Demostración de polimorfismo ===");
        Vehiculo[] vehiculos = {coche, moto, bici};
        
        for (Vehiculo v : vehiculos) {
            System.out.println(v.desplazar()); // Se llama al método adecuado para cada tipo
            
            // Verificación adicional para VehiculoMotorizado
            if (v instanceof VehiculoMotorizado) {
                System.out.println(((VehiculoMotorizado)v).arrancarMotor());
            }
        }
    }
}