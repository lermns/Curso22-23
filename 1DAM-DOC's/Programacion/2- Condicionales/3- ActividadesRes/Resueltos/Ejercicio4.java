package tema2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		float rlnNum;//numero leido por el usuario
		Scanner scnLeer = new Scanner(System.in);
		

		System.out.println("Dame un número ");
		rlnNum = scnLeer.nextFloat();
		if((rlnNum>-1 && rlnNum<1) && //mayor de -1 y menor de 1
			rlnNum!=0) 				  // y distinto de 0
			System.out.println("El número " + rlnNum + " es casi-cero");
		else
			System.out.println("El número " + rlnNum + " no es casi-cero");
	}

}
