package tema3;

import java.util.Scanner;

public class EjercicioResuelto4 {

	public static void main(String[] args) {
		int intAltura, intMaxAltura=0, intCont=0;//para leer la altura, guardar el mayor y etiqueta del arbol
		Scanner scnLeer = new Scanner(System.in);
		
		System.out.print("Dime la altura en cm del arbol " + intCont + ":");
		intAltura=scnLeer.nextInt();
		while(intAltura!=-1) {
			if(intAltura>intMaxAltura)
				intMaxAltura=intAltura;
			intCont++;
			System.out.print("Dime la altura en cm del arbol " + intCont + ":");
			intAltura=scnLeer.nextInt();
		}
		
		System.out.println("La mayor altura leida es: " + intMaxAltura);
			
	}

}
