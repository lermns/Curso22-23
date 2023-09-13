package tema2;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		byte btyNum1,btyNum2;//números a sumar y resultado
		short srtResultado;
		
		btyNum1 = (byte) (Math.random()*99+1);
		btyNum2 = (byte) (Math.random()*99+1);
		System.out.print("Dame la suma de " + btyNum1 + " y " + btyNum2 + " : ");
		srtResultado = new Scanner(System.in).nextShort();
		
		if(srtResultado==btyNum1+btyNum2)
			System.out.println("\nCorrecto");
		else
			System.out.println("\nNo es correcto. El resultado correcto es: " + (btyNum1+btyNum2));


	}

}
