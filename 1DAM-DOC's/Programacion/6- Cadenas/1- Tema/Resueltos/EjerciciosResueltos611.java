package tema6.ejerciciosResueltos;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosResueltos611 {

	public static void main(String[] args) {
		Scanner scnLeer=new Scanner(System.in);
		String strFrase;//frase para codifica
		String strCodificada="";//frase codificada
		
		System.out.print("Dame una frase para codificar: ");
		strFrase=scnLeer.nextLine().toLowerCase();
		scnLeer.close();
		
		for(int intIndice=0;intIndice<strFrase.length();intIndice++)
			strCodificada+=codificar("eikmpqrstuv".toCharArray(),"pviumterkqs".toCharArray(),strFrase.charAt(intIndice));
		
		System.out.println("Frase codificada " + strCodificada);
	}
	
	private static char codificar(char[] charArray, char[] charArray2, char chrCaracter) {
		char chrDevolver=chrCaracter;
		int intPosicion=Arrays.binarySearch(charArray, chrCaracter);
		
		if(intPosicion>=0)
			chrDevolver=charArray2[intPosicion];
			
		return chrDevolver;
	}

}