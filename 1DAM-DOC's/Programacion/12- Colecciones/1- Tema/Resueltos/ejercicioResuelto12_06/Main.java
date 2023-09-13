package tema12.ejerciciosResueltos.ejercicioResuelto12_06;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();//admite repetidos
        
        for (int intCont = 0; intCont < 100; intCont++) 
            lista.add((int) (Math.random() * 10 + 1));
        
        System.out.println(lista);
        while (lista.remove(5));//mientras me devuelva que ha eliminado un elemento continuo eliminando
        System.out.println(lista);
    }

}
