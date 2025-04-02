package Ejercicio2;
public class Moto extends VehiculoMotorizado {
    private boolean tieneSidecar;
    private String tipoManillar;
    
    public Moto(String marca, double velocidad, int cilindrada, 
               String tipoCombustible, boolean tieneSidecar, String tipoManillar) {
        super(marca, velocidad, cilindrada, tipoCombustible);
        this.tieneSidecar = tieneSidecar;
        this.tipoManillar = tipoManillar;
    }
    
    @Override
    public String arrancarMotor() {
        return "Motor de la moto arrancado con patada";
    }
    
    @Override
    public String desplazar() {
        return "Moto circulando entre el tráfico";
    }
    
    public String hacerCaballito() {
        return "Realizando caballito con la moto";
    }
    
    // ... getters y setters
}