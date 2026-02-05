package Ejercicios.Ejercicio2;

import Ejercicios.Ejercicio2.Clases.Caballo;

public class EJ2 {

    public static void main(String[] args) {
        
        Caballo babieca = new Caballo("Babieca");
        Caballo lykos = new Caballo("Lykos");

        babieca.saludo();
        babieca.cabalgar();
        babieca.graznar();

        lykos.saludo();
        lykos.cabalgar();
        lykos.graznar();
    }

    
}
