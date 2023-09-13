package tema6.ejerciciosResueltos;

import java.util.Scanner;

public class EjerciciosResueltos606 {

	public static void main(String[] args) {
		Scanner scnLeer=new Scanner(System.in);
		String strFrase;
		
		System.out.print("Dame una frase: ");
		strFrase=scnLeer.nextLine();
		scnLeer.close();
		
		for(int intCont=0; intCont<strFrase.length();intCont++)
			System.out.print(sinVocal(strFrase.charAt(intCont)));
		System.out.println();

	}

	private static String sinVocal(char chrCaracter) {
		String strDevolver = "";
		
		if("aeiouáéíóú".indexOf(Character.toLowerCase(chrCaracter))==-1)
			strDevolver=String.valueOf(chrCaracter);
		
		return strDevolver;
	}

}