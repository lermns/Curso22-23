package tema10.ejerciciosPropuestos.ejercicioPropuesto10_14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		FileReader fr = null;
		int intCaracter;
		int intContador = 0;
		int intContCarcteres = 0;
		int intContLineas = 0;
		
		try {
			fr = new FileReader("src/tema10/ejerciciosPropuestos/ejercicioPropuesto10_14/carta.txt");
		} catch (FileNotFoundException e) {	
				System.out.println("No existe el fichero carta.txt");
			}
		
		if(fr != null) {
			try {
				intCaracter = fr.read();
				while(intCaracter!=-1) {
					if(Character.isWhitespace((char)intCaracter)) {
						intContador++;
						if(Character.LINE_SEPARATOR==(char)intCaracter)
							intContLineas++;
					}
					else
						intContCarcteres++;
					intCaracter = fr.read();
				}
			
				fr.close();
			} catch (IOException e) {}
		}
		System.out.println("El número de líneas es: " + intContLineas + " de palabras: " + intContador + " y hay " + intContCarcteres + " caracteres");
	}

}
