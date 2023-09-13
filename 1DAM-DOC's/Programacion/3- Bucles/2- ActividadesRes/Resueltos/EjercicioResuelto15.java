package tema3;

import java.util.Scanner;

public class EjercicioResuelto15 {

	public static void main(String[] args) {
		byte bytTamaño; //tamaño del triángulo
		Scanner scnLeer = new Scanner(System.in);
		
		do {
			System.out.print("Dame la dimensión ");
			bytTamaño=scnLeer.nextByte();
		}while(bytTamaño<1);
		
		for(int intLinea=bytTamaño;intLinea>=1; intLinea--) {
			for(int intPintaAsterisco=1;intPintaAsterisco<=intLinea; intPintaAsterisco++) 
				System.out.print("*");
			System.out.println();
		}
	}

}
