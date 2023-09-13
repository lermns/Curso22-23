package tema6.ejerciciosResueltos;

import java.util.Scanner;

public class EjerciciosResueltos607 {

	public static void main(String[] args) {
		Scanner scnLeer=new Scanner(System.in);
		String strFrase;
		String strPalabra;
		int intContAparciones=0;
		
		System.out.print("Dame una frase: ");
		strFrase=scnLeer.nextLine();
		System.out.print("Dame la palabra que quieres ver cuantas veces aparece: ");
		strPalabra=scnLeer.next();
		scnLeer.close();
		
		for(int intCont=0, intAux=0; intAux>=0;intCont=intAux+1) {
			intAux=strFrase.indexOf(strPalabra,intCont);
			if(intAux>=0) 
				intContAparciones++;
		}
		System.out.println("El número de veces que aparece la palabra es: " + intContAparciones);

	}
}