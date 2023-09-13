package tema10.ejerciciosPropuestos.ejercicioPropuesto10_18;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] intArrEnteros = leerEnteros("Esto 23 es una 44 prueba para 2 ! ver 12 enteros");
		
		System.out.println(Arrays.toString(intArrEnteros));

	}

	private static int[] leerEnteros(String strCadena) {
		int[] intArrEnteros = new int[0];
		int intNumero;
		Scanner scnLeer = new Scanner(strCadena);
		String strValor;
		while(scnLeer.hasNext()) {
		try {	
				intNumero= Integer.parseInt(scnLeer.next());
				intArrEnteros = Arrays.copyOf(intArrEnteros, intArrEnteros.length+1);
				intArrEnteros[intArrEnteros.length-1] = intNumero;
			}catch(Exception e) {}
		}
		scnLeer.close();
		return intArrEnteros;
	}

}
