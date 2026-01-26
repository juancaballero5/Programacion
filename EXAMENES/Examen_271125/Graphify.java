import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ESCRIBE TU NOMBRE AQUÍ
 */

class Graphify {

    // Definición de constante LIMPIAR PANTALLA
    public static final String CLEAR = "\033[H\033[2J";

    // Definición de constantes de COLOR
    public static final String RESET = "\033[0m"; 
    public static final String RED_BACKGROUND    = "\033[41m";
    public static final String GREEN_BACKGROUND  = "\033[42m";
    public static final String BLUE_BACKGROUND   = "\033[44m";
    public static final String PURPLE_BACKGROUND = "\033[45m";

    // Definición de constantes de SÍMBOLOS COLOR
    public static final String HORIZONTAL       = "\u2550";     // ═
    public static final String VERTICAL         = "\u2551";     // ║

    public static final String ESQUINA_SUP_IZQ  = "\u2554";     // ╔
    public static final String ESQUINA_SUP_DER  = "\u2557";     // ╗
    public static final String ESQUINA_INF_IZQ  = "\u255A";     // ╚
    public static final String ESQUINA_INF_DER  = "\u255D";     // ╝

    public static final String CRUCE_IZQ        = "\u2560";     // ╠
    public static final String CRUCE_DER        = "\u2563";     // ╣
    public static final String CRUCE_SUP        = "\u2566";     // ╦
    public static final String CRUCE_CEN        = "\u256C";     // ╬
    public static final String CRUCE_INF        = "\u2569";     // ╩

    /**
     * GRAPHIFY: algoritmo principal
     * @param args
     */
    public static void main(String[] args) {

        long numA;
        long numB;
        long min;
        long max;
        long numero;
        long invertido;
        long longitud;
        long digMayor;

        char color;


        Scanner escaner = new Scanner(System.in);

        System.out.print(CLEAR) ;   // limpiamos la pantalla
        System.out.println("GRAPHIFY");
        System.out.println("====================");

        try {

            //Se preguntan los rangos
            System.out.print("Introduzca el valor mínimo del rango: ");
            numA = escaner.nextLong();

            min = numA;

            System.out.print("Introduce el valor máximo del rango: ");
            numB = escaner.nextLong();

            max = numB;

            //Invertimos los valores si el minimo es mayor que el maximo
            if (min>max) {
                max=numA;
                min=numB;
            }

            //Mensaje si es introducido un valor erroneo
            if ((max<min) || (numA < 0) || (numB < 0)) {
                System.out.println("ERROR: los valores deben ser mayores o iguales a cero.");
                System.out.println(RESET);
            }

            //Se pregunta el color
            System.out.print("Dibujo la grafica en blanco y negro o en color (B|C): ");
            color = escaner.next().toLowerCase().charAt(0);

            //Se divide los colores
            if (color != 'c') {

                //hacemos las acciones de generarNumeroAleatorio, invertirNumero,longitudNumero y digitoMayor
                numero = generarNumeroAleatorio(min, max);

                invertido = invertirNumero(numero);
                
                longitud = longitudNumero(invertido);

                digMayor = digitoMayor(numero);

            
                    
                    for (int col = 1;col < digMayor + 1;col++) {
                        
                        int digito = (int) (invertido % 10) ;
                        invertido /= 10;

                        for (int j = 0; j < digMayor +1 ;j++) {
                            System.out.print(" --- ");
                        }
                        
                        System.out.println(" ");
                       
                        int asterisco = 0;
                            
                        for (int celda = 0; celda < longitud +1 ; celda++) {
                            int h = 0;
                            if ((celda == 0) && (h == 0 )) {
                                System.out.printf("| %d |",digito);
                                h++;
                            } else if (asterisco < digito ) {
                                System.out.print("| * |");
                                asterisco++;
                            } else {
                                System.out.print("|   |");
                            } 

                        }
                        

                        System.out.println(" ");

                    }

                    for (int j = 0; j < digMayor +1 ;j++) {
                        System.out.print(" --- ");
                    }
                }
            

            

        } catch (InputMismatchException e) {
            System.out.println("**Error Se debe introducir un valor de tipo numérico largo");
        } catch (Exception e ) {
            System.out.println("**Error Algo ha salido mal");
        } finally {
            escaner.close();
        }
    }

    /**
     * 
     * @param min
     * @param max
     * @return 
     */
    public static long generarNumeroAleatorio (long min , long max) {

        long random = (long) ((Math.random() * (max - min + 1)) + min);

        return random;
    }

    /**
     * 
     * @param numero
     * @return
     */
    public static long invertirNumero (long numero) {

        long girado = 0;

        while (numero > 0) {
            girado = (girado*10) + numero%10;
            numero/=10;
        }

        return girado;
    }

    /**
     * 
     * @param numero
     * @return
     */
    public static int longitudNumero (long numero) {

        int longitud ;

        longitud = String.valueOf(numero).length();

        return longitud;
    }

    /**
     * 
     * @param numero
     * @return
     */
    public static int digitoMayor (long numero) {

        int mayor = 0;
        int digito = 0;
        long invertido = 0;

        while (numero > 0) {
            invertido = (invertido*10) + numero%10;
            digito = (int) numero%10;
            numero/=10;


            if (digito > mayor) {
                mayor = digito;
            }
        }

        return mayor;
    }
    
    /*public static int obtenerColor (long numero) {
  
    }

    public static int digitoMayor (long numero) {

    }*/

    

    
}
