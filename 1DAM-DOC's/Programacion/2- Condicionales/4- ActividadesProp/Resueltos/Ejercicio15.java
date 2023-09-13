package tema2;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		byte btyBase, btyAltura;//valor de la base y la altura del triángulo
		Scanner scnLeer = new Scanner(System.in);
		
		System.out.print("Dame la base ");
		btyBase = scnLeer.nextByte();
		System.out.print("\nDame la altura ");
		btyAltura = scnLeer.nextByte();
		scnLeer.close();
		
		if (btyBase>0 && btyAltura>0) 
			System.out.println("El área del triángulo es: " + ((double)btyBase*btyAltura/2));
		else
			System.out.print("La base y la altura tienen que ser números positivos");

	}

}
