package ficherosDeTexto.ejerProps.ejer10_17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader a;
		String strLinea;
		int intLineShow = 0, intLinePerPage = 24;
		try {
			a = new BufferedReader(new FileReader("C:/CURSO/Programación/ficherosDeTexto/src/ficherosDeTexto/ejerProps/ejer10_17/texto1.txt"));
			while((strLinea = a.readLine()) != null) {
				System.out.println(strLinea);
				intLineShow++;
				
				if(intLineShow == intLinePerPage) {
					System.out.println("-- Más --  (presiona ENTER para pasar de página...)");
					intLineShow = 0;
					System.in.read();
					System.out.println();
					
				}
			}
			System.out.println("Fin...");
		} catch (FileNotFoundException e) {
			System.out.println("No se puede encontrar el fichero txt " + e.getMessage());
		}
	}

}
