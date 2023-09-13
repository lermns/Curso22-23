package tema5.propuestos;

import java.util.Arrays;

public class EjercicioPropuesto11 {

	public static void main(String[] args) {
		int[] intArray= {5,32,5,27,5,87,44};
		int intClaveBuscada=5;
		
		System.out.println("Posiciones en donde se encuentra " + intClaveBuscada + " " + Arrays.toString(buscarTodos (intArray, intClaveBuscada)));
	}

	private static int[] buscarTodos(int[] intArray, int intClave) {
		int[] intArrIndices= new int[0];
		
		//pasamos por todos los elementos por se un array desordenado
		for(int intIndice=0; intIndice<intArray.length; intIndice++)
			if(intArray[intIndice]==intClave) {
				intArrIndices=Arrays.copyOf(intArrIndices, intArrIndices.length+1);
				intArrIndices[intArrIndices.length-1]=intIndice;
			}
		return intArrIndices;
	}

}
