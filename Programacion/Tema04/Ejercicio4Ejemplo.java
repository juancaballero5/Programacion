public class Ejercicio4Ejemplo {
    public static void main(String[] args) {
        int dia;

        System.out.print("Introduce el día de la semana:");
        dia = Integer.parseInt(System.console().readLine());

        switch (dia) {
            case 1,2,3,4,5:
                System.out.println("Es un día entre semana");
                break;
            case 6,7:
                System.out.println("Es fin de semana");
                break;
            default:
                System.out.println("Error: No corresponde a ningun día de la semana");
                break;
        }

        if (dia >= 1 && dia <=5) {
            System.out.println("Es un día entre semana");
        }else if (dia == 6 || dia == 7) {
            System.out.println("Es fin de semana");
        }else {
            System.out.println("Error: No corresponde a ningun día de la semana");
        }
    }
}
