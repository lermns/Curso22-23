package tema5;

import java.util.Arrays;

public class EjemploArrayTridimensional {

	public static void main(String[] args) {
		int[][][] intArray = {{{1, 2},{ 3, 4}, { 6, 7}},
							{{8, 9},{10,11}, {12,13}}}; 
		
		for(int[][] intArr1:intArray) {
			for(int[] intArr2:intArr1) {
				for(int intValor:intArr2)
					System.out.print(intValor + "|");
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(intArray));  // mostramos

		System.out.println("longitud del primer array " + intArray.length);
		System.out.println("longitud del segundo array " + intArray[0].length);
		System.out.println("longitud del tercer array " + intArray[0][0].length);

	}

}
