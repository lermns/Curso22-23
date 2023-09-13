package tema6.ejerciciosResueltos;

import java.util.Scanner;

public class EjerciciosResueltos614 {

	public static void main(String[] args) {
		Scanner scnLeer=new Scanner(System.in);
		String strPalabra;//frases para ver el n�mero de veces que aparece una letra
		String strAdivinar;
		
		do{
			System.out.print("Dame la palabra a adivinar: ");
			strPalabra=scnLeer.next().toLowerCase();
		}while(strPalabra.isEmpty());
		
		System.out.println("La palabra será similar a " + anagrama(strPalabra));
		do{
			System.out.print("Dame una palabra para adivinar la secreta: ");
			strAdivinar=scnLeer.next().toLowerCase();
		}while(!strAdivinar.equals(strPalabra));
		scnLeer.close();
		
		System.out.println("Feliciades, adivinaste la palabra");
	}

	private static String anagrama(String strPalabra) {
		char[] chrArrDevolver=strPalabra.toCharArray();
		char chrAux;
		
		for(int intIndice=0, intCambio; intIndice<chrArrDevolver.length; intIndice++) {
			chrAux=chrArrDevolver[intIndice];
			intCambio=(int) (Math.random()*chrArrDevolver.length);
			chrArrDevolver[intIndice]=chrArrDevolver[intCambio];
			chrArrDevolver[intCambio]=chrAux;
		}
			
		return String.valueOf(chrArrDevolver);
	}

}