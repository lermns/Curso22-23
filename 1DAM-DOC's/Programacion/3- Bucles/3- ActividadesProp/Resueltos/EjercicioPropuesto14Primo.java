package tema3.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto14Primo {

	public static void main(String[] args) {
		int intNum, intDivisor;

		System.out.print("Dame un número para ver si es primo ");
		intNum = new Scanner(System.in).nextInt();
		for(intDivisor=2;intNum%intDivisor!=0 ;intDivisor++);
			
		if(intNum==intDivisor) 
			System.out.println(intNum + " -> primo");
		else 
			System.out.println(intNum + " -> no primo");
		
	}

}
