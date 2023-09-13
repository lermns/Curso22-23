package tema4;

import java.util.Scanner;

public class EjercicioResuelto12 {
	public static int fibonacci(int intNum1) {
				
		if(intNum1==0 || intNum1==1)
			return 1;
		else
			return fibonacci(intNum1-1)+fibonacci(intNum1-2);
	}
	
	public static void main(String[] args) {
		int intNum1,intNum2, intNum3;
		Scanner scnLeer = new Scanner(System.in);
		
		System.out.println("Dame número de la serie de fibonacci que desees ");
		intNum1=scnLeer.nextInt();
		
		scnLeer.close();		
		System.out.println("El valor de la serie de fibonacci para el número "+ intNum1 + " es " + fibonacci(intNum1));
	}

}
