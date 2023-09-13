package tema3;

import java.util.Scanner;

public class EjercicioResuelto14 {

	public static void main(String[] args) {
		final byte COLUMNAS=5;
		for(int intCont=1;intCont<=10; intCont+=COLUMNAS) {
			for(int intValor=1;intValor<=10; intValor++) {   
				for(int intColumna=intCont;intColumna<intCont+COLUMNAS && intColumna<=10 ; intColumna++) 
					System.out.print(intColumna + " x " + intValor + " = " + intColumna*intValor + "\t");
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
