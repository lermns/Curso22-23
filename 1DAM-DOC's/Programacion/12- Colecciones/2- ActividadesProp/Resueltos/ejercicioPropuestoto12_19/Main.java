package tema12.ejerciciosPropuestos.ejercicioPropuestoto12_19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();//admite repetidos
        List<String> listaAux;
        Set<String> listaNoRep;//no admite repetidos
        Scanner scnLeer = new Scanner(System.in);
        String strFrase;
        
        System.out.println("Escribe una frase con las palabras separadas por un solo espacio en blanco");
        strFrase = scnLeer.nextLine();
        StringTokenizer st = new StringTokenizer(strFrase);
        while(st.hasMoreTokens())
        	lista.add(st.nextToken());
        
        lista.sort(null);
        listaAux = new ArrayList(lista); 
        System.out.println("Lista de palabras con repeticiones " + lista);
        
        listaNoRep = new TreeSet(lista); 
        for(String strValor:listaNoRep)//quito los elementos que están una sola vez
        	lista.remove(strValor);
        listaNoRep = new TreeSet(lista); 
        System.out.println("Lista de palabras repetidas " + listaNoRep);
        
        listaAux.removeAll(listaNoRep);//quito a la lista original lo que están repetidos
        System.out.println("Lista de palabras no repetidas " + listaAux);
    }

}
