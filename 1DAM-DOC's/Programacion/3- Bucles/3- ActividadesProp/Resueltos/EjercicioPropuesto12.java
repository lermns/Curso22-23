package tema3.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto12 {

	public static void main(String[] args) {
		int intNum, intPotencia, intResultado=0;
		boolean blnBandera = true;
		Scanner scnLeer = new Scanner(System.in);

		System.out.print("Dame un número binario ");
		intNum = scnLeer.nextInt();
		for(intPotencia=1;intNum!=0;intPotencia*=2) {
			if((intNum%10)>1) {
				blnBandera = false;
				intNum=0;
			}
			intResultado+=(intNum%10)*intPotencia;
			intNum/=10;
		}
		
		if(blnBandera == false)
			System.out.println("El número dado no es binario");
		else
			System.out.println("En decimal " + intResultado);
	}

}
