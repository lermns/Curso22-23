package tema10.ejerciciosPropuestos.ejercicioPropuesto10_20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		BufferedReader br1 = null, br2 = null;
		String strLinea1=null, strLinea2=null;
		int intLinea=1;
		int intCaracter=0;

		try {
			br1 = new BufferedReader(new FileReader("src/tema10/ejerciciosPropuestos/ejercicioPropuesto10_20/texto1.txt"));
			br2 = new BufferedReader(new FileReader("src/tema10/ejerciciosPropuestos/ejercicioPropuesto10_20/texto2.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Uno de los fichero no se ha encontrado");
		}
		
		if(br1!=null && br2!=null) {//si hemos abierto los archivos
			try {
				strLinea1 = br1.readLine();
				strLinea2 = br2.readLine();
			} catch (IOException e) {}
			while(strLinea1!=null && strLinea1!=null && strLinea1.equals(strLinea2)){//leo hasta llegar al final o que sean distintos
				intLinea++;
				try {
					strLinea1 = br1.readLine();
					strLinea2 = br2.readLine();
				} catch (IOException e) {}
			}
			
			if(strLinea1==null && strLinea2==null)//si han llegado al final los dos son iguales
				System.out.println("Son iguales");
			else if(strLinea1==null && strLinea2!=null)//si uno ha llegado al final ese será el más corto
					System.out.println("texto1.txt es el principio de texto2.txt, pero es más corto. Fallo en la línea " + intLinea);
			else if(strLinea1!=null && strLinea2==null)
				System.out.println("texto2.txt es el principio de texto1.txt, pero es más corto. Fallo en la línea " + intLinea);
			else {
				for(;intCaracter<strLinea1.length() && intCaracter<strLinea2.length() //mientras no lleguemos al final de las cadenas
					&& strLinea1.charAt(intCaracter)==strLinea2.charAt(intCaracter);intCaracter++);//y los caracteres sean iguales
				System.out.println("Son distintas. Primera diferencia en  línea " + intLinea + " caracter " + (intCaracter+1));
				
			}
		}
	}

}
