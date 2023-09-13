package tema5;

import java.util.Arrays;

public class EjemploInsertarOrdenado2 {

	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 6, 7, 8}; 
		int intNuevo = 5; 
		int intIndiceInsercion = Arrays.binarySearch(intArray, intNuevo);
		// si indiceInsercion >= 0, el nuevo elemento (que está repetido) se inserta en 
		// en el lugar en que ya estaba, desplazando al original. Si por el contrario:
		if (intIndiceInsercion < 0)  // si no lo encuentra
			 // calcula donde debería estar
			intIndiceInsercion = -intIndiceInsercion - 1;
		
		intArray=Arrays.copyOf(intArray, intArray.length+1);
		// copiamos desplazados los elementos tras el “hueco”
		System.arraycopy(intArray, intIndiceInsercion, intArray, intIndiceInsercion + 1, (intArray.length - (intIndiceInsercion+1))); 
/*		for(int intCont=intArray.length-1; intCont>intIndiceInsercion; intCont--)
			intArray[intCont]=intArray[intCont-1];
*/		intArray[ intIndiceInsercion ] = intNuevo;  // asignamos el nuevo elemento
		System.out.println(Arrays.toString(intArray));  // mostramos


	}

}
