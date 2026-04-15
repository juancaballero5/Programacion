package Ejercicios.EJ15;

public class Acronimo {
    
    public static void main(String[] args) {
        
        String argumento;
        String acronimo = "";

        if (args.length > 0) {
            
            for (int i = 0; i < args.length; i++) {
                
                argumento = args[i];
        
                if ( argumento.length() > 3) {
                    
                    acronimo += argumento.toUpperCase().charAt(0);
    
                } 
            }
    
            System.out.println("Acrónimo: " + acronimo);
        
        } else {
            System.out.println("ERROR: debes introducir al menos una palabra.");
        }

    }
}
