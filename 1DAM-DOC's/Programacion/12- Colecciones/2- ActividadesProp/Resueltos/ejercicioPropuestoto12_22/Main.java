package tema12.ejerciciosPropuestos.ejercicioPropuestoto12_22;

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
        Collection <String> objColeccion = new LinkedHashSet<>();
        Scanner scnLeer = new Scanner(System.in);
        String strPalabra;
        
        System.out.println("Escribe las palabas que quieras insertar en la lista, una por línea y para terminar inserta fin");
        while(!(strPalabra=scnLeer.nextLine()).equals("fin"))
        	objColeccion.add(strPalabra);
        
        System.out.println(objColeccion);
    }

}
