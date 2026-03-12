package Ejercicios.Ejercicio6;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        final int INTENTOS = 3;
        
        HashMap<Integer,String> usuarios = new HashMap<Integer,String>();

        String nombre;
        int contraseña;
        int contador = INTENTOS;
        boolean fin = false;

        usuarios.put(8457, "Ha accedido al area restringida");

        System.out.print("Introduzca nombre de usuario:");

        System.out.print("Introduzca la contraseña:");
        contraseña = Integer.parseInt(System.console().readLine());

        if (usuarios.containsKey(contraseña)) {
            System.out.println(usuarios.get(contraseña));
        } else {
            
                    do {
                        
                        System.out.printf("Incorrecto, le quedan %d intentos", contador);
                        System.out.print("Introduzca la contraseña:");
                        contraseña = Integer.parseInt(System.console().readLine());

                        if (usuarios.containsKey(contraseña)) {
                            System.out.println(usuarios.get(contraseña));
                            fin = true;
                        } else {
                            contador++;
                        }
                        
                    } while ((contador > 0) && (fin == false));

        }

    }

}
