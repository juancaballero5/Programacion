import java.util.HashSet;
import java.util.Set;

public class Conjuntos {

    public static void main(String[] args) {
        
        // HashSet<String> frutas = new HashSet<>();

        // frutas.add("Manzana");
        // frutas.add("Pera");
        // frutas.add("Plátano");
        // frutas.add("Uvas");
        // frutas.add("Frutas del bosque");
        // frutas.add("Kiwi");
        // frutas.add("Melocotón");
        // frutas.add("Sandía");
        // frutas.add("Melón");

        // System.out.println("COLECCIÓN DE FRUTAS");
        // System.out.println("==================================================");

        // for(String item: frutas) {
        //     System.out.println(item);
        // }


        // if (frutas.add("Uvas")) {
        //     System.out.println("El elemento se ha insertado correctamente");
        // } else {
        //     System.out.println("El elemento ya existía en la colección");
        // }

        // // Comprobar si la colección contiene un elemento

        // System.out.println("¿Contiene el elemento Kiwi?" + frutas.contains("Kiwi"));


        HashSet<Integer> conjuntoA = new HashSet<>(Set.of(8, 13, 22, 4));
        HashSet<Integer> conjuntoB = new HashSet<>(Set.of(5, 13, 17, 1));

        // Manera NO RECOMENDABLE
        HashSet<Integer> conjuntoC = new HashSet<>() {{
            add(1);
            add(2);
            add(3);
            add(4);
        }};


        System.out.println("CONJUNTOS");
        System.out.println("==============================");
        System.out.println(conjuntoA);
        System.out.println(conjuntoB);

        System.out.println("UNION");
        System.out.println("=============================");
        conjuntoA.addAll(conjuntoB);
        System.out.println(conjuntoA);
        
        System.out.println("INTERSECCION");
        System.out.println("=============================");
        conjuntoA.retainAll(conjuntoB);
        System.out.println(conjuntoA);

        System.out.println("DIFERENCIA");
        System.out.println("===============================");
        conjuntoA.removeAll(conjuntoB);
        System.out.println(conjuntoA);

    }
}