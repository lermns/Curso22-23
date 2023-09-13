package tema12.ejerciciosPropuestos.ejercicioPropuestoto12_20;

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
        SuperCola objCola = new SuperCola();
        
        System.out.println("Saca elemento de la cola1: " + objCola.pop1());
        objCola.push1(5);
        System.out.println("Inserta elemento en la cola1: 5");
        objCola.push1("a");
        System.out.println("Inserta elemento en la cola1: a");
        objCola.push1(7);
        System.out.println("Inserta elemento en la cola1: 7");
        objCola.push1(12);
        System.out.println("Inserta elemento en la cola1: 12");
        System.out.println("Saca elemento de la cola2: " + objCola.pop2());
        System.out.println("Saca elemento de la cola2: " + objCola.pop2());
        objCola.push2(15);
        System.out.println("Inserta elemento en la cola2: 15");
        System.out.println("Saca elemento de la cola2: " + objCola.pop2());
        System.out.println("Saca elemento de la cola2: " + objCola.pop2());
    }

}
