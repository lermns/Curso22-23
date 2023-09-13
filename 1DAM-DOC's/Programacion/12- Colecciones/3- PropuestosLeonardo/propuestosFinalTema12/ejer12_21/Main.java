package ejerProps.ejer12_21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String [] args){
        List<Integer> lista1 = new ArrayList<>();
        Comparator<Integer> comparadorDescendente = Collections.reverseOrder();
        int intNumAlet;


        for(int i=0; i<20; i++){
            intNumAlet = ((int) (Math.random() * 100)+1);
            lista1.add(intNumAlet);
            Collections.sort(lista1, comparadorDescendente);
        }
        System.out.println(lista1);
    }
}
