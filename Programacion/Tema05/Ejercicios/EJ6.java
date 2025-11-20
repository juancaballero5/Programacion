package Ejercicios;

public class EJ6 {
    public static void main(String[] args) {
        
        int digitos = 1;
        int numero ;
        int temporal ;
     
        System.out.println("\033[1mNÚMERO DE DIGITOS DE UN NÚMERO\033[0m");
        System.out.print("Introduce un numero entero: ");
        numero = Integer.parseInt(System.console().readLine());

        temporal = Math.abs(numero);  //Le da la vuelta si nos dan un numero negativo

        while (temporal >= 10) {
            temporal /= 10;
            digitos ++;
        }


        System.out.printf("%d tiene %d digitos\n",numero,digitos);
    }
}
