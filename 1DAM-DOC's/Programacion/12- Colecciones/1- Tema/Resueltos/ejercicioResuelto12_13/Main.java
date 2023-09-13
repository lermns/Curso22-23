package tema12.ejerciciosResueltos.ejercicioResuelto12_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
        Sorteo<Integer> objSorteo = new Sorteo<>();
        
        for (int intCont = 0; intCont < 100; intCont++) //meto valores de 0 a 99
            objSorteo.add(intCont);
        
        System.out.println(objSorteo);
        System.out.println("Premiados: " + objSorteo.premiados(10));
    }

}
