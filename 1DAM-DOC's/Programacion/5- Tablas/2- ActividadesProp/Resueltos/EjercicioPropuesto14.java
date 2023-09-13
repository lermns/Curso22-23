package tema5.propuestos;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioPropuesto14 {

	public static void main(String[] args) {
		int[] intArray= new int[0]; //sueldos ordenados
		int intSueldo; //sueldo leido
		int intIndice;//posici�n para insertar el sueldo
		double rlnMediaSueldos=0;//Guarda la suma de los salarios
		Scanner scnLeer = new Scanner(System.in);
		
		System.out.print("Dame el sueldo del siguiente encuestado o pulsa -1 para terminar ");
		intSueldo=scnLeer.nextInt();
		
		while(intSueldo!=-1) {
			rlnMediaSueldos+=intSueldo;
			intIndice=Arrays.binarySearch(intArray, intSueldo);
			if(intIndice<0)
				intIndice=-intIndice-1;
			intArray=Arrays.copyOf(intArray, intArray.length+1);
			System.arraycopy(intArray, intIndice, intArray, intIndice+1, intArray.length-(intIndice+1));
			intArray[intIndice]=intSueldo;
			System.out.print("Dame el sueldo del siguiente encuestado o pulsa -1 para terminar ");
			intSueldo=scnLeer.nextInt();
		}
		
		System.out.println("sueldos ordenados de manera decreciente");
		for(intIndice=intArray.length-1; intIndice>=0; intIndice--)
			System.out.print(" | " + intArray[intIndice]);
		System.out.println(" | ");
		
		System.out.println("\nElemento m�ximo: " + intArray[intArray.length-1] + " elemento m�nimo: " + intArray[0]);
		
		System.out.println("\nMedia de los sueldos " + (rlnMediaSueldos/intArray.length));
	}

}
