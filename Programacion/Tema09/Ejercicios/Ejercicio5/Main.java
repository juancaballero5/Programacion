package Ejercicios.Ejercicio5;

import java.util.Scanner;

import Ejercicios.Ejercicio5.clases.Bicicleta;
import Ejercicios.Ejercicio5.clases.Coche;

public class Main {
    public static void main(String[] args) {

        int eleccion;
        int kilometros = 0;

        Scanner entrada = new Scanner(System.in);

        Coche coche = new Coche();
        Bicicleta bicicleta = new Bicicleta();
        
        do {

            menu();
            eleccion = entrada.nextInt();

            switch (eleccion) {
                case 1:
                    bicicleta.pedalear(kilometros);
                    break;
            
                case 2:
                    bicicleta.caballito();
                    break;
            
                case 3:
                    coche.anda(kilometros);
                    break;
            
                case 4:
                    coche.quemarRueda();
                    break;
            
                case 5:
                    System.out.println(bicicleta.getKilometrosRecorridos());
                    break;
            
                case 6:
                    System.out.println(coche.getKilometrosRecorridos());
                    break;
            
                case 7:
                    System.out.println(coche.getKilometrosTotales());
                    break;
            
                case 8:
                    eleccion = 8;
                    break;
            
                default:
                    break;
            }
            
        } while (eleccion == 8);
    }

    public static void menu() {

        System.out.println("1. Anda con la bicileta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Salir");
        System.out.print("Elige una opción (1-8):");
    }



}


