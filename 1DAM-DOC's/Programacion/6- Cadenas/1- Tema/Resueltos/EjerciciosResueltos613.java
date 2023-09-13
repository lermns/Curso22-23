package tema6.ejerciciosResueltos;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosResueltos613 {

	public static void main(String[] args) {
		Scanner scnLeer=new Scanner(System.in);
		String strFrase;//frases para ver el número de veces que aparece una letra
		char[] chrArrLetras = {};
		int[] intArrRepeticiones = {};
//		char[] chrArrAux;
		System.out.print("Dame la frase: ");
		strFrase=scnLeer.nextLine().toLowerCase();
		scnLeer.close();
/*		chrArrAux=strFrase.toCharArray();
		Arrays.sort(chrArrAux);
		strFrase=String.valueOf(chrArrAux).strip();
*/		
		for(int intIndice=0; intIndice<strFrase.length(); intIndice++)
			if(!encuentra(strFrase.charAt(intIndice),chrArrLetras,intArrRepeticiones)) {
				chrArrLetras=Arrays.copyOf(chrArrLetras, chrArrLetras.length+1);
				chrArrLetras[chrArrLetras.length-1]=strFrase.charAt(intIndice);
				intArrRepeticiones=Arrays.copyOf(intArrRepeticiones,intArrRepeticiones.length+1);
				intArrRepeticiones[intArrRepeticiones.length-1]=1;
			}
		
		for(int intIndice=0; intIndice<chrArrLetras.length; intIndice++) {
			System.out.print(chrArrLetras[intIndice] + ":\t" + intArrRepeticiones[intIndice] + "\t");
			if(intArrRepeticiones[intIndice]>1)
				System.out.println("veces");
			else
				System.out.println("vez");
		}
	}

	private static boolean encuentra(char chrCaracter, char[] chrArrLetras, int[] intArrRepeticiones) {
		int intIndice=0;
		boolean blnDevuelve=false;
		
		for(;intIndice<chrArrLetras.length && chrArrLetras[intIndice]!=chrCaracter; intIndice++);
		
		if(intIndice<chrArrLetras.length) {
			intArrRepeticiones[intIndice]+=1;
			blnDevuelve=true;
		}
		return blnDevuelve;
	}

}