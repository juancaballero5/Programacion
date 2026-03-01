package Ejercicios.Ejercicio10;

import Ejercicios.Ejercicio10.clases.Movil;

public class Main {
    public static void main(String[] args) {
        Movil m1 = new Movil("664 32 45 87", "mono");

        m1.llama(m1, 300);
    }
}
