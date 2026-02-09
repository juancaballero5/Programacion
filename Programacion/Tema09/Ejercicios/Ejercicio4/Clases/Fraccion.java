package Ejercicios.Ejercicio4.Clases;

public class Fraccion {
    
    private int enumerador;
    private int denominador;

    public Fraccion(int enumerador, int denominador) {
        this.enumerador = enumerador;
        this.denominador = denominador;
    }

    /*Se puede acceder a los valores de frac porque son de la misma clase 
    */ 
    public Fraccion multiplicar(Fraccion frac) {
        return new Fraccion(this.enumerador * frac.enumerador, this.denominador * frac.denominador);
    }

    public Fraccion dividir(Fraccion frac) {
        return new Fraccion(this.enumerador * frac.denominador, this.denominador * frac.enumerador);
    }

    public Fraccion simplificar(Fraccion frac) {

        boolean fin = true;

        
        do {
            if ((frac.enumerador%2 == 0) && (frac.denominador%2 == 0)) {

                frac.enumerador /= 2;
                frac.denominador /= 2;

            } else if ((frac.enumerador%3 == 0) && (frac.denominador%3 == 0)) {

                frac.enumerador /= 3;
                frac.denominador /= 3;

            } else if ((frac.enumerador%5 == 0) && (frac.denominador%5 == 0)) {

                frac.enumerador /= 5;
                frac.denominador /= 5;

            } else if ((frac.enumerador%7 == 0) && (frac.denominador%7 == 0)) {

                frac.enumerador /= 7;
                frac.denominador /= 7;

            } else {
                fin = false;
            }
        } while (fin);

        return new Fraccion(frac.enumerador, frac.denominador);
    }

    public void invertir() {
        int aux = this.enumerador;

        this.enumerador = this.denominador;
        this.denominador = aux;
    }

    @Override
    public String toString() {
        return (this.denominador == 1)?"" + this.enumerador: this.enumerador + "/" + this.denominador ;
    }

}
