package tema5.resueltos;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioResuelto9 {
	public static void main(String[] args) {
		int[] intArray=new int[0]; //puntuaciones de los jugadores
		int intElemento;
		Scanner scnLeer = new Scanner(System.in);
		
		//inserción 5 jugadores
		for(int intCont=1;intCont<=5;intCont++) {
			System.out.print("Dame el " + intCont + "º jugador");
			intElemento = scnLeer.nextInt();
			intArray=insertaOrdenado(intArray,intElemento);
		}
		
		System.out.print("Dame el siguiente jugador de exibición o -1 ");
		intElemento = scnLeer.nextInt();

		while(intElemento!=-1) {
			intArray=insertaOrdenado(intArray,intElemento);
			System.out.print("Dame el siguiente jugador de exibición o -1 ");
			intElemento = scnLeer.nextInt();
		}
		scnLeer.close();
		//mostramos las puntuaciones
		System.out.println("Puntuaciones " + Arrays.toString(intArray));
		

	}

	private static int[] insertaOrdenado(int[] intArray, int intValor) {
		int intIndiceInsercion=Arrays.binarySearch(intArray, intValor);
		
		//si no lo encuentra se pone el índice correcto
		if(intIndiceInsercion<0)
			intIndiceInsercion=-intIndiceInsercion-1;
		intArray=Arrays.copyOf(intArray, intArray.length+1);
		for(int intCont=intArray.length-1; intCont>intIndiceInsercion; intCont--)
			intArray[intCont]=intArray[intCont-1];
		intArray[intIndiceInsercion]=intValor;
		return intArray;
	}


}
