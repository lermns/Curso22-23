package tema5.resueltos;

import java.util.Arrays;

public class EjercicioResuelto10 {

	public static void main(String[] args) {
		int[] intArray= {5,32,14,27,60,87,44};
		int intLimiteEliminar=40;
		
		System.out.println("Array original: " + Arrays.toString(intArray));
		System.out.println("Array sin mayores: " + Arrays.toString(eliminarMayores(intArray,intLimiteEliminar)));
	}

	private static int[] eliminarMayores(int[] intArray, int intValor) {
		// como es un array desordenado tengo que recorrerlo entero
		for(int intIndice=0; intIndice<intArray.length;)
			if(intArray[intIndice]>intValor) {//si es mayor lo elimino
				intArray[intIndice]=intArray[intArray.length-1];//pongo el último elemento en esa posición
				intArray=Arrays.copyOf(intArray, intArray.length-1);//quito el elemento mayor
			}else
				intIndice++;//paso al elemento siguiente
			
		return intArray;
	}

}
