package tema2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		byte btyNum1, btyNum2;//numeros leidos por el usuario
		Scanner scnLeer = new Scanner(System.in);
		

		System.out.println("Dame un número 1: ");
		btyNum1 = scnLeer.nextByte();
		System.out.println("Dame un número 2: ");
		btyNum2 = scnLeer.nextByte();
		
		if(btyNum1>btyNum2)
			System.out.println(btyNum1 + " es mayor que " + btyNum2);
		else
			System.out.println(btyNum2 + " es mayor que " + btyNum1);
	}

}
