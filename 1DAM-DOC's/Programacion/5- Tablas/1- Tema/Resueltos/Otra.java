package tema5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Otra {

	public static void main(String[] args) {
		int[] intArray= {1,2,3,4,5,6};
		int[] intArray2= new int[4];
		
		System.out.println("Posicion de memoria de intArray: " + intArray);
		System.out.println("Posicion de memoria de intArray2: " + intArray2);
		System.out.println("Elementos de intArray: " + Arrays.toString(intArray));
		System.out.println("Elementos de intArray2: " + Arrays.toString(intArray2));
		
		//relleno de intArray de 8
		System.out.println("\nRellenamos intArray2 de 8: ");
		Arrays.fill(intArray2, 8);
				System.out.println("Elementos de intArray2: " + Arrays.toString(intArray2));

		//relleno de intArray de 7 desde la posición 1 hasta la 2
		System.out.println("\nRellenamos intArray2 de 7 desde la posición 1 hasta la 2: ");
		Arrays.fill(intArray2, 1, 3, 7);
		System.out.println("Elementos de intArray2: " + Arrays.toString(intArray2));
		
		//relleno de intArray de 3 desde la posición 2 hasta el final
		System.out.println("\nRellenamos intArray2 de 3 desde la posición 2 hasta el final: ");
		Arrays.fill(intArray2, 2, intArray2.length, 3);
		System.out.println("Elementos de intArray2: " + Arrays.toString(intArray2));
				
		
		//recorrido de intArray
		System.out.println("\nElementos de intArray: ");
		for(int intCont=0, intValor; intCont<intArray.length;intCont++) {
			intValor=intArray[intCont];
			System.out.print(intValor + " | ");
		}
		
		//recorrido de intArray
		System.out.println("\n\nElementos de intArray2: ");
		for(int intValor:intArray2)
			System.out.print(intValor + " | ");
		
		//igualo los arrays
		intArray2=intArray;
		System.out.println("\n\nElementos de intArray2 tras igualar con intArray: " + Arrays.toString(intArray2));
		
		//cambio valor en intArray2 y se ve en intArray
		intArray2[3]=99;
		System.out.println("\n\nElementos de intArray tras cambiar un valor con intArray2: " + Arrays.toString(intArray));
		
		//cambia la última posición
		cambiaUltimaPosicion(intArray);
		System.out.println("\n\nElementos de intArray tras cambiar ultima posición: " + Arrays.toString(intArray));

	}
	
	public static void cambiaUltimaPosicion(int[] intArr) {
		intArr[intArr.length-1]=33;
	}

}
