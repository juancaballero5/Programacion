package Tema8;


public class Matematicas {

    /**
     * 
     * @param numero
     * @return
     */
    public static boolean esCapicua (int numero) {
           
        int girado = 0;
        boolean resultado;
           
        while (numero > 0) {
           girado = (girado*10) + numero%10;
           numero/=10;
        }
        
        if (girado == numero) {
            resultado = true;
        } else {
            resultado = false;
        }
            
        return resultado;
    }

    /**
     * 
     * @param numero
     * @return
     */
    public static boolean esPrimo (int numero) {

        boolean resultado;

        if (numero%2 == 0) {
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;
    }

    /**
     * 
     * @param numero
     * @return
     */
    public static int siguientePrimo (int numero) {

        int siguiente = 0;

        while (siguiente%2 != 0) {
            siguiente = numero;

            siguiente++;
        }

        return siguiente;
    }

    /**
     * 
     * @param base
     * @param exponente
     * @return
     */
    public static int potencia (int base, int exponente) {
        int potencia;
        int resultado = 0;

        potencia = base;

        for (int i = 0; i == exponente; i++) {

            resultado = base * potencia;
        }

        return resultado;
    }

    /**
     * 
     * @param base
     * @param exponente
     * @return
     */
    public static int digitos (int numero) {

        int digitos = 0;
        int invertido = 0;

        while (numero > 0) {
            invertido = (invertido*10) + numero%10;
            numero/=10;
            digitos++;
        }
        
        return digitos;
    }

    
}

    