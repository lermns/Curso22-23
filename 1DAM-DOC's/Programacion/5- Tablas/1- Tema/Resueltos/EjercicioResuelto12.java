package tema5.resueltos;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioResuelto12 {

	public static void main(String[] args) {
		int[][] intArray = new int[5][5];//tabla de 5x5
		
		//paso dígito por dígito mirando si son iguales que los del array
		for(int intIndiceX=0; intIndiceX<intArray.length; intIndiceX++) 
			for(int intIndiceY=0; intIndiceY<intArray[0].length; intIndiceY++) 
				intArray[intIndiceX][intIndiceY]=10*intIndiceX+intIndiceY;
				
		System.out.println(Arrays.deepToString(intArray));
		
		//imprimo con for
		for(int intIndiceX=0; intIndiceX<intArray.length; intIndiceX++) {
			for(int intIndiceY=0; intIndiceY<intArray[0].length; intIndiceY++) 
				System.out.print("\t" + intArray[intIndiceX][intIndiceY]);
			System.out.println();
		}
	}
}
