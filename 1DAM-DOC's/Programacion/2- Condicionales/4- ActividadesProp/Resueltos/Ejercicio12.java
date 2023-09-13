package tema2;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		int intDNI;//DNI dado por el usuario
		byte bytLetra; //número de la letra
		Scanner scnLeer = new Scanner(System.in);
		

		System.out.print("Dame el DNI ");
		intDNI = scnLeer.nextInt();
		bytLetra = (byte) (intDNI % 23);
		
		switch(bytLetra) {
			case 0 -> System.out.print("T");
			case 1 -> System.out.print("R");
			case 2 -> System.out.print("W");
			case 3 -> System.out.print("A");
			case 4 -> System.out.print("G");
			case 5 -> System.out.print("M");
			case 6 -> System.out.print("Y");
			case 7 -> System.out.print("F");
			case 8 -> System.out.print("P");
			case 9 -> System.out.print("D");
			case 10 -> System.out.print("X");
			case 11 -> System.out.print("B");
			case 12 -> System.out.print("N");
			case 13 -> System.out.print("J");
			case 14 -> System.out.print("Z");
			case 15 -> System.out.print("S");
			case 16 -> System.out.print("Q");
			case 17 -> System.out.print("V");
			case 18 -> System.out.print("H");
			case 19 -> System.out.print("L");
			case 20 -> System.out.print("C");
			case 21 -> System.out.print("K");
			case 22 -> System.out.print("E");
		}

		
	}

}
