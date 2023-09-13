package tema4.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto19 {

	public static void aleatorios(int intCantidad) {
		for(int intCont=1;intCont<=intCantidad;intCont++)
			System.out.println((int) (2*Math.random()));
	}
	
	public static void aleatorios(int intCantidad, int intMaximo, int intMinimo) {
		for(int intCont=1;intCont<=intCantidad;intCont++)
			System.out.println((int) (Math.random()*(intMaximo-intMinimo-1)+intMinimo));
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
		aleatorios(intCantidad, intMaximo, intMinimo);
		System.out.print("Dame la cantidad de números: ");
		intCantidad=scnLeer.nextInt();
		scnLeer.close();
		aleatorios(intCantidad);
	}

}
