package tema4.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto14 {
	public static int cantidadSeg(int intHoras, int intMinutos, int intDias) {
		return (((((intDias*24)+intHoras)*60) + intMinutos)*60);
	}
	
	
	
	public static void main(String[] args) {
		int intHoras, intMinutos, intDias;
		Scanner scnLeer = new Scanner(System.in);

		System.out.print("Dame las horas: ");
		intHoras=scnLeer.nextInt();
		System.out.print("Dame los minutos: ");
		intMinutos=scnLeer.nextInt();
		System.out.print("Dame los días: ");
		intDias=scnLeer.nextInt();
		scnLeer.close();
		System.out.print(cantidadSeg(intHoras, intMinutos, intDias));
	}

}
