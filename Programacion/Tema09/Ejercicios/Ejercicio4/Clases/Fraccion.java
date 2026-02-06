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

        do {
            this.enumerador%5 == 0
        } while (condition);
        return new Fraccion(this.enumerador * frac.enumerador, this.denominador * frac.denominador);
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
