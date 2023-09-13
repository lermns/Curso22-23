package tema12.ejerciciosResueltos.ejercicioResuelto12_06;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();//admite repetidos
        boolean eliminado;
        
        for (int intCont = 0; intCont < 100; intCont++) {
            lista.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(lista);
        eliminado = lista.remove(5);
        while (eliminado) {
            eliminado = lista.remove(5);
        }
        System.out.println(lista);
    }

}
