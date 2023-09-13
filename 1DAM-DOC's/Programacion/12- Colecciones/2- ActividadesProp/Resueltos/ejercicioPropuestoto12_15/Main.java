package tema12.ejerciciosPropuestos.ejercicioPropuestoto12_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        List<Integer> sinRep;
        
        for (int intCont = 0; intCont < 30; intCont++) {
            lista.add((int) (Math.random() * 10) + 1);
        }
        System.out.println("lista original: " + lista);
        sinRep = eliminarRepetidos(lista);
        System.out.println("sin repetidos: " + sinRep);
    }

    static <T> List<T> eliminarRepetidos(List<T> original) {
        /*Creamos un conjunto para eliminar repetidos: */
        Set<T> sinRepetidos = new LinkedHashSet<>(original);//preserva el orden        de inserción. 
        return new ArrayList<>(sinRepetidos);//Volvemos a la forma de lista:
    }

}
