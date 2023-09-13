package tema4.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto15 {
	public static int diferenciaSeg(int intHoras, int intMinutos, int intHoras2, int intMinutos2) {
		return ((intHoras-intHoras2)*60 + (intMinutos-intMinutos2));
	}
	
	
	
	public static void main(String[] args) {
		int intHoras, intMinutos, intHoras2, intMinutos2;
		Scanner scnLeer = new Scanner(System.in);

		System.out.print("Dame las horas primeras: ");
		intHoras=scnLeer.nextInt();
		System.out.print("Dame los minutos primeros: ");
		intMinutos=scnLeer.nextInt();
		System.out.print("Dame las horas segundas: ");
		intHoras2=scnLeer.nextInt();
		System.out.print("Dame los minutos segundos: ");
		intMinutos2=scnLeer.nextInt();
		scnLeer.close();
		System.out.print(diferenciaSeg(intHoras, intMinutos, intHoras2, intMinutos2));
	}

}
