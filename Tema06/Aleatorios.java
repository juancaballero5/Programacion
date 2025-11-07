public class Aleatorios {
    public static void main(String[] args) {
        
        double aleatorio;
        double numero;
        //Generamos un numero random , El "random" genera un numero Double del [0,1)
        aleatorio = Math.random();
        System.out.println(aleatorio);

        //Para generar un numero random del [0-10)

        aleatorio = (int)(Math.random() * 10);
        System.out.println(aleatorio);

        //Generamos un numero del intervalo del [0-10]


        numero = (int)(Math.random() * (10 + 1));
        System.out.println(numero);

        //[min,max) -->((Math.random() * (max - min)) + min )
        //Generamos un numero del intervalo del [5-10)

        numero = (int) ((Math.random() * (10 - 5)) + 5 );
        System.out.println(numero);

        //[min,max] --> (Math.random() * (max + 1 - min) + min )
        //Generamos un número aleatorio en el intervalo [5-10]

        numero =(int) (Math.random() * (10 + 1 - 5 ) + 5);
        System.out.println(numero);
}
}