package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ31 {
    public static void main(String[] args) {
    
        
        int digito;

        long temporal ;
        long numero1 = 0;
        long numero2 = 0;
        long numeroPares = 0;
        long numeroImpares = 0;

        Scanner escaner = new Scanner(System.in);

        try{

            System.out.print("Introduzca un numero: ");
            temporal = escaner.nextInt();

            //giramos el primer número
            numero1 = girarNumero(temporal);
            
            //pedimos el segundo numero
            System.out.print("Introduzca otro numero: ");
            numero2 = girarNumero(escaner.nextInt());

            //  construimos los números
            while ((numero1 > 0) && (numero2 > 0)) {
                digito = (int) (numero1%10);
                numero1 /= 10;
                numero2 /= 10;

                if (digito%2 == 0) {
                numeroPares = (numeroPares * 10) + digito;
                } else {
                    numeroImpares = (numeroImpares * 10) + digito;
                }

                digito = (int) (numero2%10);
                numero2 /= 10;

                if (digito%2 == 0) {
                numeroPares = (numeroPares * 10) + digito;
                } else {
                    numeroImpares = (numeroImpares * 10) + digito;
                }
            }
            while ((numero1 > 0) && (numero2 > 0)) {
                digito = (int) (numero1%10);
                numero1 /= 10;

                if (digito%2 == 0) {
                numeroPares = (numeroPares * 10) + digito;
                } else {
                    numeroImpares = (numeroImpares * 10) + digito;
                }

            }
            while ((numero1 > 0) && (numero2 > 0)) {
                numero2 /= 10;

                digito = (int) (numero2%10);
                numero2 /= 10;

                if (digito%2 == 0) {
                numeroPares = (numeroPares * 10) + digito;
                } else {
                    numeroImpares = (numeroImpares * 10) + digito;
                }
            }

            //Mostramos los números
            System.out.printf("El número formado por los dígitos pares es %d\n",numeroPares);
            System.out.printf("El número formado por los dígitos impares es %d\n",numeroImpares);


        } catch (InputMismatchException e) {
            System.out.println("**ERROR se pedia un valor de tipo númerico largo");
        }
        catch (Exception e) {
            System.out.println("**ERROR el programa ha fallado");
        } finally {
            //Cerramos escaner
            escaner.close();
        }

    }


    /**
     * Gira un valor numérico
     * @param numero
     * @return
     */
    public static long girarNumero(long numero) {

        long volteado = 0 ;

        while (numero > 0) {
            volteado = (volteado * 10) + (volteado%10);
            numero /= 10;
        }

        return volteado ;
    }




}

