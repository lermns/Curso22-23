package tema12.ejemplos.ejemplo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//Como colectión es una interfaz, puedo apuntar a cualquiera que la implemente
		List<Cliente> listaClientes = new ArrayList<Cliente>();

		//Uso add para añadir clientes al final de la lista
		listaClientes.add(new Cliente("1234", "pepe", "2000-01-01"));
		listaClientes.add(new Cliente("3456", "maría", "2006-08-04"));
		listaClientes.add(new Cliente("5678", "ana", "2002-03-25"));
		listaClientes.add(new Cliente("7890", "juan", "2004-05-15"));
		
		//muestro el contenido con get
		System.out.println("\nUso de get( )");
		for(int intCont=0; intCont<listaClientes.size(); intCont++)
			System.out.println(listaClientes.get(intCont));
		
		//muestro el contenido con set y cambio el valor
		System.out.println("\nUso de get( )");
		System.out.println("Cambia el cliente 3 que tiene el valor " +listaClientes.set(2, new Cliente("6789", "Sara", "2001-07-13")));
		System.out.println("por el valor " + listaClientes.get(2));
		
		//inserta un nuevo elemento en una posición con add
		System.out.println("\nUso de add(2, elemento)");
		listaClientes.add(2, new Cliente("4567", "Leo", "2007-07-27"));
		for(int intCont=0; intCont<listaClientes.size(); intCont++)
			System.out.println(listaClientes.get(intCont));
		
		//inserta una lista en una posición con addAll
		System.out.println("\nUso de addAll(2, lista2)");
		List <Cliente> lista2 = new ArrayList<>();
		lista2.add(new Cliente("5901", "Kai", "2008-08-28"));
		lista2.add(new Cliente("5012", "Sol", "2009-09-29"));
		lista2.add(new Cliente("5123", "Flor", "2010-10-30"));
		listaClientes.addAll(3, lista2);
		for(int intCont=0; intCont<listaClientes.size(); intCont++)
			System.out.println(listaClientes.get(intCont));

		//elimina un elemento de la lista que se encuentra en un indice con remove
		System.out.println("\nUso de remove(3) tres veces y queda la lista como antes");
		System.out.println("Elimna el elemento 3 que es: " + listaClientes.remove(3));
		System.out.println("Elimna el elemento 3 que es: " + listaClientes.remove(3));
		System.out.println("Elimna el elemento Flor " + listaClientes.remove(new Cliente("5123", "Flor", "2010-10-30")));
		for(int intCont=0; intCont<listaClientes.size(); intCont++)
			System.out.println(listaClientes.get(intCont));
		
		//elimina un elemento de la lista que se encuentra en un indice con remove
		System.out.println("\nUso de indexOf pepe");
		listaClientes.add(new Cliente("1234", "pepe", "2000-01-01"));
		listaClientes.add(2, new Cliente("1234", "pepe", "2000-01-01"));
		System.out.println("Lista actual");
		lista2.clear();//vacía la lista
		for(int intCont=0; intCont<listaClientes.size(); intCont++) {
			System.out.println("\t" + intCont + " " + listaClientes.get(intCont));
			lista2.add(intCont, listaClientes.get(intCont));
		}
		System.out.println("Ubicación primera de pepe: " + listaClientes.indexOf(new Cliente("1234", "pepe", "2000-01-01")));
		System.out.println("Ubicación última de pepe: " + listaClientes.lastIndexOf(new Cliente("1234", "pepe", "2000-01-01")));
		System.out.println("¿Es igual que la lista2? " + listaClientes.equals(lista2));
		lista2.remove(0);
		System.out.println("¿Es igual que la lista2? " + listaClientes.equals(lista2));
		listaClientes.sort(null);
		for(int intCont=0; intCont<listaClientes.size(); intCont++) 
			System.out.println("\t" + intCont + " " + listaClientes.get(intCont));
			
	}

}
