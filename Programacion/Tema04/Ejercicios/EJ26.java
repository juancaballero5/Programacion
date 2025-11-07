public class EJ26 {
    public static void main(String[] args) {
        
        String eleccion1;
        String eleccion2;

        System.out.print("Turno del jugardor 1 (introduzca piedra, papel o tijera): ");
        eleccion1 = System.console().readLine().toLowerCase();

        System.out.print("Turno del jugardor 2 (introduzca piedra, papel o tijera): ");
        eleccion2 = System.console().readLine().toLowerCase();

        if (eleccion1.equals("piedra")) {
            
            switch (eleccion2) {
                case "papel":
                    System.out.println("Gana el jugador 2");
                    break;
                case "tijera":
                    System.out.println("Gana el jugador 1");
                    break;
                default:
                    System.out.println("Empate");
                    break;
            }
        }else if (eleccion1.equals("papel")){
            
            switch (eleccion2) {
                case "piedra":
                    System.out.println("Gana el jugador 1");
                    break;
                case "tijera":
                    System.out.println("Gana el jugador 2");
                    break;
            
                default:
                System.out.println("Empate");
                    break;
            }
        }else{
            switch (eleccion2) {
                case "piedra":
                    System.out.println("Gana el jugador 2");
                    break;
                case "papel":
                    System.out.println("Gana el jugador 1");
                    break;
            
                default:
                System.out.println("Empate");
                    break;
            }
        }
    }
}
