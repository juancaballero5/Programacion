public class Ejercicio3Ejemplo {
    public static void main(String[] args) {
        double numero;

        System.out.print("Introduzca un numero del 1 al 100 :");
        numero = Double.parseDouble(System.console().readLine());

        if (numero >= 1 && numero <= 100) {
            
            System.out.println("\033[1m\033[32m¡Enhorabuena!\033[0m ¡El valor introducido está en el rango solicitado!");}

        else{
            System.out.println("Te he dicho un valor del \033[1m1 al 100\033[0m");
        }
    }
}
