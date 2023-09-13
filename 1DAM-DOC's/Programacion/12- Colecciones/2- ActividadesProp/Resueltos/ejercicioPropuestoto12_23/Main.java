package tema12.ejerciciosPropuestos.ejercicioPropuestoto12_23;

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
    	int[] intArray1 = {1,3,5,7,9,12};
        List<Integer> lista1 = new ArrayList<>();
    	int[] intArray2 = {2,4,8,11,35};
        List<Integer> lista2 = new ArrayList<>();
        List<Integer> listaFusion;
        int intPos;

    	//carga de las listas
    	for(int intValor:intArray1)
    		lista1.add(intValor);
    	for(int intValor:intArray2)
    		lista2.add(intValor);
    	
    	
    	listaFusion = new ArrayList(lista1);
    	for(int intValor:lista2) {
    		intPos=Collections.binarySearch(listaFusion, intValor);
    		if(intPos<0)//sin no lo encuentra
    			intPos=-intPos-1;
    		if(intPos>=listaFusion.size())//si intento insertar fuera del rango da error
        		listaFusion.add(intValor);
    		else
    			listaFusion.add(intPos, intValor);
    	}
        
        System.out.println(listaFusion);
    }

}
