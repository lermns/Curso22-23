package tema6.ejerciciosResueltos;

import java.util.Scanner;

public class EjerciciosResueltos602 {

	public static void main(String[] args) {
		Scanner scnLeer=new Scanner(System.in);
		String strFrase1;
		String strFrase2;
		
		System.out.print("Dame la primera frase: ");
		strFrase1=scnLeer.nextLine();
		System.out.print("Dame la segunda frase: ");
		strFrase2=scnLeer.nextLine();
		scnLeer.close();
		
		if(strFrase1.length()==strFrase2.length())
			System.out.println("Las frases tienen la misma longitud");
		else if(strFrase1.length()>strFrase2.length())
					System.out.println("La frase 1 tienen mayor longitud");
			 else 
					System.out.println("La frase 2 tienen mayor longitud");
		

	}

}
