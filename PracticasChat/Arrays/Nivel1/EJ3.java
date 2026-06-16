package Nivel1;

public class EJ3 {
    public static void main(String[] args) {
        
        int[] numero = {1,2,3,4,5,6};
        
        System.out.println("ORDEN NORMAL:");
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }

        System.out.println("ORDEN DEL REVES:");
        for (int i = numero.length - 1; i >= 0; i--) {
            System.out.println(numero[i]);
        }

    }
}
