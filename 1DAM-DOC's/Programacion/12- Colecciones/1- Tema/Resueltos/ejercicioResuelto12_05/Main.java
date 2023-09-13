package tema12.ejerciciosResueltos.ejercicioResuelto12_05;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();
        Collection<Integer> listaSinRepetidos = new ArrayList<>();
        
        for (int intCont = 0; intCont < 20; intCont++) {
            lista.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(lista);
        
        for (Integer intValor : lista) {
            if (!listaSinRepetidos.contains(intValor)) {
                listaSinRepetidos.add(intValor);
            }
        }
    }

}