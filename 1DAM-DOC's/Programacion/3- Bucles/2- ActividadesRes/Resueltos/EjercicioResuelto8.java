package tema3;

import java.util.Scanner;

public class EjercicioResuelto8 {

	public static void main(String[] args) {
		int intLeido, intAcumulador=0;//leido del usuario
		Scanner scnLeer = new Scanner(System.in);
		
		for(int intCont=1;intCont<=10;intCont++) {
			System.out.print("Dame el número ");
			intLeido=scnLeer.nextInt();
			intAcumulador+=intLeido;
		}
		
		System.out.print("La medida es: " + intAcumulador/10);
	}

}
