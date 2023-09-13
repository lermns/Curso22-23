package tema4;

import java.util.Scanner;

public class EjercicioResuelto9 {
	public static int numeroMayor(int intNum1, int intNum2, int intNum3) {
	/*	int intMayorUnoDos=numeroMayor(intNum1,intNum2);
		int intMayorTotal=numeroMayor(intMayor,intNum3);
		return intMayorTotal;*/
		return numeroMayor(numeroMayor(intNum1,intNum2),intNum3);
	}
	
	public static int numeroMayor(int intNum1, int intNum2) {
		return intNum1>intNum2?intNum1:intNum2;
	}
	
	public static void main(String[] args) {
		int intNum1,intNum2, intNum3;
		Scanner scnLeer = new Scanner(System.in);
		
		System.out.println("Dame el primer número");
		intNum1=scnLeer.nextInt();
		System.out.println("Dame el segundo");
		intNum2=scnLeer.nextInt();
		System.out.println("Dame el tercero");
		intNum3=scnLeer.nextInt();
		scnLeer.close();		
		System.out.println("Número mayor: "+ numeroMayor(intNum1, intNum2,intNum3));
	}

}
