public class Ejercicio1 {
    public static void main(String[] args) {
        double nota;
        double[] notas;
        double total = 0;
        double media;
        double maxima = 0;
        double baja = 0;
        int aprobados = 0;

        notas = new double[10];

        try {
            
            System.out.println("Introduzca la nota de 10 alumnos");

            for (int i = 1; i <= notas.length; i++) {
                
                System.out.printf("Nota del alumno %d:",i);
                nota = Double.parseDouble(System.console().readLine());

                System.out.println("");

                notas[i - 1] = nota;

                total += nota;

                if (nota > maxima) {
                    maxima = nota;
                }

                if (nota < baja) {
                    baja = nota;
                }

            }

            media = (total / notas.length);

            for (int i = 0; i < notas.length; i++) {
                
                if (notas[i] >= 5) {
                    aprobados++;
                }

            }

            System.out.printf("Media: %.2f\n",media);
            System.out.printf("Nota más alta: %.2f\n",maxima);
            System.out.printf("Nota más baja: %.2f\n",baja);
            System.out.printf("Alumnos aprobados: %d\n",aprobados);

            
        } catch (Exception e) {
            System.out.println("**ERROR: El programa ha fallado.");
        }
    }
}
