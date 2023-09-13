package tema3.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto11Dos {

	public static void main(String[] args) {
		int intNumBinario=0, intNumDecimal;
		float fltPotencia=1;

		System.out.println("Dame un número ");
		intNumDecimal = new Scanner(System.in).nextInt();
		System.out.print("El número " + intNumDecimal + " decimal es ");

		while(intNumDecimal>0) {
			intNumBinario+=(intNumDecimal%2)*(int)fltPotencia;
			intNumDecimal/=2;
			fltPotencia*=10;
		}
		System.out.print(intNumBinario + " en binario ");

		
	}

}
