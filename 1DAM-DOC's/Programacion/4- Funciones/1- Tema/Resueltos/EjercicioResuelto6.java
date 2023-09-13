package tema4;

import java.util.Scanner;

public class EjercicioResuelto6 {

	public static boolean esPrimo(int intNum) {
		int intCont=2;
		int intMitad=intNum/2;
		
		for(;intCont<=intMitad && intNum%intCont!=0;intCont++);
		
		return intCont>intMitad;
	}
	
	public static void main(String[] args) {
		int intNumero;
		
		System.out.println("Dame un número");
		intNumero = new Scanner(System.in).nextInt();		
		
		System.out.println("Es primo: "+ esPrimo(intNumero));
//		for(int intCont=1;intCont<20;intCont++)
//			System.out.println("Es primo: "+ intCont+ " " +esPrimo(intCont));
	}

}
