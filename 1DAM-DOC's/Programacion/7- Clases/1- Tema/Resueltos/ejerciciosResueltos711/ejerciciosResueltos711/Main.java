package tema7.ejerciciosResueltos.ejerciciosResueltos711;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Lista lista = new Lista();
		Integer[] intArray = {7,4,13,25};
		
		System.out.println("Lista vac�a " + lista.toString() );
		lista.insertarFinal(5);
		System.out.println("Lista insertado al final 5 " + lista.toString() );
		lista.copiarFinal(intArray);
		System.out.println("Copiando al final array " + Arrays.toString(intArray) + " Lista: " + lista.toString() );
		lista.insertarFinal(29);
		lista.insertarPrincipio(6);
		lista.insertarPosicion(44, 4);
		System.out.println("Lista insertado al final 29, al principio 6 y en la posici�n 4 el 44 " + lista.toString() );
		System.out.println("Posici�n del elemento 13 en la lista: " + lista.buscar(13));
		System.out.println("Elemento 6 de la lista: " + lista.elemento(6));
	}

}
