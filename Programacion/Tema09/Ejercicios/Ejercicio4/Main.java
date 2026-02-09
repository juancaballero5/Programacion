package Ejercicios.Ejercicio4;

import Ejercicios.Ejercicio4.Clases.Fraccion;

public class Main {
    public static void main(String[] args) {
        
        Fraccion fraccion4 = new Fraccion(-910, 350);
        Fraccion fraccion3 = new Fraccion(3, 1);
        Fraccion fraccion2 = new Fraccion(3, 5);
        Fraccion fraccion1 = new Fraccion(-7, 8);

        System.out.println(fraccion3);  

        System.out.println(fraccion1.multiplicar(fraccion2));
        System.out.println(fraccion1.multiplicar(fraccion3));
        System.out.println(fraccion1.simplificar(fraccion4));

        fraccion1.invertir();
    }
}
