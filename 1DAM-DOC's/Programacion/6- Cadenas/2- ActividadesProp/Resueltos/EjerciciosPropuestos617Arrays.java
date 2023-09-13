package tema6.ejerciciosPropuestos;

import java.util.Scanner;

public class EjerciciosPropuestos617Arrays {

	public static void main(String[] args) {
		Scanner scnLeer = new Scanner(System.in);
		int intNumPosiciones;
		String strFrase;
		
		System.out.print("Dame una frase: ");
		strFrase = scnLeer.nextLine();
		System.out.print("Dame el número de letras a cortar: ");
		intNumPosiciones = scnLeer.nextInt();
		scnLeer.close();
		
		for (int intIndice=0; intIndice<strFrase.length(); intIndice+=intNumPosiciones) {
			for (int intIndiceNum=0; intIndiceNum+intIndice<strFrase.length() && intIndiceNum<intNumPosiciones ; intIndiceNum++)
				System.out.print(strFrase.charAt(intIndiceNum+intIndice));
			System.out.println("");
		}
	}

}
