package Ejercicios;
public class EJ2 {
    public static void main(String[] args) {
        int carta = (int) (Math.random() * (13 - 1 + 1));
        int nombreCarta = (int) (Math.random() * (4 - 1 + 1)) + 1;
        String nombre = null;

        switch (carta) {
            case 1:
                carta = 'A';
                break;
            case 2 - 10:

                break;
            case 11:
                carta = 'J';
                break;
            case 12:
                carta = 'Q';
                break;
            case 13:
                carta = 'K';
                break;
            default:
                System.out.print(" ");
                break;
        }
        switch (nombreCarta) {
            case 1:
                nombre = " de corazones";
                break;
            case 2:
                nombre = " de diamantes";
                break;
            case 3:
                nombre = " de treboles";
                break;
            case 4:
                nombre = " de picas";
                break;
        }

        System.out.println(carta + nombre);
        ;

    }
}
