import java.util.Scanner;

public class JuegoMazmorra {
    
    public static void main(String[] args) {
        
        final String BORRAR = "\u001b[2J\u001b[H";
        
        //Inicializamos las variables

        int vidaJugador = 40;
        int vidaEnemigo = 40;
        int vidaJefe = 120;
        int AtaqueJugador = 15;
        int defensa = 5;
        int oro = 20;
        int pociones = 1;
        int opcion = 0;
        int mazmorra;

        String enter;

        Scanner escaner = new Scanner(System.in);

        try {
            
            //Mostramos la introducción del juego

            mostrarIntroduccion();

            
            //Hacemos el bucle para los turnos
            
            for (int turno = 0; (turno < 10) || (vidaJugador != 0) || (opcion == 5) ; turno++) {
                
                System.out.println(BORRAR);
                
                //Mostramos menu principal
                mostrarMenu();
                System.out.print("Introducza su opción (1-5): ");
                opcion = escaner.nextInt();

                System.out.println(BORRAR);

                switch (opcion) {
                    case 1:

                    if (turno == 3 || turno == 5) {

                        mazmorra = 1;

                    } else {

                        mazmorra = (int) Math.random() * 4 ;

                    }


                    switch (mazmorra) {
                        // Caso de combate
                        case 0:
                            
                            break;
                        // Caso de encontrar oro
                        case 1:
                            
                            break;
                        // Caso de encontrar una poción
                        case 2:
                            
                            break;
                        // Caso de que no pase nada
                        case 3:
                            
                            break;
                    }
                        break;
                
                    case 2:
                        
                        break;
                
                    case 3:
                        escaner.nextLine();
                        //Mostramos interfaz de Poción
                        if (pociones > 0) {
                            
                            System.out.println("*******************************");
                            System.out.println("*                             *");  
                            System.out.println("*        TE HAS CURADO        *");
                            System.out.println("*                             *");
                            System.out.println("*******************************");
                            
                            vidaJugador += 30;

                            if (vidaJugador > 100) {
                                vidaJugador = 100;
                            }

                            pociones--;
                        } else {
                            
                            System.out.println("*******************************");
                            System.out.println("*                             *");  
                            System.out.println("*      NO TIENES POCIONES     *");
                            System.out.println("*                             *");
                            System.out.println("*******************************");

                        }

                        System.out.println("Presione ENTER para pasar a lo siguiente:");
                        enter = escaner.nextLine();
                        
                        // Restamos para que no cuente turno
                        turno--; 

                        break;
                
                    case 4:

                        // Mostramos el menu de la tienda
                        mostrarTienda();
                        System.out.println("Seleccione la opción que quiera (1-3):");
                        opcion = escaner.nextInt();

                        switch (opcion) {
                            case 1:
                                if (oro>=10) {

                                    System.out.println("HAS OBTENIDO UNA POCIÓN");

                                    pociones++;
                                } else {
                                    System.out.println("No tiene oro suficiente");
                                }
                                break;
                        
                            case 2:
                                if (oro>=20) {
                                    AtaqueJugador+=5;
                                } else {
                                    System.out.println("No tiene suficiente oro");
                                }
                                break;
                        
                            case 3:
                                
                                break;
                        
                            default:
                                System.out.println("Introduzca un valor del 1 al 3");
                                break;
                        }

                        turno--;
                        break;
                
                    case 5:
                        
                        break;
                
                    default:
                        System.out.println("Debe de introducir un valor del 1 a 5 ");

                        turno--;
                        break;
                }

            }

        } catch (Exception e) {
            System.out.println("**ERROR: LA MAZMORRA DEL DESTINO ha fallado");
        }

    }

    
    public static void mostrarIntroduccion() {

        System.out.println("*******************************");
        System.out.println("*                             *");  
        System.out.println("*   LA MAZMORRA DEL DESTINO   *");
        System.out.println("*                             *");
        System.out.println("*******************************");

    }

    public static void mostrarMenu() {

        System.out.println("          MENÚ PRINCIPAL        ");
        System.out.println("================================");
        System.out.println("1. Explorar Mazmorra            ");
        System.out.println("2. Ver estado del jugador       ");
        System.out.println("3. Usar Poción                  ");
        System.out.println("4. Tienda                       ");
        System.out.println("5. Salir del Juego (huye)       ");
        
    }
    
    public static void mostrarTienda() {
        
        System.out.println("                 TIENDA               ");
        System.out.println("======================================");
        System.out.println("1. Comprar poción 10 \u1FA99                 ");
        System.out.println("2. Mejorar ataque (+5) por 20 de oro. ");
        System.out.println("3. Salir                              ");

    }
}
