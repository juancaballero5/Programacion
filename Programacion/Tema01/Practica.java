public class Practica {
    public static void main(String[] args) {
    
        int x ;
        int y ;

        int suma;
        int resta;
        int multiplicacion;
        double division;

        x  = 144;
        y  = 999;

        System.out.printf("x = %d \n",x);
        System.out.printf("y = %d \n ",y);

        suma = x + y;
        System.out.printf("x + y = %d \n",suma);
        resta = x - y;
        System.out.printf("x - y = %d \n",resta);
        division = x / y; 
        System.out.printf("x / y = %.8f \n",division);
        multiplicacion = x * y;
        System.out.printf("x * y = %d \n",multiplicacion);  

    }
}