package tema6.ejerciciosPropuestos;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosPropuestos620 {

	public static void main(String[] args) {
		String strTexto;//texto con las palabras
		String[] strArrPalabras= {};//palabras del texto
		int intPos;
		Scanner scnLeer=new Scanner(System.in);
		
		System.out.print("Dame el texto: ");
		strTexto = scnLeer.nextLine().strip();
		scnLeer.close();
		
		//paso de n letras en n letras cortando la palabra
		intPos = strTexto.indexOf(" ");
		while(intPos!=-1) {
			strArrPalabras=insertar(strArrPalabras,strTexto.substring(0,intPos));//meto la frase en el array
			strTexto=strTexto.substring(intPos).stripLeading();
			intPos = strTexto.indexOf(" ");
		}
		if(!strTexto.isEmpty())
			strArrPalabras=insertar(strArrPalabras,strTexto);
		
		for(String strValor:strArrPalabras)
				System.out.println(strValor);
	}

	/*insertar en array ordenado, como en la chuleta*/
	private static String[] insertar(String[] strArrPalabras, String strPalabra) {
		int intIndiceInsercion;
		
		intIndiceInsercion=Arrays.binarySearch(strArrPalabras, strPalabra);
		if(intIndiceInsercion<0) {
			intIndiceInsercion=-intIndiceInsercion-1;
			strArrPalabras =Arrays.copyOf(strArrPalabras, strArrPalabras.length+1);
			System.arraycopy(strArrPalabras, intIndiceInsercion, strArrPalabras, intIndiceInsercion+1, strArrPalabras.length-(intIndiceInsercion+1));
			strArrPalabras [intIndiceInsercion]=strPalabra;
		}

		return strArrPalabras;
	}
	
	
}