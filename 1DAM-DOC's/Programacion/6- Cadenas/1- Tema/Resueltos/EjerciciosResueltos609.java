package tema6.ejerciciosResueltos;

import java.util.Scanner;

public class EjerciciosResueltos609 {

	public static void main(String[] args) {
		Scanner scnLeer=new Scanner(System.in);
		String strFrase=""; //inicialmente está vacía
		String strPalabra; //palabras que voy leyendo
		
		System.out.print("Dame una palabra para unir a la frase o escirbe fin: ");
		strPalabra=scnLeer.next();
		
		while(!strPalabra.toLowerCase().equals("fin")) {
			strFrase+= " " + strPalabra;
			System.out.print("Dame una palabra para unir a la frase o escirbe fin: ");
			strPalabra=scnLeer.next();
		}
		scnLeer.close();
		
		System.out.println("La frase completa es: " + strFrase);
	}
}