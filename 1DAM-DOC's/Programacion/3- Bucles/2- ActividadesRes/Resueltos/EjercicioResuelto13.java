package tema3;

import java.util.Scanner;

public class EjercicioResuelto13 {

	public static void main(String[] args) {
		int intSuspensos=0, intAprobados=0; //Suspensos y aprobados totales 
		float fltNota; //nota leida
		Scanner scnLeer = new Scanner(System.in);
		
		for(int intCont=1;intCont<=6;intCont++) {
			System.out.print("Dame la nota");
			fltNota=scnLeer.nextFloat();
			if(fltNota<4)
				intSuspensos++;
			else if(fltNota>=5)
				intAprobados++;
		}
		System.out.println("Numero de suspensos " + intSuspensos);
		System.out.println("Numero de condicionados " + (6-(intSuspensos+intAprobados)));
		System.out.println("Numero de aprobados " + intAprobados);
	}

}
