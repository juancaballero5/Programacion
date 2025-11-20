package Ejercicios;

public class EJ21 {
    public static void main(String[] args) {

        int altura;
        
        System.out.println("\033[1mPIRÁMIDE NÚMERICA\033[0m");
        
        System.out.print("Introduce la altura de la pirámide: ");
        altura = Integer.parseInt(System.console().readLine());
        
        for(int fila = 1 ; fila <= altura ; fila++) {
            
            

            for(int espacios = 1 ; espacios <= (altura - fila); espacios++) {
                System.out.print(" ");
            }

            //dibujamos secuencia numerica de la izquierda
            for(int col = 1 ; col <= fila ; col++){
                System.out.print(col);
            }

            // dibujamos la secuencia numerica de la derecha
            for(int col =fila - 1 ; col > 0 ;col-- ) {
                System.out.print(col);
            }

            System.out.println("");

        }
        
    }
}
