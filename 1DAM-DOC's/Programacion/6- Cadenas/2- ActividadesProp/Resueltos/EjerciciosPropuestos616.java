package tema6.ejerciciosPropuestos;

import java.util.Scanner;

public class EjerciciosPropuestos616 {

	public static void main(String[] args) {
		String strFrase;//frase a codificar
		String strAux;
		String strLetraACambiar;
		String strLetraACambiada;
		Scanner scnLeer=new Scanner(System.in);		
		char chrArrCodifica[][] = {{'a','@'}, {'e','1'}, {'i','☺'}, {'o','♥'}, {'u','⚐'}, 
									{'b','⚒'}, {'c','✓'}, {'h','⟂'}, {'l','⟒'}, {'p','⟆'}};
		
		System.out.print("Dame una frase: ");
		strFrase = scnLeer.nextLine().toLowerCase();
		scnLeer.close();
		strAux=strFrase;

		//paso por todo el array y si exise dicho caracter en el texto lo cambio
		for(char cambio[]: chrArrCodifica) {
			strLetraACambiar = String.valueOf(cambio[0]);
			strLetraACambiada = String.valueOf(cambio[1]);
			if(strFrase.contains(strLetraACambiar)) {//solo muestro si se cambia
				strFrase = strFrase.replaceAll(strLetraACambiar, strLetraACambiada);
				System.out.println(strFrase);//muestro el cambio paso por paso
			}
		}
		
		//si no me piden que sean caracteres no contiguos
		for(int intCont=0; intCont<strAux.length();intCont++)
			System.out.print((char)(strAux.charAt(intCont)+2400));
		
		System.out.println();
		
		//otra manera que no sean caracteres no contiguos
		for(int intCont=0; intCont<strAux.length();intCont++)
			strAux = strAux.replace(strAux.charAt(intCont),((char)((int)(Math.random()*50)+9000)));
		System.out.println(strAux);
	}
}