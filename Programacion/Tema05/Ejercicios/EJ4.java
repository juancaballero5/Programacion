package Ejercicios;

public class EJ4 {
    public static void main(String[] args) {
        
        int i = 0;
        int oportunidades = 4;
        int intento = 0;
        int contraseña = 2456;

        while ((intento != contraseña) || (i != oportunidades) ) {
            System.out.print("Introduce la clave de la caja fuerte:");
            intento = Integer.parseInt(System.console().readLine());
            
            if (intento != contraseña) {
                System.out.println("Lo siento, esa no es la combinación.");
            }
            
            i++;
        } 

        if (i >= oportunidades) {
            System.out.println("Lo siento, has agotado las 4 oportunidades.");
            System.out.println("Se ha emitido un aviso a la policía.");
        }else {
            System.out.println("\033[31m Se ha abierto la caja fuerte\033[0m");
        }
    }
}
