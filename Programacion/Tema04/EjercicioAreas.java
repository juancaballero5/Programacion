import java.util.Scanner;

public class EjercicioAreas {
    public static void main(String[] args) {

        int area;
        float lado;
        float areaCuadrado;
        float base;
        float areaRectangulo;
        float altura;
        float areaTriangulo;
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Pulse 1 para calcular el area de un Cuadrado");
        System.out.println("Pulse 2 para calcular el area de un Rectángulo");
        System.out.println("Pulse 3 para calcular el area de un Triángulo");
        
        System.out.print("\n¿Que area desea calcular? :");

        area = escaner.nextInt();

        switch (area) {
            case 1:
                System.out.print("Introduzca la medida del lado del cuadrado (cm) :");
                lado = escaner.nextFloat();

                areaCuadrado = lado * lado;

                System.out.printf("El area del cuadrado es %.2f cm\u00B2",areaCuadrado);
                break;
            case 2:
                System.out.print("Introduzca la medida de la base del rectángulo (cm) :");
                base = escaner.nextFloat();
                System.out.print("Introduzca la medida de la altura del rectángulo (cm) :");
                altura = escaner.nextFloat();

                areaRectangulo = base * altura;

                System.out.printf("El area del rectangulo es %.2f cm\u00B2",areaRectangulo);
                break;
            case 3:
                System.out.print("Introduzca la medida de la base del rectángulo (cm) :");
                base = escaner.nextFloat();
                System.out.print("Introduzca la medida de la altura del rectángulo (cm) :");
                altura = escaner.nextFloat();

                areaTriangulo = (base * altura) / 2;

                System.out.printf("El area del triangulo es %.2f cm\u00B2",areaTriangulo);
                break;
        
            default:
            System.out.println("**Error  No es un numero valido");
                break;
        }
        escaner.close();
    }
}
