package Ejercicios.ArraysNormales;

public class EJ4 {
    
    public static void main(String[] args) {
        


        final int MAXIMO = 20;

        int []numero = new int[MAXIMO];
        int []cuadrado = new int[MAXIMO];
        int []cubo = new int[MAXIMO];

        try {
            
            for (int i = 0; i < MAXIMO; i++) {
                
                // Generamos los numeros y los almacenamos
                numero[i] = (int) (Math.random() * 100 + 1);
                
                // Generamos los cuadrados y los almacenamos

                cuadrado[i] = (int) Math.pow(numero[i], 2);

                // Generamos los cubos y los almacenamos

                cubo[i] = (int) Math.pow(numero[i], 3);

            }
            
            System.out.println("     n1    |      n2     |    n3   ");
            System.out.println("--------------------------------------");

            for (int i = 0; i <= MAXIMO; i++) {
                System.out.printf("    %5d  |    %5d    |    %5d   \n",numero[i],cuadrado[i],cubo[i]);
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

}
