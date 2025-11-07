public class EJ10 {
    public static void main(String[] args) {

        int hora;
        int minuto;


        System.out.print("Introduce la hora : ");
        hora = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce los minutos : ");
        minuto = Integer.parseInt(System.console().readLine());

        if ((hora < 0) && (hora > 24)) {
            System.out.printf("Desde las %d:%d",hora,minuto);
        }
    }
}
