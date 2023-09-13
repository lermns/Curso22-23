package tema4.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto15 {
	public static int cantidadMin(int intHoras, int intMinutos) {
		return (intHoras*60 + intMinutos);
	}
	
	public static int cantidadSeg(int intHoras, int intMinutos, int intDias) {
		return (((((intDias*24)+intHoras)*60) + intMinutos)*60);
	}
	
	static int diferenciaMin(int intHora1, int intMinuto1, int intHora2, int intMinuto2) {
		//return cantidadMin(intHora1, intMinuto1)-cantidadMin(intHora2, intMinuto2);
		return (cantidadSeg(intHora1, intMinuto1,0)-cantidadSeg(intHora2, intMinuto2,0))/60;
	}
	
	public static void main(String[] args) {
		int intHoras1, intMinutos1, intHoras2, intMinutos2;
		Scanner scnLeer = new Scanner(System.in);

		System.out.print("Dame las horas primeras: ");
		intHoras1=scnLeer.nextInt();
		System.out.print("Dame los minutos primeros: ");
		intMinutos1=scnLeer.nextInt();
		System.out.print("Dame las horas segundas: ");
		intHoras2=scnLeer.nextInt();
		System.out.print("Dame los minutos segundos: ");
		intMinutos2=scnLeer.nextInt();
		scnLeer.close();
		System.out.print(diferenciaMin(intHoras1, intMinutos1, intHoras2, intMinutos2));
	}

}
