package Ejercicios;

import java.util.Scanner;

public class EjemploArrayBidimensional {
    
    public static void main(String[] args) {
        
        int fila;
        int columna;
        int eleccion;
        int [][] tabla = {{8 ,-12, 33}, {14, 1, 24}, {100, 51, 69} };

        Scanner esc = new Scanner(System.in);

        System.out.println("¿Cual elemento de fila y columna quiere ver?");
        System.out.print("Fila:");
        fila = esc.nextInt();

        System.out.print("Columna");
        columna = esc.nextInt();

        System.out.printf("%d",tabla[fila][columna]);


        System.out.print("¿Que elemento quiere ver?:");
        eleccion = esc.nextInt();

        switch (eleccion) {
            case 1:
                
            break;
        
            case 2:
                
            break;
        
            case 3:
                
            break;
        
            case 4:
                
            break;
        
            case 5:
                
            break;
        
            case 6:
                
            break;
        
            case 7:
                
            break;
        
            case 8:
                
            break;
        
            case 9:
                
            break;
        
            default:
                break;
        }

    }
}
