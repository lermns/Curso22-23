package tema2;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		byte btyNum, btyAbsoluto;//número para sacar el absoluto y su valor absoluto
		Scanner scnLeer = new Scanner(System.in);
		
		System.out.print("Dame un número: ");
		btyNum = scnLeer.nextByte();
		scnLeer.close();

		btyAbsoluto = btyNum<0?(byte)-btyNum:btyNum;
		System.out.print("El valor absoluto del número: " + btyNum + " es: " + btyAbsoluto);

	}

}
