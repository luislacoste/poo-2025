//Ejercicio 4
package Avion;


public class Avion {
    private String modelo;
    private String marca;
    private MotorDeAvion motor;
    private SistemaDeControlDeVuelo sistemaDeControlDeVuelo;
    private Ala alaIzquierda;
    private Ala alaDerecha;
    private int numeroDeAsientos;
    private boolean tieneEntretenimiento;

    public Avion(String modelo, String marca, MotorDeAvion motor, SistemaDeControlDeVuelo sistemaDeControlDeVuelo,
        Ala alaIzquierda, Ala alaDerecha, int numeroDeAsientos, boolean tieneEntretenimiento) {
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
        this.sistemaDeControlDeVuelo = sistemaDeControlDeVuelo;
        this.alaIzquierda = alaIzquierda;
        this.alaDerecha = alaDerecha;
        this.numeroDeAsientos = numeroDeAsientos;
        this.tieneEntretenimiento = tieneEntretenimiento;
    }

    public void mostrarDatos() {
        System.out.println("Avión - Modelo: " + modelo + ", Marca: " + marca + ", Asientos: " + numeroDeAsientos + ", Entretenimiento: " + (tieneEntretenimiento ? "Sí" : "No"));
        motor.imprimirDatosMotor();
        sistemaDeControlDeVuelo.imprimirDatos();
        alaIzquierda.mostrarDatos();
        alaDerecha.mostrarDatos();
    }

    public static void main(String[] args) {
        MotorDeAvion motor = new MotorDeAvion("Rolls-Royce", 50000, 80000);
        SistemaDeControlDeVuelo controlDeVuelo = new SistemaDeControlDeVuelo("Boeing", 5, "Autopiloto");
        Ala alaIzquierda = new Ala("20", "Blanco", "Aluminio");
        Ala alaDerecha = new Ala("20", "Blanco", "Aluminio");
        
        Avion avion1 = new Avion("747", "Boeing", motor, controlDeVuelo, alaIzquierda, alaDerecha, 300, true);

        Avion avion2 = new Avion("737", "Boeing", motor, controlDeVuelo, alaIzquierda, alaDerecha, 200, false);

        
        avion1.mostrarDatos();
        avion2.mostrarDatos();
    }
    
}
