package Tema04;

public class Ejercicio2EjemploTernario {
    public static void main(String[] args) {

        int nota;
        String mensaje;

        System.out.print("Introduzca la nota del examen :");

        nota = Integer.parseInt(System.console().readLine());

      mensaje  = (nota >= 5) ? "Has aprobado, ¡Que crack!" : "Has suspendido, estudia más"; 

      System.out.println(mensaje);

          
        
    }
}
