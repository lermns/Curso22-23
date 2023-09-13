package ejerProps.ejer12_24;

import java.util.*;


public class Main {
    public static void main(String [] args){
        List<Integer> numeros1 = new ArrayList<>();
        List<Integer> numeros2 = new ArrayList<>();
        List<Integer> listaFusion = new ArrayList<>();

        cargarDatos(numeros1, numeros2);//carga numeros en ambas listas
        System.out.println("Listas sin orden.");
        System.out.println("lista 1: " + numeros1);
        System.out.println("lista 2: " + numeros2);

        ordenarListas(numeros1, numeros2);//
        System.out.println("\nListas ya ordenadas.");
        System.out.println("lista 1: " + numeros1);
        System.out.println("lista 2: " + numeros2);

        fusionLista(numeros1, numeros2, listaFusion);
        System.out.println("\nLista fusionada y ordenada: \n" +
                            listaFusion);
    }


    private static void fusionLista(List<Integer> numeros1, List<Integer> numeros2, List<Integer> listaFusion) {
        for(Integer num1 : numeros1){
            listaFusion.add(num1);
        }
        for(Integer num2 : numeros2){
            listaFusion.add(num2);
        }
        ordenarListas(listaFusion);
    }

    private static void ordenarListas(List<Integer> numeros1, List<Integer> numeros2) {
        numeros1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        numeros2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
    }
    private static void ordenarListas(List<Integer> numeros) {
        numeros.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
    }

    private static void cargarDatos(List<Integer> numeros1, List<Integer> numeros2) {
        numeros1.add(3);
        numeros1.add(1);
        numeros1.add(9);
        numeros1.add(5);
        numeros1.add(7);
        numeros1.add(3);
        numeros1.add(9);

        numeros2.add(8);
        numeros2.add(10);
        numeros2.add(6);
        numeros2.add(2);
        numeros2.add(4);
        numeros2.add(6);
        numeros2.add(10);
    }
}
