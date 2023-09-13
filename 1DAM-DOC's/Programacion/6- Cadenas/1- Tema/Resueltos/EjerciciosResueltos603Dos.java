package tema6.ejerciciosResueltos;

import java.util.Scanner;

public class EjerciciosResueltos603Dos {

	public static void main(String[] args) {
		Scanner scnLeer=new Scanner(System.in);
		String strContrasenna;
		String strIntento;
		
		System.out.print("Jugador1: Dame la contraseña ");
		strContrasenna=scnLeer.nextLine();
		
		do {
			System.out.print("\nJugador2: Dame la frase que crees que es la contraseña ");
			strIntento=scnLeer.nextLine();

			for(int intCont=0;intCont<strContrasenna.length();intCont++)
				if(strIntento.length()>intCont && strContrasenna.charAt(intCont)==strIntento.charAt(intCont))
					System.out.print(strContrasenna.charAt(intCont));
				else 
					System.out.print("*");
			System.out.println();
		}while(!(strContrasenna.equals(strIntento)));
		scnLeer.close();
		

	}

}
