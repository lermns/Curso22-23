package tema12.ejemplos.ejemplo4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Map<Integer, Cliente> mapa1 = new HashMap<>();
		Map<Integer, Cliente> mapa2 = new LinkedHashMap<>();
		Map<Integer, Cliente> mapa3 = new TreeMap<>();

		//Uso HashMap
		mapa1.put(4, new Cliente("7890", "juan", "2004-05-15"));
		mapa1.put(3, new Cliente("5678", "ana", "2002-03-25"));
		mapa1.put(1, new Cliente("1234", "eliminado", "2000-01-01"));
		System.out.println("Inserta con clave 1 a pepe sobre eliminado " + mapa1.put(1, new Cliente("1234", "pepe", "2000-01-01")));
		mapa1.put(2, new Cliente("3456", "maría", "2006-08-04"));
		System.out.println("\nUso de HashSet\n" + mapa1);
		mapa1.put(0, new Cliente("0123", "sol", "2004-05-15"));
		System.out.println("\nUso de HashSet\n" + mapa1);

		//Uso LinkedHashMap
		mapa2.put(4, new Cliente("7890", "juan", "2004-05-15"));
		mapa2.put(3, new Cliente("5678", "ana", "2002-03-25"));
		mapa2.put(1, new Cliente("1234", "pepe", "2000-01-01"));
		mapa2.put(1, new Cliente("1234", "pepe", "2000-01-01"));
		mapa2.put(3, new Cliente("3456", "maría", "2006-08-04"));
		System.out.println("\nUso de LinkedHashSet\n" + mapa2);

		//Uso TreeMap
		mapa3.put(4, new Cliente("7890", "juan", "2004-05-15"));
		mapa3.put(3, new Cliente("5678", "ana", "2002-03-25"));
		mapa3.put(1, new Cliente("1234", "pepe", "2000-01-01"));
		mapa3.put(1, new Cliente("1234", "pepe", "2000-01-01"));
		mapa3.put(3, new Cliente("3456", "maría", "2006-08-04"));
		System.out.println("\nUso de TreeSet\n" + mapa3);
		
		//recorrido con clave valor
		System.out.println("\n Recorrido de  mapa3 por clave, valor");
		for (Map.Entry <Integer, Cliente> elemento : mapa3.entrySet()) 
			System.out.println("Clave: " + elemento.getKey() + ", valor: " + elemento.getValue());

		//recorrido por clave 
		System.out.println("\n Recorrido de  mapa3 por clave");
		for (int intElemento : mapa3.keySet()) 
			System.out.println("Clave: " + intElemento);

		//recorrido por valor
		System.out.println("\n Recorrido de  mapa3 por valor");
		for (Cliente objCliente : mapa3.values()) 
			System.out.println("valor: " + objCliente);				
		
		//recorrido con un iterador
		System.out.println("\n Recorrido de  mapa3 por iterador en la clave");
		Iterator <Integer> iterador = mapa3.keySet().iterator();
		int intClave;
		while(iterador.hasNext()) {
			intClave = iterador.next();
			System.out.println("Clave: " + intClave + ", valor: " + mapa3.get(intClave));
		}
	}

}
