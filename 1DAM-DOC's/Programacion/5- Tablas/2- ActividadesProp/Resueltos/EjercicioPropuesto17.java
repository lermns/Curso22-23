package w;

import java.util.Arrays;

public class EjercicioPropuesto17 {
	public static int [] suma(int intArray[], int intNumElementos) {
		int[] intArrDevolver;
		
		//si hay por lo menos los elementos indicados,hago algo, sino devuelvo el array vacío
		if(intArray.length>=intNumElementos) {
			intArrDevolver=new int[intArray.length-(intNumElementos-1)];
			for(int intIndice=0; intIndice<intArrDevolver.length;intIndice++)//meto elementos en todas las posiciones del array
				for(int intElementos=0; intElementos<intNumElementos;intElementos++)//paso por los n elementos para hacer la suma
				intArrDevolver[intIndice]+=intArray[intIndice+intElementos];
		}else
			intArrDevolver=new int[0];
		
		return intArrDevolver;
	}
	public static void main(String[] args) {
		int[] intArray= {10, 1, 5, 8, 9, 2};
		
		System.out.println(Arrays.toString(suma(intArray,3)));
	}

}
