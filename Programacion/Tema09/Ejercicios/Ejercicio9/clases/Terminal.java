package Ejercicios.Ejercicio9.clases;

public class Terminal {
    
    String numero;
    int tiempo = 0;

    public Terminal(String n){
        this.numero = n;
    }

    public void llama(Terminal t,int tiempo) {
        this.tiempo += tiempo;
        t.tiempo += tiempo;
    }

    @Override
    public String toString() {
        return String.format("No %s - %ds de conversión",this.numero, this.tiempo );
    }

}
