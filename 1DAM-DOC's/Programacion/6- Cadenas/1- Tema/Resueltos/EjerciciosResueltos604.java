package tema6.ejerciciosResueltos;

import java.util.Scanner;

public class EjerciciosResueltos604 {

	public static void main(String[] args) {
		Scanner scnLeer=new Scanner(System.in);
		String strFrase;
		int intBlancos=0;
		
		System.out.print("Dame una frase: ");
		strFrase=scnLeer.nextLine();
		scnLeer.close();
		
		for(int intCont=0; intCont<strFrase.length();intCont++)
			if(strFrase.charAt(intCont)==' ')
				intBlancos++;
		
		System.out.println("La frase tiene " + intBlancos + " espacios en blanco");
	}

}
