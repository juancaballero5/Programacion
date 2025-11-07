

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        int horas;
        int sueldo;
        int resto;
        Scanner escaner = new Scanner(System.in);

        System.out.print("Introduce las horas trabajadas esta semana :");
        horas = escaner.nextInt();

        
        if (horas <= 40) {
            sueldo = horas * 12;

            System.out.printf("El sueldo de esta semana es de %d euros",sueldo);
        }else if (horas>40) {
            resto = 40 * 12;
            sueldo =  resto + ((horas - 40) * 16);

            System.out.printf("El sueldo de esta semana es de %d euros",sueldo);
        }else{
            System.out.println("**Error No puede ser negativo las horas trabajadas");
        }
        escaner.close();
    }
}
