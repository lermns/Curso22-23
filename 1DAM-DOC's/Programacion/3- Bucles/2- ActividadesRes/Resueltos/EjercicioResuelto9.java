package tema3;

import java.util.Scanner;

public class EjercicioResuelto9 {

	public static void main(String[] args) {
		int intLeido;//leido del usuario
		Scanner scnLeer = new Scanner(System.in);
		
		do{
			System.out.print("Dame el número para sacar su tabla de multiplicar ");
			intLeido=scnLeer.nextInt();
		}while(intLeido<1 || intLeido>10);
		scnLeer.close();
		
		for(int intCont=1;intCont<=10; intCont++)
			System.out.println(intCont + " x " + intLeido + " = " + intCont*intLeido);
	}

}
