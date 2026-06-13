package TablasMultiplicar;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        try {

            for (int i = 0; i <= 10; i++) {
                
                System.out.printf("Tabla del %d\n",i);

                for (int j = 0; j <= 10; j++) {
                    
                    System.out.printf("%d x %d = %d\n",i,j,(i*j));
                }

            }
            
        } catch (Exception e) {
            System.out.println("**ERROR: El programa ha fallado.");
        }
    }
}
