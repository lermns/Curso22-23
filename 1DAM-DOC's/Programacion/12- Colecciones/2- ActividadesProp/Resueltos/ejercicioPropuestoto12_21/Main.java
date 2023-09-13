package tema12.ejerciciosPropuestos.ejercicioPropuestoto12_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
    	Comparator<Integer> comparador = Comparator.naturalOrder();
    	Collection<Integer> lista = new TreeSet<>(comparador.reversed());
        
        for (int intCont = 0; intCont < 30;) {
            if(lista.add((int) (Math.random() * 100)))//si se ha añadido pido otro, sino no
            	 intCont++;
        }
        System.out.println("lista original: " + lista);
    }

}
