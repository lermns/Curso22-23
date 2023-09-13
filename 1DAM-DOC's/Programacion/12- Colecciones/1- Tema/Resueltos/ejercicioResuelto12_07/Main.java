package tema12.ejerciciosResueltos.ejercicioResuelto12_07;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();//admite repetidos
        Collection<Integer> listaNoRep = new ArrayList<>();//no admite repetidos
        
        for (int intCont = 0; intCont < 100; intCont++) {
            lista.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(lista);
        listaNoRep.add(5); 
        lista.removeAll(listaNoRep);
        System.out.println(lista);
    }

}
