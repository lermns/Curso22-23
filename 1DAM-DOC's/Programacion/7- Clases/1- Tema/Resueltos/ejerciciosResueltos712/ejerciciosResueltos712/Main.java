package tema7.ejerciciosResueltos.ejerciciosResueltos712;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Lista lista = new Lista();
		int[] intArray = {7,4,13,25};
		Lista lista2 = new Lista();
		int[] intArray2 = {35,43,57,89};
		
		lista.copiarFinal(intArray);
		System.out.println("Lista l1 " + lista.toString() );

		lista2.copiarFinal(intArray2);
		System.out.println("Lista l2 " + lista2.toString() );

		System.out.println("Lista concatenada l1+l2 " + Lista.concatena(lista, lista2).toString() );
		System.out.println("Imprimo una posición que existe " + lista.elemento(2));
		System.out.println("Imprimo una posición que no existe " + lista.elemento(12));
	}

}
