package tema3;

import java.util.Scanner;

public class EjercicioResuelto12 {

	public static void main(String[] args) {
		int intSuspensos=0; //Suspensos totales 
		float fltNota; //nota leida
		Scanner scnLeer = new Scanner(System.in);
		
		for(int intCont=1;intCont<=5;intCont++) {
			System.out.print("Dame la nota");
			fltNota=scnLeer.nextFloat();
			if(fltNota<5)
				intSuspensos++;
		}
		System.out.print("Numero de suspensos " + intSuspensos);
	}

}
