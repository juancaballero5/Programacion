package Ejercicios.Ejercicio11.clases;

public class Ameba {

    private int peso;

    public Ameba() {
        this.peso = 3;
    }

    public void come(int n) {
        this.peso += n - 1;
    }

    public void come(Ameba n) {
        this.peso += n.peso - 1;
        n.peso = 0;
    }

    @Override
    public String toString() {
        return String.format("Soy una ameba y peso %d microgramos.", this.peso);
    }

}
