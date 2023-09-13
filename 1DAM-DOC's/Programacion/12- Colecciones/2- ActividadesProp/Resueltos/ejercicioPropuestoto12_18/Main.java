package tema12.ejerciciosPropuestos.ejercicioPropuestoto12_18;

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
        Pila objPila = new Pila();
        
        System.out.println("Saca elemento de la pila: " + objPila.pop());
        objPila.push(5);
        System.out.println("Inserta elemento en la pila: 5");
        objPila.push("a");
        System.out.println("Inserta elemento en la pila: a");
        objPila.push(7);
        System.out.println("Inserta elemento en la pila: 7");
        objPila.push(12);
        System.out.println("Inserta elemento en la pila: 12");
        System.out.println("Saca elemento de la pila: " + objPila.pop());
        System.out.println("Saca elemento de la pila: " + objPila.pop());
        objPila.push(15);
        System.out.println("Inserta elemento en la pila: 15");
    }

}
