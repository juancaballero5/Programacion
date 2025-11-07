public class EJ20 {
    public static void main(String[] args) {
        int minutos;
        int hora;
        int tiempoTotal;
        int tiempoActual;
        int diaSemana = 0;
        String dia;  

        System.out.print("Introduzca un día de la semana (de Lunes a Viernes): ");
        dia = System.console().readLine().toLowerCase() ;

        System.out.println("A continuación introduzca la hora (hora y minutos)");
        System.out.print("Hora :");
        hora = Integer.parseInt(System.console().readLine());
        System.out.print("Minutos :");
        minutos = Integer.parseInt(System.console().readLine());

        switch (dia) {
            case "lunes":
                diaSemana = 0;
                break;
            case "martes":
                diaSemana = 1;
                break;
            case "miercoles":
                diaSemana = 2;
                break;
            case "jueves":
                diaSemana = 3;
                break;
            case "viernes":
                diaSemana = 4;
                break;
        
            default:
                System.out.println("El día introducido no es correcto. ");
                break;
        }

        //Calculamos y mostramos el resultado
        tiempoTotal = (4 * 24 * 60) + (15 * 60) + (hora * 60) + minutos;
        tiempoActual = (diaSemana * 24 * 60) + (15 * 60) + (hora * 60) + minutos;

        System.out.printf("Faltan %d minutos para llegar al fin de semana. \n",tiempoTotal - tiempoActual);
    }
}
