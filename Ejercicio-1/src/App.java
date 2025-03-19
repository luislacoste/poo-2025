import Avion.Ala;
import Avion.SistemaDeControlDeVuelo;
import Avion.MotorDeAvion;

public class App {
    public static void main(String[] args) throws Exception {
        // Ej 1
        Ala alaIzquierda = new Ala("10" ,"Aluminio", "Verde");
        Ala alaDerecha = new Ala("22", "Metal", "Azul");
        alaIzquierda.flap();
        alaDerecha.flap();
        alaIzquierda.mostrarDatos();
        alaDerecha.mostrarDatos();

        // Ej 2  
        SistemaDeControlDeVuelo primerSistema = new SistemaDeControlDeVuelo("Boeing", 3, "Automático");
        primerSistema.cambiarModo();
        primerSistema.imprimirDatos();

        //Ej 3
        MotorDeAvion motor1 = new MotorDeAvion("Rolls Royce", 1000, 2000);
        motor1.encender();
        motor1.imprimirDatosMotor();
        motor1.apagar();
    }
}
