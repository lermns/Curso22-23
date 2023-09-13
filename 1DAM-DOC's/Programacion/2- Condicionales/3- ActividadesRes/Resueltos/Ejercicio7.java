package tema2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		byte btyNum1, btyNum2;//numeros leidos por el usuario
		Scanner scnLeer = new Scanner(System.in);
		byte btyMayor, btyMenor; //guarda el número mayor y menor
		

		System.out.println("Dame un número 1: ");
		btyNum1 = scnLeer.nextByte();
		System.out.println("Dame un número 2: ");
		btyNum2 = scnLeer.nextByte();
		
		btyMayor = (btyNum1>btyNum2) ? btyNum1 : btyNum2;
		btyMenor = (btyNum1<btyNum2) ? btyNum1 : btyNum2;
		System.out.println(btyMayor + ", " + btyMenor);
		
/*		if(btyNum1>btyNum2)
			System.out.println(btyNum1 + ", " + btyNum2);
		else
			System.out.println(btyNum2 + ", " + btyNum1);
*/
	}

}
