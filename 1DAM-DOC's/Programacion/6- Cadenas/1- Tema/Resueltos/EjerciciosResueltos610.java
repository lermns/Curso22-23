package tema6.ejerciciosResueltos;

import java.util.Scanner;

public class EjerciciosResueltos610 {

	public static void main(String[] args) {
		Scanner scnLeer=new Scanner(System.in);
		String strFrase;//frase para comprobar si es palíndroma
		
		System.out.print("Dame una frase para ver si es palíndroma: ");
		strFrase=scnLeer.nextLine();
		scnLeer.close();
		
		strFrase=strFrase.replace(" ","");//quito espacios en blanco
		
		if(strFrase.equalsIgnoreCase(reves(strFrase)))
			System.out.println("La frase palíndroma");
		else
			System.out.println("La frase no es palíndroma");
	}
	
	private static String reves(String strFrase) {
		String strDevolver = "";
		
		for(int intCont=strFrase.length()-1;intCont>=0;intCont--)
			strDevolver+=strFrase.charAt(intCont);
		
		return strDevolver;
	}
}