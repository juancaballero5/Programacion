package Ejercicios.Ejercicio5;

import Ejercicios.Ejercicio5.clases.ColeccionDiscos;
import Ejercicios.Ejercicio5.clases.Disco;

public class Main {
    
    public static void main(String[] args) {
        
        ColeccionDiscos lista;
        int opcional;
        
        // Inicializamos la variables de discos
        lista = new ColeccionDiscos();

        lista.añadirDisco(new Disco("1234","Dangerous", "Michael Jackson", "Pop", 120));
        lista.añadirDisco(new Disco("1235","Electroviral", "Supersubmarina", "Pop", 100));
        lista.añadirDisco(new Disco("2222","Santa Trinidad", "Siloé", "Pop", 180));
        lista.añadirDisco(new Disco("3333","Animal", "Funambulista", "Pop", 90));

        do {
            
            menu();
            opcional = Integer.parseInt(System.console().readLine());

            switch (opcional) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    buscarDiscoPorCodigo(lista);
                    break;
                case 4:
                    
                    break;
            }

        } while (opcional != 0);
    }

    /**
     * 
     */
    public static void menu() {
        System.out.println("\n1. Añadir disco");
        System.out.println("2. Mostrar discos");
        System.out.println("3. Buscar disco");
        System.out.println("4. Eliminar disco");
        System.out.println("0. Salir");
    }

    /**
     * @param lista
     */
    public static void buscarDiscoPorCodigo(ColeccionDiscos lista) {
        String codigo;
        Disco disco;

        System.out.println("BUSCAR DISCO\n=======================");
        System.out.println("Introduzca el código del disco");
        codigo = System.console().readLine();

        if (!codigo.isBlank()) {
            
            disco = lista.buscarDisco(codigo);

            if (disco== null) {
                System.out.printf("El disco con el codigo %s no se ha encontrado", codigo);
            } else {
                System.out.println(disco);
            }
        }
    }

    public static void eliminarDisco(String codigo) {

        Disco disco;

        System.out.println("ELIMINAR DISCO\n=======================");
        System.out.println("Introduzca el código del disco");
        codigo = System.console().readLine();

        if (!codigo.isBlank()) {
            
            

            // if (/* == null*/) {
            //     System.out.printf("El disco con el codigo %s no se ha encontrado", codigo);
            // } else {
            //     System.out.println();
            // }
        }
    }

}
