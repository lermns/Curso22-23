package tema2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		int intNum;//Número leido del usuario
		Scanner scnLeer = new Scanner(System.in);
		

		System.out.print("Dame el número para saber las cifras: ");
		intNum = scnLeer.nextInt();
		
		if(intNum >= 10000)
			System.out.println("\nEl número tiene 5 cifras");
		else if(intNum >= 1000)
				System.out.println("\nEl número tiene 4 cifras");
			 else if(intNum >= 100)
				 		System.out.println("\nEl número tiene 3 cifras");
			 	  else if(intNum >= 10)
			 		  		System.out.println("\nEl número tiene 2 cifras");
			 	  	   else 
			 	  		    System.out.println("\nEl número tiene 1 cifra");
		

	}

}
