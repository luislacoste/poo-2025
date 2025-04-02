package Ejercicio3;
import Ejercicio2.VehiculoMotorizado;

public class Coche extends VehiculoMotorizado {
    private int numeroPuertas;
    private String tipoCarroceria;
    
    public Coche(String marca, double velocidad, int cilindrada, 
                String tipoCombustible, int numeroPuertas, String tipoCarroceria) {
        super(marca, velocidad, cilindrada, tipoCombustible);
        this.numeroPuertas = numeroPuertas;
        this.tipoCarroceria = tipoCarroceria;
    }
    
    // Método desplazar original (sin parámetros)
    @Override
    public String desplazar() {
        return "Coche circulando por la carretera en modo normal";
    }
    
    // Método desplazar sobrecargado (con parámetro de modo)
    public String desplazar(ModoConduccion modo) {
        switch(modo) {
            case AUTOMATICO:
                return "Coche circulando en modo automático (sin intervención del conductor)";
            case NORMAL:
                return "Coche circulando en modo manual (conductor controlando cambios)";
            case DEPORTIVO:
                return "Coche circulando en modo deportivo (máxima aceleración)";
            case ECO:
                return "Coche circulando en modo ecológico (consumo optimizado)";
            default:
                return desplazar(); // Llama a la versión sin parámetros
        }
    }
    
    // Enumeración para los modos de conducción
    public enum ModoConduccion {
        NORMAL, AUTOMATICO, DEPORTIVO, ECO
    }
    
    @Override
    public String arrancarMotor() {
        return "Motor del coche arrancado con llave";
    }
    
    public String abrirMaletero() {
        return "Maletero abierto";
    }
    
    // ... getters y setters
}