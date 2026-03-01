package Ejercicios.Ejercicio11;

import Ejercicios.Ejercicio11.clases.Ameba;

public class Main {
    public static void main(String[] args) {
        
        Ameba a1 = new Ameba();
        Ameba a2 = new Ameba();

        a1.come(2);
        System.out.println(a1);
        a2.come(4);
        System.out.println(a2);
        a1.come(a2);
        System.out.println(a1);
        System.out.println(a2);
        a2.come(3);
        System.out.println(a2);
    }
}
