package Ejercicio2;
public class Coche extends VehiculoMotorizado {
    private int numeroPuertas;
    private String tipoCarroceria;
    
    public Coche(String marca, double velocidad, int cilindrada, 
                String tipoCombustible, int numeroPuertas, String tipoCarroceria) {
        super(marca, velocidad, cilindrada, tipoCombustible);
        this.numeroPuertas = numeroPuertas;
        this.tipoCarroceria = tipoCarroceria;
    }
    
    @Override
    public String arrancarMotor() {
        return "Motor del coche arrancado con llave";
    }
    
    @Override
    public String desplazar() {
        return "Coche circulando por la carretera";
    }
    
    public String abrirMaletero() {
        return "Maletero abierto";
    }
    
    // ... getters y setters
}