package tema10.ejerciciosPropuestos.ejercicioPropuesto10_18;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] intArrEnteros = leerEnteros("Esto 23es una44prueba para 2! ver 12 enteros");
		
		System.out.println(Arrays.toString(intArrEnteros));

	}

	private static int[] leerEnteros(String strCadena) {
		int[] intArrEnteros = new int[0];
		String strNumero = "";
		
		for(int intPos=0; intPos<strCadena.length(); intPos++) {
			while(Character.isDigit(strCadena.charAt(intPos))){
					strNumero += strCadena.charAt(intPos);
					intPos++;
			}
			if(!strNumero.equals("")) {
				intArrEnteros = Arrays.copyOf(intArrEnteros, intArrEnteros.length+1);
				intArrEnteros[intArrEnteros.length-1] = Integer.parseInt(strNumero);
				strNumero="";
			}
		}
		return intArrEnteros;
	}

}
