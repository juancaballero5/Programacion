package Ejercicios.ArraysBidimensionales;

public class EJ24 {
    
    public static void main(String[] args) {
        
        int posicion;
        int fila = 0; 
        int columna = 0;
        int [][] tabla = {{8, -12, 33} , {14, 1, -24} , {100, 51, 69}};

        System.out.println("El Array tiene 3 filas y 3 columnas.");
        System.out.print("Introduzca la psición del elemento que quiere mostrar (1-9):");
        posicion = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < posicion; i++) {

            columna ++;

            if(columna > 3) {
                columna = 0;
                fila++;
            }

        }

        System.out.printf("El elemento que se encuentra en la posición %d es %d\n", posicion,tabla[fila][columna]);
        
    }
}
