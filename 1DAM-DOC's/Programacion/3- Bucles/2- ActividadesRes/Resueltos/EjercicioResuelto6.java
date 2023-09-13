package tema3;

import java.util.Scanner;

public class EjercicioResuelto6 {

	public static void main(String[] args) {
		int intLeido;//leido del usuario
		Scanner scnLeer = new Scanner(System.in);
		
		System.out.print("Dame el número");
		intLeido=scnLeer.nextInt();
		for(int intCont=1;intCont<=intLeido;intCont++)
			System.out.print(intCont + ", ");
			
	}

}
