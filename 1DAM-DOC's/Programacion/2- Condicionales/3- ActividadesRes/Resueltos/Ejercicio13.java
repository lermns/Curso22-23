package tema2;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		byte btyHora, btyMinuto, btySegundo;//Pedimos la hora completa
		Scanner scnLeer = new Scanner(System.in);
		

		System.out.print("Dame la hora ");
		btyHora = scnLeer.nextByte();
		System.out.print("\nDame el minuto ");
		btyMinuto = scnLeer.nextByte();
		System.out.print("\nDame el segundo ");
		btySegundo = scnLeer.nextByte();
		
		System.out.print("[" + btyHora + ":" + btyMinuto + ":" + btySegundo + "] -> ");
		btySegundo++;
		if(btySegundo==60) {
			btySegundo = 0;
			btyMinuto++;
			if(btyMinuto==60) {
				btyMinuto = 0;
				btyHora++;
				if(btyHora==24)
					btyHora = 0;
			}
		}
		System.out.println("[" + btyHora + ":" + btyMinuto + ":" + btySegundo + "]");
			 
	}

}
