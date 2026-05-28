package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ {
    public static void main(String[] args) {
        
        String nombre;
        double peso;
        double altura;
        double IMC = 0;
        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.print("Introduzca su nombre:");
            nombre = sc.nextLine();
            
            System.out.print("Introduzca su peso:");
            peso = sc.nextDouble();
    
            System.out.print("Introduzca su altura:");
                altura = sc.nextDouble();
    
                IMC += peso / (altura * altura);
    
            if (IMC < 18.5) {
                System.out.printf("%s estas bajo de peso",nombre);
            } else if (IMC >= 18.5 && IMC < 24.9) {
                System.out.printf("%s estas normal de peso",nombre);
            } else if (IMC>= 25 && IMC< 29.9) {
                System.out.printf("%s estas con sobrepeso",nombre);
            } else {
                System.out.printf("%s estas obeso",nombre);
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Introduzca el peso o la altura con decimales (Ejemplo: 0,0)");
        } catch (Exception e) {
            System.out.println("Lo sentimos, el programa ha fallado");
        }

    }
}
