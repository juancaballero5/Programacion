package Ejercicios;

public class NumerosDigitales {

    static boolean superior = true;            // Barra superior

    static boolean superiorDerecha = true;     // Barra superior derecha

    static boolean superiorIzquierda = true;   // Barra superior derecha

    static boolean central = true;             // Barra central

    static boolean inferiorIzquierda = true;   // Barra inferior izquierda

    static boolean inferiorDerecha = true;     // Barra inferior derecha

    static boolean inferior = true;            // Barra inferior


    public static void main(String[] args) {

        int numero = 0;

        try {

            //Nivel 1 

            System.out.println("Pintando el numero 5: ");

            numero = 5;

            dibujar(numero);

        } catch (Exception e) {
            System.out.println("**ERROR: El programa ha fallado.");
        }
    }

    public static void saberConvinación (int numero) {
        switch (numero) {
            case 0:
                superior = true;     

                superiorDerecha = true;  

                superiorIzquierda = true; 

                central = false;            

                inferiorIzquierda = true;  

                inferiorDerecha = true;  

                inferior = true;

                break;
            case 1:
                superior = false;     

                superiorDerecha = true;  

                superiorIzquierda = false; 

                central = false;            

                inferiorIzquierda = false;  

                inferiorDerecha = true;  

                inferior = false;

                break;
            case 2:
                superior = true;     

                superiorDerecha = true;  

                superiorIzquierda = false; 

                central = true; 

                inferiorIzquierda = true;  

                inferiorDerecha = false;  

                inferior = true;
                
                break;
            case 3:
                superior = true;     

                superiorDerecha = true;  

                superiorIzquierda = false; 

                central = true;            

                inferiorIzquierda = false;  

                inferiorDerecha = true;  

                inferior = true;
                
                break;
            case 4:
                superior = false;     

                superiorDerecha = true;  

                superiorIzquierda = true; 

                central = true;            

                inferiorIzquierda = false;  

                inferiorDerecha = true;  

                inferior = false;
                
                break;
            case 5:
                superior = true;     

                superiorDerecha = false;  

                superiorIzquierda = true; 

                central = true;            

                inferiorIzquierda = false;  

                inferiorDerecha = true;  

                inferior = true;
                
                break;
            case 6:
                superior = true;     

                superiorDerecha = false;  

                superiorIzquierda = true; 

                central = true;            

                inferiorIzquierda = true;  

                inferiorDerecha = true;  

                inferior = true;
                
                break;
            case 7:
                superior = true;     

                superiorDerecha = true;  

                superiorIzquierda = false; 

                central = false;            

                inferiorIzquierda = false;  

                inferiorDerecha = true;  

                inferior = false;
                
             break;
            case 8:
                superior = true;     

                superiorDerecha = true;  

                superiorIzquierda = true; 

                central = true;            

                inferiorIzquierda = true;  

                inferiorDerecha = true;  

                inferior = true;
                
                break;
            case 9:
                superior = true;     

                superiorDerecha = true;  

                superiorIzquierda = true; 

                central = true;            

                inferiorIzquierda = false;  

                inferiorDerecha = true;  
                
                inferior = true;
                
                break;
            default:
                System.out.println("Introduzca un numero valido (0-9)");
                break;
        }
    }

    public static void dibujar (int numero) {

        saberConvinación(numero);

        for(int i = 1; i < 7;i++) {

            for (int j = 1;j < 5;j++) {

                if ((superior = true) && (i == 1)) {
                    System.out.printf("%s",(j==1||j==5)?" ":"*");
                } else if (superior = false && i==1) {
                    System.out.print(" ");
                }

                if (superiorIzquierda = true && (i==2 ||i ==3)) {
                    System.out.printf("%s",(j==1)?"*":(superiorDerecha = false && j==5)?"":(j==5)?"":" ");
                }

                if (superiorDerecha = true && (i==2 || i==3)) {
                    if (superiorIzquierda= false) {
                        System.out.printf("%s",(j<5)?" ":"");
                    }
                    System.out.printf("%s",(j==5)?"*":"");
                }

                if ((central = true) && (i==4)) {
                    System.out.printf("%s",(j==1||j==5)?" ":"*");
                } else if (central = false && (i == 4)) {
                    System.out.print(" ");
                }

                if ((inferiorIzquierda = true) && (i==5 || i==6)) {
                    System.out.printf("%s",(j==1)?"*":(inferiorDerecha = false && j==5)?"":(j==5)?"":" ");
                }

                if (inferiorDerecha = true && (i==5 || i==6)) {
                    if (inferiorIzquierda= false) {
                        System.out.printf("%s",(j<5)?" ":"");
                    }
                    System.out.printf("%s",(j==5)?"*":"");
                }
            }

            System.out.println("");

        }

    }
}
