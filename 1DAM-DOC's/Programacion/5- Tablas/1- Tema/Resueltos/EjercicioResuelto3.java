package tema5.resueltos;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioResuelto3 {

	public static void main(String[] args) {
		int[] rlnArrNumeros;
		int intCantidad;
		Scanner scnLeer = new Scanner(System.in);
		
		//inicializamos la tabla
		System.out.print("Dame el número de elementos que quieras guardar: ");
		intCantidad=scnLeer.nextInt();
		rlnArrNumeros = new int[intCantidad];
		
		//rellenamos la tabla
		for(int intCont=0; intCont<rlnArrNumeros.length; intCont++) {
			System.out.print("Dame el número " + (intCont+1) + ": ");
			rlnArrNumeros[intCont]=scnLeer.nextInt();
		}
		scnLeer.close();
		
		//mostramos el array
		System.out.println(Arrays.toString(rlnArrNumeros));
		
		//mostramos el array en orden inverso
		for(int intCont=rlnArrNumeros.length-1; intCont>=0; intCont--)
			System.out.print(rlnArrNumeros[intCont] + " | ");
	}

}
