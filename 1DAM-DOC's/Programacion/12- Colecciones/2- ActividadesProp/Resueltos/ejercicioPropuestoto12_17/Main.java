package tema12.ejerciciosPropuestos.ejercicioPropuestoto12_17;

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
        Cola objCola = new Cola();
        
        System.out.println("Saca elemento de la cola: " + objCola.pop());
        objCola.push(5);
        System.out.println("Inserta elemento en la cola: 5");
        objCola.push("a");
        System.out.println("Inserta elemento en la cola: a");
        objCola.push(7);
        System.out.println("Inserta elemento en la cola: 7");
        objCola.push(12);
        System.out.println("Inserta elemento en la cola: 12");
        System.out.println("Saca elemento de la cola: " + objCola.pop());
        System.out.println("Saca elemento de la cola: " + objCola.pop());
        objCola.push(15);
        System.out.println("Inserta elemento en la cola: 15");
    }

}
