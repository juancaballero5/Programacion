package Tema04;

public class Ejercicioedad{

    public static void main(String[] args) {
        
    
    int edad;

    System.out.print("Introduzca su edad :");
    edad = Integer.parseInt(System.console().readLine());

    if (edad>=18) {
        if (edad>=65) {
            System.out.println("Usted esta jubilado");
        }else{
            System.out.println("Usted esta en activo");
        }
    }else{
        System.out.println("Usted es menor de edad");
    }

    }
}