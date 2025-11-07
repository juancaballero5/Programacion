public class Ejerciciomeses {
    public static void main(String[] args) {
        int mes;
        
        System.out.print("Introduzca un número de mes:");
        mes = Integer.parseInt(System.console().readLine());

        switch (mes) {
            case 1:
                System.out.println("\033[1mENERO\033[0m");
                break;
            case 2:
                System.out.println("\033[1mFEBRERO\033[0m");
                break;
            case 3:
                System.out.println("\033[1mMARZO\033[0m");
                break;
            case 4:
                System.out.println("\033[1mABRIL\033[0m");
                break;
            case 5:
                System.out.println("\033[1mMAYO\033[0m");
                break;
            case 6:
                System.out.println("\033[1mJUNIO\033[0m");
                break;
            case 7:
                System.out.println("\033[1mJULIO\033[0m");
                break;
            case 8:
                System.out.println("\033[1mAGOSTO\033[0m");
                break;
            case 9:
                System.out.println("\033[1mSEPTIEMBRE\033[0m");
                break;
            case 10:
                System.out.println("\033[1mOCTUBRE\033[0m");
                break;
            case 11:
                System.out.println("\033[1mNOVIEMBRE\033[0m");
                break;
            case 12:
                System.out.println("\033[1mDICIEMBRE\033[0m");
                break;
        
            default:
                System.out.println("**Error Numero no valido");
                break;
        }
    }
}
