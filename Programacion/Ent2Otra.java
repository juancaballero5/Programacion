    import java.util.Scanner;

public class Ent2Otra {
    public static void main(String[] args) {

        final String BORRAR = "\u001b[2J\u001b[H";
        final int MINIMO =2;
        int lado;
        int temporal;
        int color;

        Scanner entrada = new Scanner(System.in);

        try{
            System.out.print("Introduce la anchura maxima del rectangulo (como minimo 3): ");
            lado = entrada.nextInt();
            temporal = lado;

            System.out.println("Introduce un color(32-37)");
            color = entrada.nextInt();

            if (lado <= MINIMO) {
                System.out.println("Lo siento, los datos introducidos no son correct5ps, el valor minimo para la anchura y la altuara es de 2.");

            } else{

                while(true) {
                    do {
                        dibujarCuadrado(lado--, color);
                        Thread.sleep(100);
                        System.out.print(BORRAR);
                    } while(lado >=MINIMO);

                    do {
                        dibujarCuadrado(lado, color);
                        Thread.sleep(100);
                        System.out.print(BORRAR);
                        lado++;
                    } while(lado < temporal);
                }
            }

        

        } catch(Exception excepcion){
            System.out.println("Error: La aplicación ha fallado");
        }


    }

    public static void dibujarCuadrado(int lado, int color) {

        System.out.printf("\033[%dm", color);
        for(int j=0; j < lado; j++){

            for(int i=0; i < lado; i++){
                if ((j==0) || (j==lado-1) || (i==0) || (i==lado-1)) {
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }
}
