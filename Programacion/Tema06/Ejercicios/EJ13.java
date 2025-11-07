package Ejercicios;

public class EJ13 {
    public static void main(String[] args) {
        int i;
        String intro;
        int respuesta;
        int intento = (int) (Math.random() * (100 - 0 + 1 ) + 0);

        System.out.println("Piensa un número del 0 al 100. Intentaré adivinarlo en 5 intentos.");
        System.out.print("Pulsa la tecla INTRO cuando estés preparado.");
        intro = System.console().readLine();

        for (i = 0; i <= 5; i++){

            System.out.printf("¿Es el %d?",intento);

            System.out.print("El número que estás es 1) mayor 2) menor 3) el mismo : ");
            respuesta = Integer.parseInt(System.console().readLine());

            switch (respuesta) {
                case 1:
                    int intentoProximo1 = (int) (Math.random() * (100 - intento ) + intento);
                    intento = intentoProximo1;
                    break;
                case 2:
                    int intentoProximo2 = (int) (Math.random() * (intento - 0 ) + 0);
                    intento = intentoProximo2;
                    break;
                case 3:
                    i -= 5;
                    break;
            }
        }

        if (i > 0) {
            System.out.println("Vaya,no he conseguido adiviar tu número.");
        } else if (i <= 0) {
            System.out.println("¡Bien! ¡He acertado!");
        }
    }
}
