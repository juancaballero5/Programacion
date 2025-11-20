package Ejercicios;

public class EJ17 {
    public static void main(String[] args) {
        
        
        //final char CARACTER_DEFECTO = '*' ;

        char caracter = 0;

        int altura;
        //int totalEspacios;
        //int totalCaracteres = 1;

        System.out.print("Introduzca la altura de la piramide: ");
        altura = Integer.parseInt(System.console().readLine());
        
        //totalEspacios = altura - 1;
        
        System.out.print("Introduzca el caracter de relleno: ");
        caracter = System.console().readLine().charAt(0);

        for (int fil = 1; fil <= altura; fil++ ) {
            //dibujamos espacios

            for(int espacios = 1 ; espacios <= (altura - fil); espacios++) {
                System.out.print(" ");
            }

            //dibujamos caracteres

            for(int col = 1 ; col <= (2 * fil - 1 ); col++){
                if ((fil == 1) || (fil == altura) || (col == 1) || (col == 2* fil-1)) {
                    System.out.print(caracter);
                }else {
                    System.out.print(" ");
                }
            }

            //hacemos salto de linea
            System.out.println("");

            //totalEspacios--;
            //totalCaracteres+=2;
        }
    }
}
