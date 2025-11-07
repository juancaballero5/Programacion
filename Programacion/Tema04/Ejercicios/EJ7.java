

public class EJ7 {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        double media;

        System.out.print("Introduzaca la primera nota :");
        nota1 = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzaca la segunda nota :");
        nota2 = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzaca la tercera nota :");
        nota3 = Double.parseDouble(System.console().readLine());

        if (nota1>0 && nota2 >0 && nota3 >0) {
            media = (nota1+nota2+nota3) / 3;
            System.out.printf("La media es de %.2f",media);
            if (media<=4.9) {
                
            }

        }else{
            System.out.println("**Error valor no validos");
        }

        
    }
}
