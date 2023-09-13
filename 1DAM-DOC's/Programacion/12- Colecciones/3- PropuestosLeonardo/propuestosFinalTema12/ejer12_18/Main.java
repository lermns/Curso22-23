package ejerProps.ejer12_18;

public class Main {
    public static void main(String[]args){
        Pila<String> pilaCadenas = new Pila<>();
        Pila<Integer> pilaEnteros = new Pila<>();

        pilaCadenas.aPilar("plato 1");
        pilaCadenas.aPilar("plato 6");
        pilaCadenas.aPilar("plato 3");
        pilaCadenas.aPilar("plato 9");
        pilaCadenas.aPilar("plato 7");
        pilaCadenas.aPilar("plato 2");

        pilaEnteros.aPilar(60);
        pilaEnteros.aPilar(10);
        pilaEnteros.aPilar(90);
        pilaEnteros.aPilar(30);
        pilaEnteros.aPilar(100);
        pilaEnteros.aPilar(20);

        System.out.println(pilaCadenas.verPila() + ": último plato de la Pila.\n");

        while(!pilaCadenas.isEmpty()){
            System.out.println(pilaCadenas.desApilar());
        }
        System.out.println("\n");
        System.out.println(pilaEnteros.verPila() + ": último entero de la Pila.\n");

        while(!pilaEnteros.isEmpty()){
            System.out.println(pilaEnteros.desApilar());
        }

    }
}
