package Ejercicio2;
public class Bicicleta extends Vehiculo {
    private int numeroMarchas;
    private String tipoFrenos;
    private boolean tieneCanasto;
    
    public Bicicleta(String marca, double velocidad, int numeroMarchas, 
                    String tipoFrenos, boolean tieneCanasto) {
        super(marca, velocidad);
        this.numeroMarchas = numeroMarchas;
        this.tipoFrenos = tipoFrenos;
        this.tieneCanasto = tieneCanasto;
    }
    
    @Override
    public String desplazar() {
        return "Bicicleta pedaleando por el carril bici";
    }
    
    public String saltarObstaculo() {
        return "Saltando obstáculo con la bicicleta";
    }
    
    // ... getters y setters
}