package Tema04;

public class Ej21 {
    public static void main(String[] args) {
        Double base;
        int IVA = 0;
        Double precioIVA;
        Double promo;
        Double total;
        Double costo = null;
        String tipoIVA;
        String tipoPromo;

        System.out.print("Introduzca la base imponible: ");
        base = Double.parseDouble(System.console().readLine());

        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido):");
        tipoIVA = System.console().readLine();

        switch (tipoIVA) {
            case "general":
                IVA = 21;
                break;
            case "reducido":
                IVA = 10;
                break;
            case "supeerreducido":
                IVA = 4;
                break;
            default:
                System.out.println("**Error tipo de IVA no valido");
                break;
        }

        precioIVA = base + (base * IVA / 100);
        total = precioIVA + base;

        System.out.print("Introduzca el tipo de promocion (nopro, mitad, meno5 o 5porc):");
        tipoPromo = System.console().readLine();

        switch (tipoPromo) {
            case "nopro":
                promo = (double) 0;
                costo = total;
                break;
            case "mitad":
                promo = (double) (50 / 100);
                costo = total * promo;
                break;
            case "meno5":
                promo = (double) -5;
                costo = total + promo;
                break;
            case "por5":
                promo = (double) (5 / 100);
                costo = total * promo;
                break;
            default:
                System.out.println("**Error tipo de promoción no valido");
                break;
        }

        System.out.printf("Base imponible \t %.2f \n", base);
        System.out.printf("IVA (%d) \t %.2f \n", IVA, base * IVA / 100);
        System.out.printf("Precio con IVA \t %.2f \n", IVA + base);
        System.out.printf("Cod. promo. (%c) \t %.2f \n", tipoPromo, total - costo);
        System.out.printf("\033[48;5;138;149;151\033[1mTOTAL: \t %.2f \033[0m\n", costo);
    }
}
