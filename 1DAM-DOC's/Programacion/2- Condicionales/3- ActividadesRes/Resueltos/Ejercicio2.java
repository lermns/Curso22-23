package tema2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		byte btyNum1, btyNum2;//numeros leidos por el usuario
		Scanner scnLeer = new Scanner(System.in);
		

		System.out.println("Dame un número 1: ");
		btyNum1 = scnLeer.nextByte();
		System.out.println("Dame un número 2: ");
		btyNum2 = scnLeer.nextByte();
		if(btyNum1==btyNum2)
			System.out.println("Son iguales");
		else
			System.out.println("Son distintos");
	}

}
