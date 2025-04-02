package Ejercicio4;
import Ejercicio1.Vehiculo;

public class Bicicleta extends Vehiculo {
    private int numeroMarchas;
    private String tipoFrenos;
    private boolean tieneCanasto;
    private String tipoTerreno;
    
    public Bicicleta(String marca, double velocidad, int numeroMarchas, 
                    String tipoFrenos, boolean tieneCanasto, String tipoTerreno) {
        super(marca, velocidad);
        this.numeroMarchas = numeroMarchas;
        this.tipoFrenos = tipoFrenos;
        this.tieneCanasto = tieneCanasto;
        this.tipoTerreno = tipoTerreno;
    }
    
    // Método desplazar sobrescrito con comportamiento específico para bicicletas
    @Override
    public String desplazar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bicicleta ");
        sb.append(getMarca());
        sb.append(" pedaleando ");
        
        if (numeroMarchas > 1) {
            sb.append("cambiando marchas ");
        }
        
        sb.append("por terreno ");
        sb.append(tipoTerreno.toLowerCase());
        
        if (tieneCanasto) {
            sb.append(" con canasto balanceándose");
        } else {
            sb.append(" ligera y ágil");
        }
        
        sb.append(". Velocidad máxima: ");
        sb.append(getVelocidad());
        sb.append(" km/h");
        
        return sb.toString();
    }
    
    public String saltarObstaculo() {
        return "Saltando obstáculo con la bicicleta " + getMarca();
    }
    
    // ... getters y setters
}