package tema5.resueltos;

import java.util.Arrays;

public class EjemploCopiaArray {

	public static void main(String[] args) {
		int[] intArrPrimero= {1,2,8,4,5,6};
		int intLongitud=8;
		int[] intArrSegundo=new int[intLongitud];
		
		for(int intIndice=0; intIndice<intArrPrimero.length && intIndice<intLongitud; intIndice++)
			intArrSegundo[intIndice]=intArrPrimero[intIndice];
		
		System.out.println("Array primero: " + Arrays.toString(intArrPrimero));
		System.out.println("Array segundo: " + Arrays.toString(intArrSegundo));

	}

}
