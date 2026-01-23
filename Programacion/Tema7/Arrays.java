import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        
        float dia1;         //Guarda un valor único de de tipo float
        float dia2;
        float dia3;

        int numero;

        Scanner escaner = new Scanner(System.in);

        float []temperatura ; // Definir una coleccion de valores de tipo float (array de cadenas )
        temperatura = new float[7]; // Inicializando la colección con un tamaño de 31 elementos de tipo float

        temperatura[0] = 3.0f; 
        temperatura[1] = 10.5f;
        temperatura[2] = 12.7f;
        temperatura[3] = 5f;
        temperatura[4] = 8f;
        temperatura[5] = 6f;
        temperatura[6] = 11.0f;

        // Es otra manera de guardar los valores
        // float[] temperaturas = {3f ,2f ,16f ,13f ,17f ,9f, 11f};

        // temperatura[7] = 7f; Esto lanzaria una excepción por estar fuera de los limites
        

        for (int i = 0; i < 7; i++) {
            System.out.println(temperatura[i]);
        }

        // ARRAYS ES UNA COLECCIÓN DEL MISMO TIPO


        System.out.print("Introduce un valor del 1 al 5: ");
        numero = escaner.nextInt();

        switch (numero) {
            case 1:
                System.out.println(temperatura[0]);
            break;
        
            case 2:
                System.out.println(temperatura[1]);
            break;
        
            case 3:
                System.out.println(temperatura[2]);
                break;
        
            case 4:
                System.out.println(temperatura[3]);
            break;
        
            case 5:
                System.out.println(temperatura[4]);
            break;
        
            default:
                break;
        }



        // Parte de que el usuario introduzca los valores

        int[] respuesta ;

        respuesta = new int[5];

        for(int i = 0; i < 5;i++) {
            System.out.print("Introduce un valor: ");
            numero = escaner.nextInt();

            respuesta[i] = numero;
        } 

        for (int i = 0; i < 5; i++) {
            System.out.println(respuesta[i]);
        }

    }
}
