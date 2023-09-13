package tema2;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		double rlnComidaDiaria, rlnKilosPorAnimal;
		short srtNumAnmales;
		Scanner scnLeer = new Scanner(System.in);
		

		System.out.print("Dame la cantidad de comida diaria ");
		rlnComidaDiaria = scnLeer.nextDouble();
		System.out.print("\nDame los kilos de comida por animal ");
		rlnKilosPorAnimal = scnLeer.nextDouble();
		System.out.print("\nDame el número de animales ");
		srtNumAnmales = scnLeer.nextShort();
		
		
		if(rlnComidaDiaria>=rlnKilosPorAnimal*srtNumAnmales) 
			System.out.print("Hay suficiente comida");
		else 
			System.out.print("No hay suficiente comida, el máximo será " + (rlnComidaDiaria/srtNumAnmales) + "kg por animal");
	}

}
