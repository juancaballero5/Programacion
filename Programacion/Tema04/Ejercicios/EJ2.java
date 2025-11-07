

public class EJ2 {
    public static void main(String[] args) {
        int hora;

        System.out.print("Introduce una hora del dia (0-23) :");
        hora = Integer.parseInt(System.console().readLine());

        switch (hora) {
            case 6,7,8,9,10,11,12:
                System.out.println("Buenos días.");
                break;
            case 13,14,15,16,17,18,19,20:
                System.out.println("Buenas tardes.");
                break;
            case 21,22,23,0,1,2,3,4,5:
                System.out.println("Buenas noches.");
                break;
            default:
                System.out.println("**Error La hora es incorrecta ");
                break;
        }
    }
}
