package tema6.ejerciciosResueltos;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosResueltos612 {

	public static void main(String[] args) {
		Scanner scnLeer=new Scanner(System.in);
		String strFrase1,strFrase2;//frases para ver si son anagrama
		char[] chrArrPalabra1,chrArrPalabra2;
		
		System.out.print("Dame una palabra para ver si es anagrama: ");
		strFrase1=scnLeer.nextLine().toLowerCase();
		System.out.print("Dame la segunda palabra para ver si es anagrama: ");
		strFrase2=scnLeer.nextLine().toLowerCase();
		scnLeer.close();
		
		chrArrPalabra1=strFrase1.toCharArray();
		Arrays.sort(chrArrPalabra1);
		chrArrPalabra2=strFrase2.toCharArray();
		Arrays.sort(chrArrPalabra2);

		if(Arrays.equals(chrArrPalabra1,chrArrPalabra2))
			System.out.println("Son palíndromas");
		else
			System.out.println("No son palíndromas");
			
	}

}