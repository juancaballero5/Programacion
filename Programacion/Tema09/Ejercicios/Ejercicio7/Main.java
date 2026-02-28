package Ejercicios.Ejercicio7;

import Ejercicios.Ejercicio7.clases.Tiempo;

public class Main {
    public static void main(String[] args) {
        
        Tiempo t1 = new Tiempo(1, 20, 30);
        Tiempo t2 = new Tiempo(0, 50, 30);

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        
        System.out.println(t1.suma(t1, t2));
        System.out.println(t1.resta(t1, t2));
    }
}
