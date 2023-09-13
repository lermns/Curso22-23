package tema3.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto11 {

	public static void main(String[] args) {
		int intNum, intPotencia;
		Scanner scnLeer = new Scanner(System.in);

		System.out.println("Dame un número ");
		intNum = scnLeer.nextInt();

		for(intPotencia=1;intPotencia<=intNum;intPotencia*=2);
		
		for(intPotencia/=2;intPotencia>0;intPotencia/=2)
			if(intNum>=intPotencia) {
				System.out.print("1");
				intNum-=intPotencia;
			}else
				System.out.print("0");

	}

}
