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

    public String suma(Tiempo t1,Tiempo t2) {

        int horasTotal;
        int minutosTotal;
        int segundosTotal;

        horasTotal = t1.hora + t2.hora; 
        minutosTotal = t1.minuto + t2.minuto; 
        segundosTotal = t1.segundo + t2.segundo; 

        if (segundosTotal >= 60) {
            segundosTotal -= 60;
            minutosTotal++;
        }

        if (minutosTotal >= 60) {
            minutosTotal-= 60;
            horasTotal++;
        }

        Tiempo tiempoSumado = new Tiempo(horasTotal,minutosTotal,segundosTotal);

        
        return String.format(t1.toString() + " + " + t2.toString() + " = %dh %dm %ds", tiempoSumado.hora,tiempoSumado.minuto,tiempoSumado.segundo);
    }

    public String resta(Tiempo t1, Tiempo t2) {
        
        int horasTotal;
        int minutosTotal;
        int segundosTotal;

        horasTotal = t1.hora - t2.hora; 
        minutosTotal = t1.minuto - t2.minuto; 
        segundosTotal = t1.segundo - t2.segundo; 

        if (segundosTotal < 0) {
            segundosTotal += 60;
            minutosTotal--;
        }

        if (minutosTotal < 0) {
            minutosTotal+= 60;
            horasTotal--;
        }

        Tiempo tiempoSumado = new Tiempo(horasTotal,minutosTotal,segundosTotal);

        
        return String.format(t1.toString() + " - " + t2.toString() + " = %dh %dm %ds", tiempoSumado.hora,tiempoSumado.minuto,tiempoSumado.segundo);
    }

    @Override
    public String toString() { 
        return String.format("%dh %dm %ds",this.hora,this.minuto,this.segundo);
    }
}
