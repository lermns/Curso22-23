package tema2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		float flta, fltb, fltc;//coeficiente leidos por el usuario
		float fltRaiz;//resultado de b2-4ac
		Scanner scnLeer = new Scanner(System.in);
		

		System.out.println("Dame los coeficientes");
		System.out.print("\n\ta: ");
		flta = scnLeer.nextFloat();
		System.out.print("\n\tb: ");
		fltb = scnLeer.nextFloat();
		System.out.print("\n\tc: ");
		fltc = scnLeer.nextFloat();
		
		if(flta == 0)
			System.out.println("El coeficiente a no puede ser 0");
		else {
			fltRaiz = fltb * fltb - 4 * flta * fltc;
			if(fltRaiz == 0)
				System.out.println("Solo tiene un resultado: " + (-fltb/2*flta));
			else if(fltRaiz > 0) {
					 System.out.println("Resultado1: " + ((-fltb+Math.sqrt(fltRaiz))/2*flta));
					 System.out.println("Resultado2: " + ((-fltb-Math.sqrt(fltRaiz))/2*flta));	
				 }else
					 System.out.println("No tiene resultados reales");
		}

	}

}
