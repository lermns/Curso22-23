package tema5.resueltos;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioResuelto5 {

	public static void main(String[] args) {
		int[] rlnArrNumeros=rellenaPares(8,50);
		
		//mostramos el array
		System.out.println("Ordenado: " + Arrays.toString(rlnArrNumeros));
		System.out.println("Menor elemento: " + rlnArrNumeros[0]);
		System.out.println("Menor elemento: " + rlnArrNumeros[rlnArrNumeros.length-1]);
	}

	private static int[] rellenaPares(int intLongitud, int intFin) {
		int[] intArray = new int[intLongitud];
		int intPar, intElemento, intIndice=0;
		
		//relleno de la tabla
		for(int intCont=0; intCont<intLongitud; intCont++) {
			intPar=(int)(Math.random()*intFin);
			intArray[intCont]=intPar%2==0?intPar:intPar+1;
		}
		System.out.println("Desordenado: " + Arrays.toString(intArray));
		
		//Busqueda secuencial
/*		System.out.println("Dame un valor a buscar");
		intElemento= new Scanner(System.in).nextInt();
/*		for(intIndice=0; intIndice<intArray.length &&
						 intElemento != intArray[intIndice];intIndice++);
		if(intIndice<intArray.length)
			System.out.println("Encontrado en posición " + intIndice);
		else
			System.out.println("No encontrado");
*/
/*		boolean blnFlag=false;
		for(int intValor:intArray)
			if(intValor==intElemento) {
				blnFlag=true;
				break;
			}
		if(blnFlag)
			System.out.println("Encontrado");
		else
			System.out.println("No encontrado");
*/		
		Arrays.sort(intArray);
		System.out.println("Ordenado: " + Arrays.toString(intArray));
		System.out.println("Dame un valor a buscar");
		intElemento= new Scanner(System.in).nextInt();		

/*		for(intIndice=0; intIndice<intArray.length &&
				 intElemento > intArray[intIndice];intIndice++);
		if(intIndice<intArray.length && intElemento==intArray[intIndice])
			System.out.println("Encontrado en posición " + intIndice);
		else
			System.out.println("No encontrado debe ser insertado en "+ intIndice);
*/
		intIndice=Arrays.binarySearch(intArray, intElemento);
		if(intIndice>=0)
			System.out.println("Encontrado en posición " + intIndice);
		else
			System.out.println("No encontrado debe ser insertado en "+ (-intIndice-1));
		
		return intArray;
	}

}
