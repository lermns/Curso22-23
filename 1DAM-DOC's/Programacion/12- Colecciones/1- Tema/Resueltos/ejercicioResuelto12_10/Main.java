package tema12.ejerciciosResueltos.ejercicioResuelto12_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        
        for (int intCont = 0; intCont < 20; intCont++) {
            lista.add((int) (Math.random() * 10) + 1);
        }

        Comparator<Integer> c = Comparator.naturalOrder();
        lista.sort(c);
        System.out.println("Lista original: " + lista);
        
        Set<Integer> sinRepeticiones = new TreeSet<>();
        sinRepeticiones.addAll(lista);
        System.out.println("Sin repeticiones: " + sinRepeticiones);
        
        Set<Integer> repetidos = new TreeSet<>();
        for (Integer intValor : sinRepeticiones) {
            lista.remove(intValor);         }

        repetidos.addAll(lista);
        System.out.println("Repetidos: " + repetidos);
        
        Set<Integer> unicos = new TreeSet<>();
        unicos.addAll(sinRepeticiones);
        unicos.removeAll(repetidos);
        System.out.println("Elementos no repetidos: " + unicos);
    }

}
