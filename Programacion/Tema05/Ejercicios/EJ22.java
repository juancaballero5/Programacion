package Ejercicios;

public class EJ22 {
    public static void main(String[] args) {
        
        int numero;
        int temporal;
        int resultado = 0;

        System.out.print("Introduzca un numero entero: ");
        numero = Integer.parseInt(System.console().readLine());

        temporal = numero;

        //giramos el numero

        while (temporal >= 0) {
            resultado = (resultado*10) + temporal%10 ;
            temporal /= 10 ;
        }

        System.out.printf("Si le damos ña vuelta al  %d tenemos el %d\n",numero,resultado);
    }
}
