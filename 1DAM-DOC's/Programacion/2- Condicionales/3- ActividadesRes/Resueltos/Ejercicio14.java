package tema2;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		byte btyDia, btyMes, btyMaxDia;//día, mes y maximo del mes de la fecha
		short btyAnno;//año de la fecha
		Scanner scnLeer = new Scanner(System.in);
		
		System.out.print("Dame el día ");
		btyDia = scnLeer.nextByte();
		System.out.print("\nDame el mes ");
		btyMes = scnLeer.nextByte();
		System.out.print("\nDame el año ");
		btyAnno = scnLeer.nextShort();
		scnLeer.close();
				
		switch(btyMes) {
			case 1, 3, 5, 7, 8, 10, 12 -> btyMaxDia=31;
			case 2 -> btyMaxDia=28;
			default -> btyMaxDia=30;
		}
		
		System.out.print("Fecha actual: " + btyDia + "/" + btyMes + "/" + btyAnno);
		btyDia++;
		if (btyDia>btyMaxDia) {
			btyDia = 1;
			btyMes++;
			if(btyMes>12) {
				btyMes=1;
				btyAnno++;
			}
		}
		System.out.print(" fecha mañana: " + btyDia + "/" + btyMes + "/" + btyAnno);

	}

}
