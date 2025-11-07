public class EJ1 {
    public static void main(String[] args) {
        int i = 0;
        int numero;
        int numInt = 0;

        System.out.println("Introduzca número y pulse \033[1mENTER\033[0m. Para acabar introduce un numero negativo");
        System.out.print("?");
            numero = Integer.parseInt(System.console().readLine());

        while (numero >= 0) {
            i += numero;
            System.out.print("?");
            numero = Integer.parseInt(System.console().readLine());
            numInt ++;
        }
        System.out.printf("Se han introducido \033[1m%d\033[0m números en total y la suma de todos ellos es \033[1m%d\033[0m",numInt,i);
        
    }
}
