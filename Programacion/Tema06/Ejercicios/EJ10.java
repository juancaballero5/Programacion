package Ejercicios;

public class EJ10 {
    public static void main(String[] args) {
        int i;
        int suspenso = 0;
        int suficiente = 0;
        int bien = 0;
        int notable = 0;
        int sobresaliente = 0;

        for (i = 0; i <= 20;i++) {
            int nota = (int) (Math.random() * (10 - 0 + 1 ) + 0);
            switch (nota) {
                case 0:
                    suspenso++;
                    break;
                case 1-4:
                    suspenso++;
                    break;
                case 5:
                    suficiente++;
                    break;
                case 6:
                    bien++;
                    break;
                case 7,8:
                    notable++;
                    break;
                case 9,10:
                    sobresaliente++;
                    break;
            }

        }

        System.out.printf("Nº de suspensos : %d \n",suspenso);
        System.out.printf("Nº de suficientes : %d \n",suficiente);
        System.out.printf("Nº de bienes : %d \n",bien);
        System.out.printf("Nº de notables : %d \n",notable);
        System.out.printf("Nº de sobresalientes : %d \n ",sobresaliente);
    }
}
