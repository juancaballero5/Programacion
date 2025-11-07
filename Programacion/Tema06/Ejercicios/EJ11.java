package Ejercicios;
public class EJ11 {
    public static void main(String[] args) {

        int letra;

        while(true){
        letra = (int) ((Math.random() * (126 - 32 + 1)) + 32);
        System.out.printf("%c",letra);
        }
        
       
        
    }
}
