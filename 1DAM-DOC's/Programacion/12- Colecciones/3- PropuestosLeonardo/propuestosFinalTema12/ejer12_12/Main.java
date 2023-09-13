package ejerProps.ejer12_12;

import java.util.Comparator;

public class Main {
    public static void main(String[]args){
        Contenedor<Integer> cont1 = new Contenedor<>(new Integer[0]);

        for (int i = 0; i < 30 ; i++){
            cont1.insertarAlFinal((int)(Math.random()*10)+1);
        }
        System.out.println(cont1);

        Comparator<Integer> comparadorAscendente = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        Comparator<Integer> comparadorDescendente = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        cont1.ordenar(comparadorAscendente);
        System.out.println(cont1);
        cont1.ordenar(comparadorDescendente);
        System.out.println(cont1);


    }
}
