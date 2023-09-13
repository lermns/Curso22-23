package tema5.propuestos;

import java.util.Arrays;

public class EjercicioPropuesto13 {

	public static void main(String[] args) {
		int[] intArray= {5,12,27,35,44};
				
		System.out.println("Tabla inicial " + Arrays.toString(intArray));
	
		System.out.println("Tabla desordenada " + Arrays.toString(desordenar (intArray)));
	}

	private static int[] desordenar(int[] intArray) {
		int[] intArrayAux=Arrays.copyOf(intArray, intArray.length);
		
		//voy a cambiar todos los elementos de orden
		for(int intIndice=0, intAleatorio, intAux; intIndice<intArrayAux.length; intIndice++) {
			intAleatorio=(int) (Math.random()*intArrayAux.length);//posici�n con la que voy a cambiar
			intAux=intArrayAux[intIndice];
			intArrayAux[intIndice]=intArrayAux[intAleatorio];
			intArrayAux[intAleatorio]=intAux;
		}
		
		return intArrayAux;
		
	}

}
