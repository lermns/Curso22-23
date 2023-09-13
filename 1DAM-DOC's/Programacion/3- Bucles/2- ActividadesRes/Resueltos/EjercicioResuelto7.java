package tema3;

import java.util.Scanner;

public class EjercicioResuelto7 {

	public static void main(String[] args) {
		int intLeido;//leido del usuario
		Scanner scnLeer = new Scanner(System.in);
		
		System.out.println("Multiplos de 7");
		for(int intCont=7;intCont<=100;intCont+=7)
			System.out.print(intCont + ", ");
			
	}

}
