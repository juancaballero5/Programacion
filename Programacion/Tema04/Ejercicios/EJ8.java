public class EJ8 {
    public static void main(String[] args) {
        
        float a;
        float b;
        float c;
        float calculo;
        float x1;
        float x2;

        System.out.println("Este programa resueleve ecuaciones de segundo grado.");
        System.out.println("ax\u00B2 + bx + c = 0 ");
        System.out.println("Introduce los valores");
        System.out.print("a = ");
        a = Float.parseFloat(System.console().readLine());
        System.out.print("b = ");
        b = Float.parseFloat(System.console().readLine());
        System.out.print("c = ");
        c = Float.parseFloat(System.console().readLine());
        

        if ((a == 0) && (b == 0) && (c == 0)) {
            System.out.println("La ecuación tiene infinitas soluciones");
        }else if ((a == 0) && (b == 0)) {
            System.out.println("La ecuación no tiene solución");
        }else{
            calculo = (float) Math.sqrt((b * b) - 4 * a * c);

        if (calculo < 0 ) {
            System.out.println("La ecuación tiene soluciones infinitas");
        }else {
            x1 = (float) ((-b + calculo ) / 2 * a);
            x2 = (float) ((-b - calculo ) / 2 * a);

            System.out.printf("x1 = %.2f",x1);
            System.out.printf("x2 = %.2f",x2);  
        }
    }
}
}
