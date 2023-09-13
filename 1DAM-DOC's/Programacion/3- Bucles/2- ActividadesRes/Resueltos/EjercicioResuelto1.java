package tema3;

import java.util.Scanner;

public class EjercicioResuelto1 {

	public static void main(String[] args) {
		int intNum;//número leido
		Scanner scnLeer = new Scanner(System.in);
		
		System.out.print("Dame un número: ");
		intNum = scnLeer.nextInt();
		
		while(intNum!=0) {
			System.out.println("\nEl número es par: " + (intNum%2==0) + ", el número es positivo: " + (intNum>0) + ", su cuadrado es: " + (intNum*intNum));
			System.out.print("Dame un número: ");
			intNum = scnLeer.nextInt();
		}

	}

}
