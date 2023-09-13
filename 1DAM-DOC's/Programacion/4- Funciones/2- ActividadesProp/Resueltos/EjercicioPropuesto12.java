package tema4.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto12 {
	public static double distancia(double rlnX1, double rlnY1, double rlnX2, double rlnY2) {
		return Math.sqrt(Math.pow((rlnX1-rlnX2),2)+Math.pow((rlnY1-rlnY2),2));
	}
	
	
	
	public static void main(String[] args) {
		double rlnX1, rlnY1, rlnX2, rlnY2;
		Scanner scnLeer = new Scanner(System.in);

		System.out.println("Dame el X del primer punto");
		rlnX1=scnLeer.nextDouble();
		System.out.println("Dame el Y del primer punto");
		rlnY1=scnLeer.nextDouble();
		System.out.println("Dame el X del segundo punto");
		rlnX2=scnLeer.nextDouble();
		System.out.println("Dame el Y del segundo punto");
		rlnY2=scnLeer.nextDouble();
		scnLeer.close();
		System.out.println("Distancia entre los puntos " +distancia(rlnX1, rlnY1, rlnX2, rlnY2));
	}

}
