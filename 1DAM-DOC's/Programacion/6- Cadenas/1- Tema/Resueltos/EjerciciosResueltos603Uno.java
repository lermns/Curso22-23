package tema6.ejerciciosResueltos;

import java.util.Scanner;

public class EjerciciosResueltos603Uno {

	public static void main(String[] args) {
		Scanner scnLeer=new Scanner(System.in);
		String strContrasenna;
		String strIntento;
		
		System.out.print("Jugador1: Dame la contraseña ");
		strContrasenna=scnLeer.nextLine();
		
		do {
			System.out.print("\nJugador2: Dame la frase que crees que es la contraseña ");
			strIntento=scnLeer.nextLine();

			if(strContrasenna.compareTo(strIntento)<0)
				System.out.println("La contraseña es menor");
			else if(strContrasenna.compareTo(strIntento)>0)
						System.out.println("La contraseña es mayor");
		}while(!(strContrasenna.equals(strIntento)));
		scnLeer.close();
		

	}

}
