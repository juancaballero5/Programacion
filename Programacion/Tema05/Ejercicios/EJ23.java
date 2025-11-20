package Ejercicios;

public class EJ23 {
    public static void main(String[] args) {
        
        int numero;
        int digito;
        
        int posicion = 0;
        int volteado = 0;
        int longitud = 0;

        try {
            System.out.print("Introduzca un numero entero: ");
            numero = Integer.parseInt(System.console().readLine());

            // Para pasar un número a cadena
            // String.valueOf(numero);
    
            System.out.print("Introduzca un digito: ");
            digito = Integer.parseInt(System.console().readLine());
    
            System.out.printf("Contando de izquierda a derecha, el %d aparece dentro de %d en las siguientes posiciones:");
    
            //giramos el numero
    
            while (numero > 0) {
                volteado = (volteado*10) + numero%10 ;
                numero /= 10 ;
                longitud++;
            }
    
            //calcular la longitud del número


            //calculamos posicion
            for ( ; longitud > 0; longitud--) {
                if (volteado%10 == digito) {
                    System.out.printf("%d ",posicion);
                }

                volteado/=10;
                posicion++;
            }
    
            System.out.printf("Contando de izquierda a derecha, el %d aparece dentro de %d en las siguientes posiciones: %d %d",digito,numero,posicion);

        } /*catch (Exception e) {
            *
            *System.out.println("**Se ha producido un error ");
        }*/ 
        
        catch (NumberFormatException exception) {
            System.out.println("**ERROR debe introducir un valor numérico");
        }
    }
}
