package tema5;

import java.util.Arrays;

public class EjemploBorrarElementoArrayDesordenado {

	public static void main(String[] args) {
		int[] intArray = {1,23,8,12};
		int intElementoBorrar=3;
		int intIndiceBorrado=buscarArrDesor(intArray,intElementoBorrar);
		
		if (intIndiceBorrado != -1) {  // encontrado
			intArray [intIndiceBorrado] = intArray [intArray.length - 1]; // copia el último en indiceBorrado
			intArray = Arrays.copyOf (intArray, intArray.length - 1);  // disminuimos la longitud de t
			System.out.println(Arrays.toString(intArray));  // mostramos
		} else 
			System.out.println("Underflow el elemento no existe");
		
	}

	private static int buscarArrDesor(int[] intArr, int intElemento) {
		int intIndice;
		
		for(intIndice=0; intIndice<intArr.length &&
							intArr[intIndice]!=intElemento; intIndice++);
		
		return intIndice==intArr.length?-1:intIndice;
	}

}
