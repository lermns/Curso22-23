package tema12.ejemplos.ejemplo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//Como colectión es una interfaz, puedo apuntar a cualquiera que la implemente
		Collection<Cliente> coleccionClientes = new ArrayList<Cliente>();

		//Uso add para añadir un cliente en la colección
		coleccionClientes.add(new Cliente("1234", "pepe", "2000-01-01"));
		coleccionClientes.add(new Cliente("5678", "ana", "2002-03-25"));
		System.out.println(coleccionClientes);
		
		//Uso remove para eliminar un cliente en la colección
		coleccionClientes.remove(new Cliente("1234", "pepe", "2000-01-01"));
		coleccionClientes.remove(new Cliente("0000", "inventado", "2002-03-25"));
		System.out.println(coleccionClientes);
		
		//size indica el número de elementos en la colección
		coleccionClientes.add(new Cliente("1234", "pepe", "2000-01-01"));
		System.out.println("Número de elementos en la colección: " + coleccionClientes.size());
		
		//isEmpty indica si no hay elementos en la colección
		System.out.println("¿Está vacía la colección? " + coleccionClientes.isEmpty());
		coleccionClientes.remove(new Cliente("1234", "pepe", "2000-01-01"));
		coleccionClientes.remove(new Cliente("5678", "ana", "2002-03-25"));
		System.out.println("¿Está vacía la colección? " + coleccionClientes.isEmpty());
		coleccionClientes.add(new Cliente("1234", "pepe", "2000-01-01"));
		coleccionClientes.add(new Cliente("5678", "ana", "2002-03-25"));
		
		//contains indica si un determinado elemento se encuentra en la colección
		System.out.println("¿Está el elemento con id 1234? " + coleccionClientes.contains(new Cliente("1234", "pepe", "2000-01-01")));
		System.out.println("¿Está el elemento con id 5678? " + coleccionClientes.contains(new Cliente("5678", "juan", "2023-10-25")));
		
		//uso de iterador para recorrer la colección
		System.out.println("\nIterador");
		coleccionClientes.add(new Cliente("9012", "juan", "2004-05-15"));
		coleccionClientes.add(new Cliente("3456", "maría", "2006-08-04"));
		Iterator<Cliente> iterador = coleccionClientes.iterator();
		while(iterador.hasNext()) 
			System.out.println(iterador.next());
		//eliminamos a todos los que tengan menos de 18 años
		for(Iterator<Cliente> it = coleccionClientes.iterator(); it.hasNext();)
			if(it.next().getEdad()<18)
				it.remove();
		System.out.println("Colección sin menores: ");
		for(Cliente valorCliente:coleccionClientes)
			System.out.println(valorCliente);
		
		//prueba de containsAll 
		System.out.println("\ncontainsAll");
		Collection<Cliente> colec2 = new ArrayList<Cliente>();//nueva colección de ejempo
		colec2.add(new Cliente("1234", "raul", "2000-01-01"));
		colec2.add(new Cliente("5678", "mario", "2002-03-25"));
		System.out.println("¿Contiene todos los elementos? " + coleccionClientes.containsAll(colec2));
		colec2.add(new Cliente("2222", "carla", "2006-08-04"));
		System.out.println("¿Contiene todos los elementos? " + coleccionClientes.containsAll(colec2));

		//prueba de removeAll (minus)
		System.out.println("\nremoveAll");
		System.out.println("Colección original\n\t" + coleccionClientes);
		System.out.println("Colección para quitar de la original \n\t" + colec2);
		if(coleccionClientes.removeAll(colec2))
			System.out.println("Colección original sin elementos \n\t" + coleccionClientes);
		if(coleccionClientes.removeAll(colec2))//no se ejecuta porque ya no hay repetidos
			System.out.println("Colección original sin elementos \n\t" + coleccionClientes);
		coleccionClientes.add(new Cliente("2222", "carla", "2006-08-04"));
		coleccionClientes.add(new Cliente("2222", "ines", "2004-12-08"));
		System.out.println("Colección original sin elementos \n\t" + coleccionClientes);

		if(coleccionClientes.removeAll(colec2))//solo elimina los dos 222, osea a carla y a ines
			System.out.println("Colección original sin elementos \n\t" + coleccionClientes);
		
		//prueba de retainAll (intersec)
		System.out.println("\nretainAll");
		coleccionClientes.add(new Cliente("2222", "carla", "2006-08-04"));
		System.out.println("Colección original\n\t" + coleccionClientes);
		System.out.println("Colección para quitar de la original \n\t" + colec2);
		if(coleccionClientes.retainAll(colec2))
			System.out.println("Colección original sin elementos \n\t" + coleccionClientes);

		//sacar un array Object de una colección
		System.out.println("\ntoArray sin tipo");
		Object[] arrObjCliente = colec2.toArray();
		for(Object valorCliente:arrObjCliente)
			System.out.print(valorCliente +" ");
		System.out.println();
		
		//sacar un array del tipo de una colección
		System.out.println("\ntoArray con tipo");
		Cliente[] arrCliente = colec2.toArray(new Cliente[0]);
		for(Cliente valorCliente:arrCliente)
				System.out.print(valorCliente +" ");
		System.out.println();
		
		//sacar una lista de un array
		System.out.println("\nasList");
		Cliente[] arrCliente2 = {new Cliente("2222", "carla", "2006-08-04"),new Cliente("1234", "raul", "2000-01-01")};
		coleccionClientes = new ArrayList<>();
		coleccionClientes.addAll(Arrays.asList(arrCliente2));
		System.out.println(coleccionClientes);
	}

}
