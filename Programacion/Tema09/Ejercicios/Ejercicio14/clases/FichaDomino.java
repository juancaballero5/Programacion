package Ejercicios.Ejercicio14.clases;

public class FichaDomino {
    
    private int ladoIzq;
    private int ladoDer;

    public FichaDomino(int izq,int der) {
        this.ladoIzq = izq;
        this.ladoDer = der;
    }

    public String voltea() {
        int cambio;

        cambio = this.ladoIzq;

        this.ladoIzq = this.ladoDer;
        this.ladoDer = cambio;

        return toString();
    }

    public boolean encaja(FichaDomino ficha) {

        boolean respuesta;

        if ((this.ladoDer == ficha.ladoDer) || (this.ladoDer == ficha.ladoIzq) || (this.ladoIzq == ficha.ladoDer) || (this.ladoIzq == ficha.ladoIzq) ) {
            respuesta = true;
        } else {
            respuesta = false;
        }

        return respuesta;
    }

    @Override
    public String toString() {
        return String.format("[%d|%d]", ladoIzq,ladoDer);
    }
}
