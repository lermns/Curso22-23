package tema6.ejerciciosResueltos;

import java.util.Scanner;

public class EjerciciosResueltos605 {

	public static void main(String[] args) {
		Scanner scnLeer=new Scanner(System.in);
		String strFrase;
		
		System.out.print("Dame una frase: ");
		strFrase=scnLeer.nextLine();
		scnLeer.close();
		
		System.out.print("La frase del revés será: " + reves(strFrase));

	}

	private static String reves(String strFrase) {
		String strDevolver = "";
		
		for(int intCont=0; intCont<strFrase.length();intCont++)
			strDevolver=strFrase.charAt(intCont)+strDevolver;
/*		for(int intCont=strFrase.length()-1;intCont>=0;intCont--)
			strDevolver+=strFrase.charAt(intCont);
*/		
		return strDevolver;
	}

}
