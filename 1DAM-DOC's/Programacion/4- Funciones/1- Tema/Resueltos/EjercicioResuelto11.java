package tema4;

import java.util.Scanner;

public class EjercicioResuelto11 {
	public static int mcd(int intNum1, int intNum2) {
		int intMayor,intMenor;
		
		intMayor =numeroMayor(intNum1, intNum2);
		intMenor =numeroMenor(intNum1, intNum2);
		
		if(intMayor%intMenor==0)
			return intMenor;
		else
			return mcd(intMayor-intMenor,intMenor);
	}
	
	public static int numeroMayor(int intNum1, int intNum2) {
		return intNum1>intNum2?intNum1:intNum2;
	}
	
	public static int numeroMenor(int intNum1, int intNum2) {
		return intNum1<intNum2?intNum1:intNum2;
	}
	
	public static void main(String[] args) {
		int intNum1,intNum2, intNum3;
		Scanner scnLeer = new Scanner(System.in);
		
		System.out.println("Dame el primer número");
		intNum1=scnLeer.nextInt();
		System.out.println("Dame el segundo");
		intNum2=scnLeer.nextInt();
		scnLeer.close();		
		System.out.println("Número Mcd de "+ intNum1 + " y " + intNum2 + " es " + mcd(intNum1, intNum2));
	}

}
