public class EJ9 {
    public static void main(String[] args) {

        int mes;
        int dia;

        System.out.println("Este programa te dirá cuál es tu horóscopo");
        System.out.print("Introduce el número del mes en el que nació (1-12):");
        mes = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el número del día en el que nació (1-31):");
        dia = Integer.parseInt(System.console().readLine());

        switch (mes) {
            case 1:
                if ((dia > 0) && (dia <= 20)) {
                    System.out.println("Su horóscopo es Capricornio");
                }else if ((dia > 20) && (dia <= 31)) {
                    System.out.println("Su horóscopo es Acuario");
                }else {
                    System.out.println("**Error el numero introducido no es valido ");
                }
                break;
            case 2:
                if ((dia > 0) && (dia <= 19)) {
                    System.out.println("Su horóscopo es Acuario");
                }else if ((dia > 19) && (dia <= 31)) {
                    System.out.println("Su horóscopo es Piscis");
                }else {
                    System.out.println("**Error el numero introducido no es valido ");
                }
                break;    
            case 3:
                if ((dia > 0) && (dia <= 20)) {
                    System.out.println("Su horóscopo es Piscis");
                }else if ((dia > 20) && (dia <= 31)) {
                    System.out.println("Su horóscopo es Aries");
                }else {
                    System.out.println("**Error el numero introducido no es valido ");
                }
                break;    
            case 4:
                if ((dia > 0) && (dia <= 21)) {
                    System.out.println("Su horóscopo es Aries");
                }else if ((dia > 21) && (dia <= 31)) {
                    System.out.println("Su horóscopo es Tauro");
                }else {
                    System.out.println("**Error el numero introducido no es valido ");
                }
                break;    
            case 5:
                if ((dia > 0) && (dia <= 22)) {
                    System.out.println("Su horóscopo es Tauro");
                }else if ((dia > 22) && (dia <= 31)) {
                    System.out.println("Su horóscopo es Géminis");
                }else {
                    System.out.println("**Error el numero introducido no es valido ");
                }
                break;    
            case 6:
                if ((dia > 0) && (dia <= 21)) {
                    System.out.println("Su horóscopo es Géminis");
                }else if ((dia > 21) && (dia <= 31)) {
                    System.out.println("Su horóscopo es Cáncer");
                }else {
                    System.out.println("**Error el numero introducido no es valido ");
                }
                break;    
            case 7:
                if ((dia > 0) && (dia <= 22)) {
                    System.out.println("Su horóscopo es Cáncer");
                }else if ((dia > 22) && (dia <= 31)) {
                    System.out.println("Su horóscopo es Leo");
                }else {
                    System.out.println("**Error el numero introducido no es valido ");
                }
                break;    
            case 8:
                if ((dia > 0) && (dia <= 22)) {
                    System.out.println("Su horóscopo es Leo");
                }else if ((dia > 22) && (dia <= 31)) {
                    System.out.println("Su horóscopo es Virgo");
                }else {
                    System.out.println("**Error el numero introducido no es valido ");
                }
                break;    
            case 9:
                if ((dia > 0) && (dia <= 23)) {
                    System.out.println("Su horóscopo es Virgo");
                }else if ((dia > 23) && (dia <= 31)) {
                    System.out.println("Su horóscopo es Libra");
                }else {
                    System.out.println("**Error el numero introducido no es valido ");
                }
                break;    
            case 10:
                if ((dia > 0) && (dia <= 22)) {
                    System.out.println("Su horóscopo es Libra");
                }else if ((dia > 22) && (dia <= 31)) {
                    System.out.println("Su horóscopo es Escorpio");
                }else {
                    System.out.println("**Error el numero introducido no es valido ");
                }
                break;    
            case 11:
                if ((dia > 0) && (dia <= 22)) {
                    System.out.println("Su horóscopo es Escorpio");
                }else if ((dia > 22) && (dia <= 31)) {
                    System.out.println("Su horóscopo es Sagitario");
                }else {
                    System.out.println("**Error el numero introducido no es valido ");
                }
                break;    
            case 12:
                if ((dia > 0) && (dia <= 23)) {
                    System.out.println("Su horóscopo es Sagitario");
                }else if ((dia > 23) && (dia <= 31)) {
                    System.out.println("Su horóscopo es Capricornio");
                }else {
                    System.out.println("**Error el numero introducido no es valido ");
                }
                break;    
            default:
                System.out.println("**Error El numero introducido no es valido");
                break;
        }
    }
}
