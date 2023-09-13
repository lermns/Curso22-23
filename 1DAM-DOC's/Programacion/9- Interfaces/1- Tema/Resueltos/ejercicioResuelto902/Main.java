package tema9.ejerciciosResueltos.ejercicioResuelto902;

import java.util.Scanner;

import tema9.ejerciciosResueltos.ejercicioResuelto901.Cola;
import tema9.ejerciciosResueltos.ejercicioResuelto901.Lista;

public class Main {

	public static void main(String[] args) {
		Lista objCola = new Lista();
		Scanner scnLeer = new Scanner(System.in);
		int intNum;
		
		System.out.print("Dame el elemento a insertar o pon un número negativo: ");
		intNum = scnLeer.nextInt();
		while(intNum>=0) {
	         objCola.push(intNum);
	         System.out.print("Dame el elemento a insertar o pon un número negativo: ");
	 		intNum = scnLeer.nextInt();
	     }
	      
	      System.out.println("Sacamos los elementos de la Cola");
	      while (objCola.elementos()>0) {
	         System.out.println(objCola.pop());
	      }
	      scnLeer.close();
	}

}
