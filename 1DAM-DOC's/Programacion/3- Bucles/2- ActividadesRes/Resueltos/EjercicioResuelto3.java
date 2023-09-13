package tema3;

import java.util.Scanner;

public class EjercicioResuelto3 {

	public static void main(String[] args) {
		int intNum, intNumLeido;//número a adivinar
		Scanner scnLeer = new Scanner(System.in);
		
		intNum = (int)(Math.random()*100+1);
		System.out.print("Dime el número secreto: ");
		intNumLeido=scnLeer.nextInt();
		while(intNumLeido>0 && intNumLeido!=intNum) {
			if(intNumLeido>intNum)
				System.out.println("\nEl número secreto es menor");
			else
				System.out.println("\nEl número secreto es mayor");
			
			System.out.print("Dime el número secreto: ");
			intNumLeido=scnLeer.nextInt();
		}
		
		if(intNumLeido==intNum)
			System.out.println("\n**** Felicidades ****");
		else
			System.out.println("Si con estas pistas no aciertas, lo tuyo no es la programación");
			
	}

}
