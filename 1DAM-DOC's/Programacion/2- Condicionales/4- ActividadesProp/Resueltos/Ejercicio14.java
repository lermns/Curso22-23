package tema2;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		byte btyNum;//Número a convertir en letras
		Scanner scnLeer = new Scanner(System.in);
		

		System.out.print("Dame el número ");
		btyNum = scnLeer.nextByte();

		if(btyNum>=10 && btyNum<=15)
			switch(btyNum) {
				case 10 -> System.out.print("Diez");
				case 11 -> System.out.print("Once");
				case 12 -> System.out.print("Doce");
				case 13 -> System.out.print("Trece");
				case 14 -> System.out.print("Catorce");
				case 15 -> System.out.print("Quince");
			}
		else {
			if(btyNum>15 && btyNum<20)
				System.out.print("Dieci");
			else if(btyNum>20 && btyNum<30)
					System.out.print("Venti");
				 else
					 switch(btyNum/10) {
						case 2 -> System.out.print("Veinte");
						case 3 -> System.out.print("Treinta");
						case 4 -> System.out.print("Cuarenta");
						case 5 -> System.out.print("Cincuenta");
						case 6 -> System.out.print("Sesenta");
						case 7 -> System.out.print("Setenta");
						case 8 -> System.out.print("Ochenta");
						case 9 -> System.out.print("Noventa");
					}
			if(btyNum>30 && btyNum%10!=0)
				System.out.print(" y ");
			switch(btyNum%10) {
				case 1 -> System.out.print("uno");
				case 2 -> System.out.print("dos");
				case 3 -> System.out.print("tres");
				case 4 -> System.out.print("cuatro");
				case 5 -> System.out.print("cinco");
				case 6 -> System.out.print("seis");
				case 7 -> System.out.print("siete");
				case 8 -> System.out.print("ocho");
				case 9 -> System.out.print("nueve");
			}
		}
	}
}
