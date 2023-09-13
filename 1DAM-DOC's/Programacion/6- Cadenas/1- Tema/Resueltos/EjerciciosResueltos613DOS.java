package tema6.ejerciciosResueltos;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosResueltos613DOS {

	public static void main(String[] args) {
		Scanner scnLeer=new Scanner(System.in);
		String strFrase;//frases para ver el número de veces que aparece una letra
		char[] chrArrLetras = {};
		int[] intArrRepeticiones = {};
		
		System.out.print("Dame la frase: ");
		strFrase=scnLeer.nextLine().toLowerCase();
		scnLeer.close();
		
		//paso por cada letra
		for(int intIndice=0,intPos; intIndice<strFrase.length(); intIndice++) {
//			if((strFrase.charAt(intIndice))!=' ') {
				intPos=Arrays.binarySearch(chrArrLetras, strFrase.charAt(intIndice));//miro si ya está insertado
				if(intPos>=0) //compruebo si ya se encuentra metida
					intArrRepeticiones[intPos]++;
				else {//si no existe lo inserto
					intPos=-intPos-1;
					chrArrLetras=Arrays.copyOf(chrArrLetras, chrArrLetras.length+1);
					intArrRepeticiones=Arrays.copyOf(intArrRepeticiones, intArrRepeticiones.length+1);
					if(chrArrLetras.length-1>intPos) {//si no va a quedar de último, desplaza a los de su derecha
						System.arraycopy(chrArrLetras, intPos, chrArrLetras, intPos+1, chrArrLetras.length-(intPos+1));
						System.arraycopy(intArrRepeticiones, intPos, intArrRepeticiones, intPos+1, intArrRepeticiones.length-(intPos+1));
					}
					chrArrLetras[intPos]=strFrase.charAt(intIndice);
					intArrRepeticiones[intPos]=1;
				}
//			}
		}
		
		for(int intIndice=0; intIndice<chrArrLetras.length; intIndice++) {
			System.out.print(chrArrLetras[intIndice] + ":\t" + intArrRepeticiones[intIndice] + "\t");
			if(intArrRepeticiones[intIndice]>1)
				System.out.println("veces");
			else
				System.out.println("vez");
		}
	}

}