package tema12.ejemplos.ejemplo3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		HashSet<Cliente> conjunto1 = new HashSet<>();
		Set<Cliente> conjunto2 = new LinkedHashSet<>();
		Set<Cliente> conjunto3 = new TreeSet<>();

		//Uso HashSet
		conjunto1.add(new Cliente("7890", "juan", "2004-05-15"));
		conjunto1.add(new Cliente("5678", "ana", "2002-03-25"));
		conjunto1.add(new Cliente("1234", "pepe", "2000-01-01"));
		conjunto1.add(new Cliente("1234", "pepe", "2000-01-01"));
		conjunto1.add(new Cliente("3456", "maría", "2006-08-04"));
		System.out.println("\nUso de HashSet" + conjunto1);
		conjunto1.add(new Cliente("0123", "sol", "2004-05-15"));
		System.out.println("\nUso de HashSet" + conjunto1);

		//Uso LinkedHashSet
		conjunto2.add(new Cliente("7890", "juan", "2004-05-15"));
		conjunto2.add(new Cliente("1234", "pepe", "2000-01-01"));
		conjunto2.add(new Cliente("1234", "pepe", "2000-01-01"));
		conjunto2.add(new Cliente("5678", "ana", "2002-03-25"));
		conjunto2.add(new Cliente("3456", "maría", "2006-08-04"));
		System.out.println("\nUso de LinkedHashSet" + conjunto2);

		//Uso HashSet
		conjunto3.add(new Cliente("1234", "pepe", "2000-01-01"));
		conjunto3.add(new Cliente("7890", "juan", "2004-05-15"));
		conjunto3.add(new Cliente("3456", "maría", "2006-08-04"));
		conjunto3.add(new Cliente("1234", "pepe", "2000-01-01"));
		conjunto3.add(new Cliente("5678", "ana", "2002-03-25"));
		System.out.println("\nUso de TreeSet" + conjunto3);
		
		//Copiar un set desordenado en el tree para que esté ordenado
		conjunto3.clear();
		conjunto3.addAll(conjunto1);
		System.out.println("\nInsetados en TreeSet los desordenados" + conjunto3);
		
		//Copiar un set desordenado en el tree para que esté ordenado
		Set<Cliente> conjunto4 = new TreeSet<>(conjunto1);
		System.out.println("\nInsetados en TreeSet los desordenados 2" + conjunto4);
	}

}
