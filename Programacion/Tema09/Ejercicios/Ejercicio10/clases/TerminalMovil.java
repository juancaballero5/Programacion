package Ejercicios.Ejercicio10.clases;

public class TerminalMovil {
    
    String numero;
    int tiempo = 0;

    public TerminalMovil(String n){
        this.numero = n;
    }

    public void llama(TerminalMovil t,int tiempo) {
        this.tiempo += tiempo;
        t.tiempo += tiempo;
    }

    @Override
    public String toString() {
        return String.format("No %s - %ds de conversión",this.numero, this.tiempo );
    }

}
