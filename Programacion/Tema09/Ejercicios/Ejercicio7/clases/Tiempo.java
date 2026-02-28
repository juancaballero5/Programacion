package Ejercicios.Ejercicio7.clases;

public class Tiempo {
    
    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo (int hora,int minuto,int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void suma() {
        
    }

    public void resta() {
        
    }

    @Override
    public String toString() { 
        return String.format("pizza %dh %dm %ds");
    }
}
