package tema2;

import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {
		double rlnNum;//numero grados dadodo por el usuario
		Scanner scnLeer = new Scanner(System.in);
		

		System.out.print("Dame un número de grados: ");
		rlnNum = scnLeer.nextDouble();
		scnLeer.close();
		System.out.print("Los grados " + rlnNum + " son ");
		
		if(rlnNum>=360)
			System.out.print( ((int)rlnNum/360) + " vueltas y ");

		rlnNum%=360;//rlnNum=rlnNum%360;
		System.out.println( (rlnNum*Math.PI/180) + " radianes ");
		
	}

}
