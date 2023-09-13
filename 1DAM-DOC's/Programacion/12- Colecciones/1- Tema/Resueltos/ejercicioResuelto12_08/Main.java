package tema12.ejerciciosResueltos.ejercicioResuelto12_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();
        Collection<Integer> listaCreciente = new ArrayList<>();
        Collection<Integer> listaDecreciente = new ArrayList<>();
        Integer[] intArray;
        Comparator<Integer> ordenDecreciente ;
        
        for (int intCont = 0; intCont < 20; intCont++) {
            lista.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(lista);
        
        intArray = lista.toArray(new Integer[0]);
        Arrays.sort(intArray);
        listaCreciente.addAll(Arrays.asList(intArray));
        System.out.println(listaCreciente);
        
        ordenDecreciente = new Comparator<>() {
            @Override
            public int compare(Integer e1, Integer e2) {
                return e2 - e1;
            }
        };
        Arrays.sort(intArray, ordenDecreciente);
        listaDecreciente.addAll(Arrays.asList(intArray));
        System.out.println(listaDecreciente);
    }

}
