public class EJ1DoWhile {
    public static void main(String[] args) {
        int i = 0;
        int numero;
        int numInt = 0;

        System.out.println("Introduzca número y pulse \033[1mENTER\033[0m. Para acabar introduce un numero negativo");
        do {
            System.out.print("?");
            numero = Integer.parseInt(System.console().readLine());
            if (numero>=0) {
                i += numero;
                numInt ++;
            }
        } while (numero>=0);
        System.out.printf("Se han introducido \033[1m%d\033[0m números en total y la suma de todos ellos es \033[1m%d\033[0m",numInt,i);
}
}
