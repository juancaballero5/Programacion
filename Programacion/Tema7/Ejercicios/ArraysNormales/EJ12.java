package Ejercicios.ArraysNormales;

public class EJ12 {
    
    final static int MAXIMO = 10;

    public static void main(String[] args) {
        
        int []valores = new int[MAXIMO];

        for (int i = 0; i < MAXIMO ; i++) {

            valores[i] = (int) (Math.random() * 100 );

        }

        mostrarOriginal(valores);

        // PRIMOS

        primos(valores);

    }

    /**
     * Mostramos la tabla original
     */
    public static void mostrarOriginal(int []valores) {

        mostrarIndice();
        mostrarLinea();
        mostrarValores(valores);
    }

    /**
     * Mostramos el Indice de la tabla
     */
    public static void mostrarIndice() {
        
        System.out.printf("| Índice  |");

        for (int i = 0; i < MAXIMO; i++) {
            
            System.out.printf("  %3d |",i);

        }
    }

    /**
     * Mostramos la linea de separacion entre el Indice y los valores
     */
    public static void mostrarLinea() {

        System.out.println("");

        System.out.println("---------------------------------------------------------------------------------");

    }

    /**
     * Mostramos los valores dentro del Array
     * 
     * @param valores
     */
    public static void mostrarValores(int []valores) {

        System.out.printf("| Valores |");

        for (int i = 0; i < MAXIMO; i++) {
            
            System.out.printf("  %3d |",valores[i]);

        }

    }

    public static void primos(int []valores) {

        int contenedor;

        int contador = 0;
        int fin = 0;

        for (int i = 0; i < valores.length; i++) {
            
            if ((valores[i]%1 == 0) && (valores[i]%valores[i] == 0)) {
                
                for (int j = 0; j < Math.sqrt(valores[i]); j++) {
                    if (valores[i]%j == 0) {
                        fin = 1;
                    }
                }

                if (fin == 0) {

                    contenedor = valores[i];

                    for(int cambio = 0;cambio<= contador ;cambio++) {
                        valores[contador-1] = valores[contador];
                    }
                    
                    valores[1] = contenedor;
                }
            }

            contador++;

        }


        

        

    }

}
