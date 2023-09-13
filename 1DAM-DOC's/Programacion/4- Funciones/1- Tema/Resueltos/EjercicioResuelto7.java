package tema4;

import java.util.Scanner;

public class EjercicioResuelto7 {

	public static boolean esPrimo(int intNum) {
		int intCont=2;
		int intMitad=intNum/2;
		
		for(;intCont<=intMitad && intNum%intCont!=0;intCont++);
		
		return intCont>intMitad;
	}
	
	public static int numeroDePrimosDivisores(int intNum) {
		int intCantidad=1;
		
		for(int intCont=2;intCont<=intNum;intCont++)
			if(esPrimo(intCont) && intNum%intCont==0) 
				intCantidad++;
		
		return intCantidad;
	}
	public static void main(String[] args) {
		int intNumero;
		
		System.out.println("Dame un Numero");
		intNumero = new Scanner(System.in).nextInt();		
		System.out.println("El número de divisores primos es: "+ numeroDePrimosDivisores(intNumero));
//		for(int intCont=1;intCont<20;intCont++)
//			System.out.println("Numero: "+ intCont+ " num div " +numeroDePrimosDivisores(intCont));
	}

}
