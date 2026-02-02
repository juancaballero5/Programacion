package Ejercicios.ArraysBidimensionales;

public class EJ23 {
    
    public static void main(String[] args) {

        int fila; 
        int columna;
        int [][] tabla = {{8, -12, 33} , {14, 1, -24} , {100, 51, 69}};

        System.out.println("El Array tiene 3 filas y 3 columnas.");
        System.out.print("Introduzca la fila de 0 a 2:");
        fila = Integer.parseInt(System.console().readLine());

        System.out.println("Introduzca la columna de 0 a 2:");
        columna = Integer.parseInt(System.console().readLine());

        System.out.printf("El elemento que se encuentra en la posición [%d,%d] es %d\n", fila,columna,tabla[fila][columna]);

        

    }
}
