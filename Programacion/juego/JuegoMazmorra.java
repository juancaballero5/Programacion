import java.util.Scanner;

public class JuegoMazmorra {
    
    public static void main(String[] args) {
        
        final String BORRAR = "\u001b[2J\u001b[H";
        
        //Inicializamos las variables

        int vidaJugador = 50;
        int vidaEnemigo = 40;
        int vidaJefe = 110;
        int ataqueJugador = 15;
        int defensa = 5;
        int oro = 20;
        int pociones = 1;
        int opcion = 0;
        int eleccion = 0;
        int mazmorra;
        int oroEncontrado;

        String enter;

        Scanner escaner = new Scanner(System.in);

        try {
            
            //Mostramos la introducción del juego
            mostrarIntroduccion();

            Thread.sleep(2000);

            System.out.println(BORRAR);

            //Hacemos el bucle para los turnos
            
            for (int turno = 0; (turno < 10) || (vidaJugador != 0) || (opcion == 5) ; turno++) {
                
                System.out.println(BORRAR);
                
                    //Mostramos menu principal
                    mostrarMenu();
                    System.out.print("Introducza su opción (1-5): ");
                    opcion = escaner.nextInt();

                    System.out.println(BORRAR);

                    switch (opcion) {
                        // Caso de explorar la mazmorra
                        case 1:

                            if (turno == 3 || turno == 5) {

                                mazmorra = 0;

                            } else if (turno == 10) {

                                mazmorra = 4;

                            } else {

                            mazmorra = (int) Math.random() * 4 ;

                            }


                            switch (mazmorra) {
                                // Caso de combate
                                case 0:
                                    System.out.println("¡HAS ENTRADO EN COMBATE!");

                                    while ((vidaJugador != 0) || (vidaEnemigo != 0) ) {
                                    
                                        mostrarCombate();
                                        System.out.println("Seleccione la opción que quiera (1-2):");
                                        eleccion = escaner.nextInt();
                                    
                                        int ataqueEnemigo = (int) (Math.random() * (15 - 5 + 1)) + 5;
                                    
                                        switch (eleccion) {
                                            case 1:
                                            
                                                int critico = (int) (Math.random() * 5);
                                            
                                                // Probabilidad de hacer un ataque critico
                                                if (critico == 1) {
                                                    ataqueJugador = 30;
                                                } else {
                                                    ataqueJugador = 15;
                                                }
                                                    
                                                vidaEnemigo = vidaEnemigo - ataqueJugador;

                                                if (vidaEnemigo < 0) {
                                                    
                                                    vidaEnemigo = 0;

                                                    System.out.println("¡HAS DERROTADO AL ENEMIGO, ENHOARABUENA!");

                                                } else {

                                                    
                                                    System.out.printf("Has infligido %d de daño, el enemigo tiene %d \n",ataqueJugador,vidaEnemigo);
                                                    
                                                    vidaJugador = vidaJugador - ataqueEnemigo;
                                                    
                                                    System.out.printf("Has recibido %d de daño , te queda %d de vida \n",ataqueEnemigo, vidaJugador);
                                                    
                                                }

                                                System.out.println(BORRAR);

                                            break;
                                        
                                            // Caso de defender el ataque
                                            case 2:
                                                int dañoDefendido = (int) (Math.random() * (10 - 2 + 1) + 2 );
                                                    
                                                ataqueEnemigo = ataqueEnemigo - dañoDefendido;
                                                    
                                                vidaJugador = vidaJugador - ataqueEnemigo;

                                                System.out.printf("Has recibido %d de daño , te queda %d de vida \n",ataqueEnemigo, vidaJugador);

                                                System.out.println(BORRAR);
                                            break;
                                                
                                            default:
                                                System.out.println("Debe de introducir un valor del 1 a 5 ");
                                                System.out.println(BORRAR);
                                            break;

                                        }
                                    }
                                break;

                                // Caso de encontrar oro
                                case 1:

                                    oroEncontrado = (int) ((Math.random() * (15 - 5 + 1 )) + 5); 

                                    System.out.printf("Has encontrado %d de oro \n",oroEncontrado);

                                    oro += oroEncontrado;
                                break;

                                // Caso de encontrar una poción
                                case 2:
                                    
                                    System.out.println("Has encontrado una poción");
                                    pociones++;

                                break;

                                // Caso de que no pase nada
                                case 3:
                                    
                                    System.out.println("No ha pasado nada");

                                break;

                                //Batalla contra el jefe final
                                case 4:

                                    System.out.println("¡Estas frente a la puerta de salida , pero a aparecido el JEFE DE LA MAZMORRA, DERROTALO!!");

                                    while ((vidaJugador != 0) || (vidaJefe != 0) ) {
                                    
                                        mostrarCombate();
                                        System.out.println("Seleccione la opción que quiera (1-2):");
                                        eleccion = escaner.nextInt();
                                    
                                        int ataqueEnemigo = (int) (Math.random() * (15 - 5 + 1)) + 5;
                                    
                                        switch (eleccion) {
                                            case 1:
                                            
                                                int critico = (int) (Math.random() * 5);
                                            
                                                // Probabilidad de hacer un ataque critico
                                                if (critico == 1) {
                                                    ataqueJugador = 30;
                                                } else {
                                                    ataqueJugador = 15;
                                                }
                                                    
                                                vidaEnemigo = vidaJefe - ataqueJugador;

                                                if (vidaJefe < 0) {
                                                    
                                                    vidaJefe = 0;

                                                    System.out.println("¡HAS DERROTADO AL JEFE FINAL, YA PUEDES ESCAPAR DE LA MAZMORRA!");

                                                } else {

                                                    
                                                    System.out.printf("Has infligido %d de daño, el enemigo tiene %d \n",ataqueJugador,vidaJefe);
                                                    
                                                    vidaJugador = vidaJugador - ataqueEnemigo;
                                                    
                                                    System.out.printf("Has recibido %d de daño , te queda %d de vida \n",ataqueEnemigo, vidaJugador);
                                                    
                                                }

                                                System.out.println(BORRAR);

                                            break;
                                        
                                            // Caso de defender el ataque
                                            case 2:
                                                int dañoDefendido = (int) (Math.random() * (10 - 2 + 1) + 2 );
                                                    
                                                ataqueEnemigo = ataqueEnemigo - dañoDefendido;
                                                    
                                                vidaJugador = vidaJugador - ataqueEnemigo;

                                                System.out.printf("Has recibido %d de daño , te queda %d de vida \n",ataqueEnemigo, vidaJugador);

                                                System.out.println(BORRAR);
                                            break;
                                                
                                            default:
                                                System.out.println("Debe de introducir un valor del 1 a 5 ");
                                                System.out.println(BORRAR);
                                            break;

                                        }
                                    
                                    }
                            }
                        break;

                        case 2:
                            mostrarEstado(vidaJugador,ataqueJugador,defensa,oro,pociones);
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

                                if (vidaJugador > 50) {
                                    vidaJugador = 50;
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
                                        ataqueJugador+=5;
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


    public static void mostrarCombate() {
        
        System.out.println("                 COMBATE               ");
        System.out.println("=======================================");
        System.out.println("1. Luchar                              ");
        System.out.println("2. Defenderte                          ");

    }


    public static void mostrarEstado(int vidaJugador, int ataqueJugador, int oro, int defensa, int pociones) {
        
        System.out.println("                 ESTADO               ");
        System.out.println("======================================");
        System.out.println(" VIDA:                             ");
        System.out.printf(" %d                             \n",vidaJugador);
        System.out.println(" ATAQUE:                           ");
        System.out.printf(" %d                             \n",ataqueJugador);
        System.out.println(" DEFENSA:                          ");
        System.out.printf(" %d                             \n",defensa);
        System.out.println(" ORO:                              ");
        System.out.printf(" %d                             \n",oro);
        System.out.println(" POCIONES:                         ");
        System.out.printf(" %d                             \n",pociones);
    }
}
