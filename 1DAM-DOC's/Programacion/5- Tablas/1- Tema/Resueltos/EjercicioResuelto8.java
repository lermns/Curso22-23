package tema5.resueltos;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioResuelto8 {
	public static void main(String[] args) {
		int[] intArray=new int[0];
		int[] intArrPares=new int[0];
		int[] intArrImpares=new int[0];
		int intElemento=0;
		Scanner scnLeer = new Scanner(System.in);
		
		System.out.print("Dame el siguiente elemento o -1 ");
		intElemento = scnLeer.nextInt();

		for(int intCont=0;intElemento!=-1;intCont++) {
			intArray=Arrays.copyOf(intArray, intArray.length+1);
			intArray[intCont]=intElemento;
			System.out.print("Dame el siguiente elemento o -1 ");
			intElemento = scnLeer.nextInt();
		}
/*		for(int intCont=0;intElemento!=-1;intCont++) {
			System.out.print("Dame el siguiente elemento o -1 ");
			intElemento = scnLeer.nextInt();
			intArray=Arrays.copyOf(intArray, intArray.length+1);
			intArray[intCont]=intElemento;
		}
		intArray=Arrays.copyOf(intArray, intArray.length-1);
*/
		scnLeer.close();
		//mostramos el array
		System.out.println("Array ogiginal " + Arrays.toString(intArray));
		Arrays.sort(intArray);
		for(int intValor:intArray) {
			if(intValor%2==0)
				intArrPares=rellena(intArrPares,intValor);
			else
				intArrImpares=rellena(intArrImpares,intValor);
		}
		System.out.println("Array pares " + Arrays.toString(intArrPares));
		System.out.println("Array impares " + Arrays.toString(intArrImpares));

	}

	private static int[] rellena(int[] intArray, int intValor) {
		intArray=Arrays.copyOf(intArray, intArray.length+1);
		intArray[intArray.length-1]=intValor;
		return intArray;
	}


}
