package tema2;

import java.util.Scanner;

public class Ejercicio12 {

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
		
		if(btyAnno>2022)
			System.out.println("El número año no puede ser mayor que el actual");
		else if(btyMes<1 || btyMes>12)
				System.out.println("El mes tiene que estar entre 1 y 12");
			 else {
				 switch(btyMes) {
				 	case 1, 3, 5, 7, 8, 10, 12 -> btyMaxDia=31;
				 	case 2 -> btyMaxDia=28;
				 	default -> btyMaxDia=30;
				 }
				 if(btyDia<1 || btyDia>btyMaxDia)
						System.out.println("El número de día no es válido");
				 else
					 System.out.println("La fecha es correcta");
			 }
				 
	}

}
