package tema3.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto13 {

	public static void main(String[] args) {
		byte btyHora, btyMinuto, btySegundo;//guarda la hora solicitada
		int intIncremento;
		Scanner scnLeer = new Scanner(System.in);
		

		System.out.print("Dame la hora ");
		btyHora = scnLeer.nextByte();
		System.out.print("\nDame los minutos ");
		btyMinuto = scnLeer.nextByte();
		System.out.print("\nDame los segundos ");
		btySegundo = scnLeer.nextByte();
		System.out.println("Hora actual [" + btyHora + ":" + btyMinuto + ":" + btySegundo + "]");
		System.out.print("Dame la hora el incremento en segundos");
		intIncremento = scnLeer.nextInt();
		
		System.out.println("incrementa horas " + ((((btySegundo+intIncremento)/60)+btyMinuto)/60));
		btyHora=(byte) ((((((btySegundo+intIncremento)/60)+btyMinuto)/60)+btyHora)%24);
		System.out.println("incrementa minutos " + ((btySegundo+intIncremento)/60));
		btyMinuto=(byte) ((((btySegundo+intIncremento)/60)+btyMinuto)%60);
		btySegundo=(byte) ((btySegundo+intIncremento)%60);
		
			
		
		System.out.println(" hora incrementada [" + btyHora + ":" + btyMinuto + ":" + btySegundo + "]");
	}

}
