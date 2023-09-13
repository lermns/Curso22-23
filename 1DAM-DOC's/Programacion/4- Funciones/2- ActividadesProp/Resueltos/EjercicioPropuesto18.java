package tema4.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto18 {
	public static void aleatorios(int intCantidad, int intMaximo, int intMinimo) {
		for(int intCont=1;intCont<=intCantidad;intCont++)
			System.out.println((int) (Math.random()*(intMaximo-intMinimo)+intMinimo));
	}
	
	public static void main(String[] args) {
		int intCantidad, intMaximo, intMinimo;
		Scanner scnLeer = new Scanner(System.in);
		
		System.out.print("Dame la cantidad de números: ");
		intCantidad=scnLeer.nextInt();
		System.out.print("Dame el valor máximo: ");
		intMaximo=scnLeer.nextInt();
		System.out.print("Dame el valor mínimo: ");
		intMinimo=scnLeer.nextInt();
		scnLeer.close();
		aleatorios(intCantidad, intMaximo, intMinimo);
	}

}
