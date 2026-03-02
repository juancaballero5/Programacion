package Ejercicios.Ejercicio17;

import Ejercicios.Ejercicio17.clases.Piramide;
import Ejercicios.Ejercicio17.clases.Rectangulo;

public class Main {
    public static void main(String[] args) {
        
        Piramide p = new Piramide(4);
        Rectangulo r1 = new Rectangulo(2, 5);
        Rectangulo r2 = new Rectangulo(5, 2);

        System.out.println(p);
        System.out.println(r1);
        System.out.println(r2);

        System.out.println("Pirámides creadas : " + p.getPiramidesCreadas());
        System.out.println("Rectangulos creados : " + r1.getRectangulosCreados());
    }
}
