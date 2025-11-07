public class EJ19 {
    public static void main(String[] args) {
        float notaPrimerExamen;
        float notaSegundoExamen;
        float media;

        String resultado;
 
        System.out.print("Nota del primer examen: ");
        notaPrimerExamen = Float.parseFloat(System.console().readLine());

        System.out.print("Nota segundo examen: ");
        notaSegundoExamen = Float.parseFloat(System.console().readLine());

        media = (notaPrimerExamen + notaSegundoExamen) / 2f;

        //PRIMERA MANERA

        //if (media >= 5) {
        //    System.out.printf("Tu nota en programación es %.2f \n ",media);
        //} else {
        //    System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
        //    resultado = System.console().readLine().toLowerCase();
        //    
        //    if (resultado.equals("apto")) {
        //        System.out.println("Tu nota en programación es un 5");
        //    }else {
        //        System.out.printf("Tu nota en programación es %.2f\n",media);
        //    }
        //}

        //SEGUNDA MANERA

        if (media < 5) {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            resultado = System.console().readLine().toLowerCase();
            if (resultado.equals("apto")) {
                media = 5 ;
            }

        }

        System.out.printf("Tu nota en programación es %.2f\n",media);
    }
}
