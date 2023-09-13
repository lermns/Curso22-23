package tema6.ejerciciosPropuestos;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosPropuestos611 {

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
		
		strFrase=strCodificada;
		strCodificada="";
		
		for(int intIndice=0;intIndice<strFrase.length();intIndice++)
			strCodificada+=descodificar("eikmpqrstuv".toCharArray(),"pviumterkqs".toCharArray(),strFrase.charAt(intIndice));
		System.out.println("Frase vuelta a descodificar " + strCodificada);
	}
	
	private static char codificar(char[] charArray, char[] charArray2, char chrCaracter) {
		char chrDevolver=chrCaracter;
		int intPosicion=Arrays.binarySearch(charArray, chrCaracter);
		
		if(intPosicion>=0)
			chrDevolver=charArray2[intPosicion];
			
		return chrDevolver;
	}
	private static char descodificar(char[] charArray, char[] charArray2, char chrCaracter) {
		char chrDevolver=chrCaracter;
		int intPosicion=0;
		
		for(;intPosicion<charArray2.length && charArray2[intPosicion]!=chrCaracter;intPosicion++);

		if(intPosicion<charArray2.length)
			chrDevolver=charArray[intPosicion];
			
		return chrDevolver;
	}
}