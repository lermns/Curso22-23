package tema5.resueltos;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioResuelto2 {

	public static void main(String[] args) {
		double[] rlnArrNumeros = new double[5];
		Scanner scnLeer = new Scanner(System.in);
		
		//rellenamos la tabla
		for(int intCont=0; intCont<rlnArrNumeros.length; intCont++) {
			System.out.print("Dame el número " + (intCont+1) + ": ");
			rlnArrNumeros[intCont]=scnLeer.nextDouble();
		}
		scnLeer.close();
		
		//mostramos el array
		System.out.println(Arrays.toString(rlnArrNumeros));
		
	}

}
