package tema2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		byte btyNum;//numero leido por el usuario
		Scanner scnLeer = new Scanner(System.in);
		

		System.out.println("Dame un número ");
		btyNum = scnLeer.nextByte();
		if(btyNum%2==0)
			System.out.println("El número " + btyNum + " es par");
		else
			System.out.println("El número " + btyNum + " es impar");
	}

}
