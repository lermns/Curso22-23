package tema9.ejerciciosResueltos.ejercicioResuelto910;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		ComparadorIntDecreciente comparador = new ComparadorIntDecreciente();
		Integer[] intArrNumeros = new Integer[100];
		
		for(int intCont=0; intCont<100; intCont++)
			intArrNumeros[intCont]=(int)(Math.random()*100+1);
		
		System.out.println("Array Inicial: " + Arrays.toString(intArrNumeros));
		Arrays.sort(intArrNumeros, comparador);
		System.out.println("Array Ordenado: " + Arrays.toString(intArrNumeros));
		System.out.println("Posición del elemento con valor 90: " + Arrays.binarySearch(intArrNumeros, 90 , comparador));
	}

}
