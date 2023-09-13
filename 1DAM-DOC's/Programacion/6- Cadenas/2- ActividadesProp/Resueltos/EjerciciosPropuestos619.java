package tema6.ejerciciosPropuestos;

import java.util.Scanner;

public class EjerciciosPropuestos619 {

	public static void main(String[] args) {
		String strTexto;//texto del editor
		String strPalabra;
		String strCambio;
		char chrContesta;
		Scanner scnLeer=new Scanner(System.in);
		
		System.out.print("Dame el texto del editor: ");
		strTexto = scnLeer.nextLine();
		
		do {
			do {//solo permito que introduzca s o n
				System.out.print("\n\nQuieres cambiar una palabra del texto (s/n): ");
				chrContesta = scnLeer.nextLine().charAt(0);
			}while(chrContesta!='s' && chrContesta!='n');
			
			if(chrContesta=='s') {//solo si ha puesto s hago el cambio
				System.out.print("Dame la palabra a cambiar: ");
				strPalabra = scnLeer.nextLine();
				System.out.print("Dame la palabra a insertar: ");
				strCambio = scnLeer.nextLine();
				strTexto=strTexto.replace(" "+strPalabra+" ", " "+strCambio+" ");
				System.out.println("El editor tiene el siguiente texto: "+ strTexto);
			}
		}while(chrContesta!='n');//si pone n es que no quiere continuar
		
		scnLeer.close();

	}
}