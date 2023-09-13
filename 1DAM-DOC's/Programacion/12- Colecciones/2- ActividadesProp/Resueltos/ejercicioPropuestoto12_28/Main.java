package tema12.ejerciciosPropuestos.ejercicioPropuestoto12_28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
	  
	  Set<Carta> alCartas = new HashSet<Carta>();
	  HashMap <String,Integer> hmValores = new HashMap <String,Integer>();  
	  int intTotal=0;
	  
	  hmValores.put("as", 11);
	  hmValores.put("tres", 10);
	  hmValores.put("sota", 2);
	  hmValores.put("caballo", 3);
	  hmValores.put("rey", 4);
	  
	    Carta objCarta = new Carta();
	    alCartas.add(objCarta);
	    
/*	    for (int intCont = 0; intCont < 5; intCont++) {
	      do {
	        objCarta = new Carta();      
	      } while (alCartas.contains(objCarta));//si la carta existe repetir
	      alCartas.add(objCarta);
	    }*/
	    while(alCartas.size()<5)
	    	alCartas.add(new Carta());

	    for (Carta objCart: alCartas) {
	      System.out.println("\t"+objCart + " valor: " + hmValores.getOrDefault(objCart.getNumero(), 0));
/*	      if(hmValores.get(objCart.getNumero())!=null) 
	    	  intTotal+=hmValores.get(objCart.getNumero());
*/	      intTotal+=hmValores.getOrDefault(objCart.getNumero(), 0);
	    }
	    System.out.println("Tienes " + intTotal +" puntos");
  }
}
