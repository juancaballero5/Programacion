package Ejercicios.Ejercicio9;

import Ejercicios.Ejercicio9.clases.Terminal;

public class Main {
    public static void main(String[] args) {
        
        Terminal t1 = new Terminal("678 11 22 33");
        Terminal t2 = new Terminal("644 74 44 06");
        Terminal t3 = new Terminal("622 32 89 21");
        Terminal t4 = new Terminal("664 73 77 12");

        System.out.println(t1);
        System.out.println(t2);

        t1.llama(t2, 320);
        t1.llama(t3, 200);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }
}
