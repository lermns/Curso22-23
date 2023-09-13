package tema4;

import java.util.Scanner;

public class EjercicioResuelto3Dos {
	/*************************************************************
	 * 
	 * @param byte bytEleccion -> 1 devuelve area y 2 el volumen *
	 * @param int intRadio -> de la base del cilindro			 *
	 * @param int intAltura -> del cilindro						 *
	 *************************************************************/
	public static double areaVolumenCilindro(byte bytEleccion, int intRadio, int intAltura) {
		double rlnVuelta=0;//variable que devolvemos
		
		switch(bytEleccion) {
			case 1->rlnVuelta=2*Math.PI*intRadio*(intRadio+intAltura);
			case 2->rlnVuelta=Math.PI*intRadio*intRadio*intAltura;
			default ->System.out.println("Elección no válida");
		}
		return rlnVuelta;
	}
	
	public static void main(String[] args) {
		double rlnArea1,rlnArea2;
		int intRadio, intAltura;
		Scanner scnLeer = new Scanner(System.in);
		
		System.out.println("Dame el radio del primer cilindro");
		intRadio=scnLeer.nextInt();
		System.out.println("Dame la altura del primer cilindro");
		intAltura=scnLeer.nextInt();
		rlnArea1 = areaVolumenCilindro((byte)1,intRadio,intAltura);
		System.out.println("Dame el radio del segundo cilindro");
		intRadio=scnLeer.nextInt();
		System.out.println("Dame la altura del segundo cilindro");
		intAltura=scnLeer.nextInt();
		rlnArea2 = areaVolumenCilindro((byte)1,intRadio,intAltura);
		scnLeer.close();
		
		System.out.println("Area del cilindro mayor: "+ (rlnArea1>rlnArea2?rlnArea1:rlnArea2));
		
		
		System.out.println("Volumen del cilindro: "+ areaVolumenCilindro((byte)2,2,3));

	}

}
