package tema4.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto13 {
	public static void muestraPares(int intNum) {
		for(int intCont=2; intCont<=2*intNum; intCont+=2)
			System.out.println(intCont);
	}
	
	
	
	public static void main(String[] args) {
		int intNum;
		Scanner scnLeer = new Scanner(System.in);
		
		System.out.println("Dame el número de pares que quieres");
		intNum=scnLeer.nextInt();
		scnLeer.close();
		muestraPares(intNum);
	}

}
