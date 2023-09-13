package tema5.resueltos;

import java.util.Arrays;

public class EjercicioResuelto7 {
	public static int[] sinRepetidos(int[] intArrConRepes) {
		int[] intArrSinRepes = new int[0];
		int[] intArrAux = Arrays.copyOf(intArrConRepes, intArrConRepes.length);
		
		Arrays.sort(intArrAux);
		
		for(int intValor:intArrAux) 
			if(Arrays.binarySearch(intArrSinRepes, intValor)<0) {
				intArrSinRepes=Arrays.copyOf(intArrSinRepes, (intArrSinRepes.length+1));
				intArrSinRepes[intArrSinRepes.length-1]=intValor;
			}
		return intArrSinRepes;
	}

	public static void main(String[] args) {
		int[] intArray= {1,1,1,1,2,1,1,1,1};
		
		//mostramos el array
		System.out.println(Arrays.toString(sinRepetidos(intArray)));
		
	}


}
