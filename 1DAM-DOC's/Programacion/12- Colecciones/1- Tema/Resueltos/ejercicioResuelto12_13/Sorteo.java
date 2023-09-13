package tema12.ejerciciosResueltos.ejercicioResuelto12_13;

import java.util.*;

public class Sorteo<T extends Comparable<T>> {

    private final Set<T> elementos;

    public Sorteo() {
        elementos = new TreeSet<>();
    }

    boolean add(T nuevo) {
        return elementos.add(nuevo);
    }

    Set<T> premiados(int intNumPremiados) {
        Set<T> premiados = null;
        List<T> temp = new ArrayList<>(elementos);
        
        Collections.shuffle(temp);//mezcla los elemntos aleatoriamente
        if (intNumPremiados <= elementos.size()) {//podría haber premiado hasta que no quedaran o hubieramos llegado al número
            premiados = new TreeSet<>();
            for (int i = 0; i < intNumPremiados; i++) {
                premiados.add(temp.get(i));
            }
        }
        return premiados;
    }

    @Override
    public String toString() {
        return "Sorteo{elementos=" + elementos + '}';
    }
}
