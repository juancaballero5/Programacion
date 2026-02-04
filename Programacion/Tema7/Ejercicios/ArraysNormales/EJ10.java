package Ejercicios.ArraysNormales;

import java.util.Scanner;

public class EJ10 {
    
    public static int ASIENTOS = 4;
    public static int MAXIMO_MESAS = 10;

    public static void main(String[] args) {

        int eleccion;
        int fin = 0;
        int contador1 = 0;
        int contador2 = 0;

        int []mesas = new int[MAXIMO_MESAS];

        Scanner esc = new Scanner(System.in);

        try {
            
            for (int i = 0; i < MAXIMO_MESAS ; i++) {
                
                mesas[i] = (int) (Math.random() * 4 );

            }

            do {
                
                mostrarMesas(mesas);
    
                System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa):");
                eleccion = esc.nextInt();
    
                switch (eleccion) {
                    case -1:
                        
                        System.out.println("Gracias. Hasta pronto.");
                        fin = 1;
    
                    break;
    
                    case 1:
                        
                        contador1 = mesaVacia (mesas);

                        if (contador1 > 0) {
                            System.out.printf("Por favor, siéntese en la mesa número %d.",contador1);
                            
                        } else {
                            contador2 = mesaLibre(eleccion, mesas);
                            if (contador2 > 0) {
                                System.out.printf("Tendran que compartir mesa . Por favor, siéntese en la mesa número %d.",contador2);
                            } else {
                                System.out.println("Lo siento, en estos momentos no queda sitio.");
                            }
                        }
    
    
                    break;
    
                    case 2:
                        contador1 = mesaVacia( mesas);

                        if (contador1 > 0) {
                            System.out.printf("Por favor, siéntese en la mesa número %d.",contador1);
                            
                        } else {
                            contador2 = mesaLibre(eleccion, mesas);
                            if (contador2 > 0) {
                                System.out.printf("Tendran que compartir mesa . Por favor, siéntese en la mesa número %d.",contador2);
                            } else {
                                System.out.println("Lo siento, en estos momentos no queda sitio.");
                            }
                        }
    
                    break;
    
                    case 3:
                        
                        contador1 = mesaVacia(mesas);

                        if (contador1 > 0) {
                            System.out.printf("Por favor, siéntese en la mesa número %d.",contador1);
                            
                        } else {
                            contador2 = mesaLibre(eleccion, mesas);
                            if (contador2 > 0) {
                                System.out.printf("Tendran que compartir mesa . Por favor, siéntese en la mesa número %d.",contador2);
                            } else {
                                System.out.println("Lo siento, en estos momentos no queda sitio.");
                            }
                        }
    
                    break;
    
                    case 4:
                        
                        contador1 = mesaVacia(mesas);

                        if (contador1 > 0) {
                            System.out.printf("Por favor, siéntese en la mesa número %d.",contador1);
                            
                        } else {
                            System.out.println("Lo siento, en estos momentos no queda sitio.");
                        }
    
                    break;
                
                    default:
                        break;
                }
            } while (fin != 0);
            
        


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * 
     * @param mesas
     */
    public static void mostrarMesas(int mesas[]) {

        
        escribirLineas();

        System.out.printf("|  Mesa nº  |");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("     %d     |",i);
        };
        System.out.println("");

        
        escribirLineas();
        
        System.out.printf("| Ocupación |");
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("     %d     |",mesas[i]);
        };
        System.out.println("");

        escribirLineas();

    }

    public static void escribirLineas() {

        for (int i = 0; i < 10; i++) {
            System.out.printf("--------------");
        };
        System.out.println("");


    }

    /**
     * 
     * @param eleccion
     * @param mesas
     * @return
     */
    public static int mesaVacia(int[] mesas) {

        int numero = 0;
        int contador = 0;
        int fin = 0;

        for (int i = 0; (i <= MAXIMO_MESAS - 1) && (fin == 0); i++) {
            
            if (mesas[i] == 0) {
                fin = 1;
                numero = contador;
            }

            contador++;

        }

        return numero;

    }

    public static int mesaLibre(int eleccion, int[] mesas) {
        
        int numero = 0;
        int contador = 0;
        int fin = 0;

        for (int i = 0; (i < MAXIMO_MESAS - 1) && (fin == 0); i++) {
            
            for (int j = ASIENTOS - eleccion; j > 0; j--) {
                if (mesas[i] == j) {
                    numero = contador;
                    fin = 1;
                }
            }

            contador ++;

        }

        return numero;

    }
}
