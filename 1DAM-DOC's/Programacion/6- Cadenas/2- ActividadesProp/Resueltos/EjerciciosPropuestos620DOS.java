package tema6.ejerciciosPropuestos;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosPropuestos620DOS {

	public static void main(String[] args) {
		String strTexto;//texto con las palabras
		String strAux="";
		String[] strArrPalabras= {};//palabras del texto
		Scanner scnLeer=new Scanner(System.in);
		
		System.out.print("Dame el texto: ");
		strTexto = scnLeer.nextLine().strip();
		scnLeer.close();
		
		//metemos en el array las palabras
		strArrPalabras=strTexto.split(" ");
		Arrays.sort(strArrPalabras);
		
		for(String strValor:strArrPalabras) 
			if(!strAux.equals(strValor) && !strAux.equals(" ")) {//para no meter palabras repetidas y blancos
				strAux=strValor;
				System.out.println(strValor);
			}
	}
}