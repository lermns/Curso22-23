package tema4.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto16 {

	public static boolean esPrimo(int intNum) {
		int intCont=2;
		int intMitad=intNum/2;
		
		for(;intCont<=intMitad && intNum%intCont!=0;intCont++);
		
		return intCont>intMitad;
	}
	
	public static void divisoresPrimos(int intNum) {
		for(int intCont=1;intCont<=intNum;intCont++)
			if(esPrimo(intCont) && intNum%intCont==0) {
				System.out.println("\tDivisor primo: " + intCont);
			}
	}
	
	public static void main(String[] args) {
		int intNumero;
		
		System.out.println("Dame un Numero");
		intNumero = new Scanner(System.in).nextInt();		
		divisoresPrimos(intNumero);
	}

}
