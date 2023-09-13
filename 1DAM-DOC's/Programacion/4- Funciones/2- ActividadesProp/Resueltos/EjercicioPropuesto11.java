package tema4.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto11 {
	public static void esfera(double rlnRadio) {
		System.out.println("Superficie de la esfera: " + 4*Math.PI*rlnRadio*rlnRadio);
		System.out.println("Volumen de la esfera: " + 4*Math.PI/3*Math.pow(rlnRadio,3));
	}
	
	
	
	public static void main(String[] args) {
		int intExponente;
		double rlnRadio;
		Scanner scnLeer = new Scanner(System.in);
		
		System.out.println("Dame el radio de la esfera");
		rlnRadio=scnLeer.nextDouble();
		scnLeer.close();
		esfera(rlnRadio);
	}

}
