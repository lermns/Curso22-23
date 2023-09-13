package tema4;

import java.util.Scanner;

public class EjercicioResuelto5 {

	public static boolean esVocal(char chrCaracter) {
		return chrCaracter=='a' || chrCaracter=='e' ||chrCaracter=='i' ||chrCaracter=='o' ||chrCaracter=='u' ||
			   chrCaracter=='A' || chrCaracter=='E' ||chrCaracter=='I' ||chrCaracter=='O' ||chrCaracter=='U';
	}
	
	public static void main(String[] args) {
		char chrLetra;
		
		System.out.println("Dame un caracter");
		chrLetra=new Scanner(System.in).next().charAt(0);		
		System.out.println("Es una vocal: "+ esVocal(chrLetra));
	}

}
