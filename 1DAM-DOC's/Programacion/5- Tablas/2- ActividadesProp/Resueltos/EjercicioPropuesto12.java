package tema5.propuestos;

import java.util.Arrays;

public class EjercicioPropuesto12 {

	public static void main(String[] args) {
		int[] intArray= {5,12,27,35,44};
		
		System.out.println("Tabla inicial " + Arrays.toString(intArray));
		desordenar (intArray);
		System.out.println("Tabla desordenada " + Arrays.toString(intArray));
	}

	private static void desordenar(int[] intArray) {
		//voy a cambiar todos los elementos de orden
		for(int intIndice=0, intAleatorio, intAux; intIndice<intArray.length; intIndice++) {
			intAleatorio=(int) (Math.random()*intArray.length);//posici�n con la que voy a cambiar
			intAux=intArray[intIndice];
			intArray[intIndice]=intArray[intAleatorio];
			intArray[intAleatorio]=intAux;
		}
		
	}

	
}
