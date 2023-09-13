package tema9.ejerciciosResueltos.ejercicioResuelto10_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Integer intNum = null;
		
		do {
			try {
				System.out.print("Dame un número entero: ");
				intNum=new Scanner(System.in).nextInt();
			}
			catch(Exception ex) {System.out.println("El número no es un entero");}
		}while(intNum==null);

	}

}
