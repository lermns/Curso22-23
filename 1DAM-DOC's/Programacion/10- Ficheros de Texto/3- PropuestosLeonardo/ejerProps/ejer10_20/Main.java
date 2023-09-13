package tema10.ficherosDeTexto.ejerProps.ejer10_20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader a, b;
		String strLinea1, strLinea2;
		boolean esIgual = true;
		int intPos=0, intCont=0, intContLine=1;
		
		try {
			a = new BufferedReader (new FileReader("D:/Users/PedroLeonardoRamosBa/eclipse-workspace/tema10/src/tema10/ficherosDeTexto/ejerProps/ejer10_20/texto1.txt"));
			b = new BufferedReader (new FileReader ("D:/Users/PedroLeonardoRamosBa/eclipse-workspace/tema10/src/tema10/ficherosDeTexto/ejerProps/ejer10_20/texto2.txt"));
			
			while((strLinea1 = a.readLine()) != null && ((strLinea2 = b.readLine())!=null)) {
				for(int i = 0; i < strLinea1.length() && i < strLinea2.length(); i++) {
					if(strLinea1.charAt(i) != strLinea2.charAt(i)) {
						esIgual = false;
						intPos=i+1;
						intContLine+=intCont;
						break;
						}
					}

				if(esIgual==false) {
					intCont++;
					break;
				}else {
					intCont++;
				}
			}
			
			if(esIgual!=true) {
			System.out.println("Linea de error: " + intContLine + "\nPosición del caracter diferente: " + intPos + "\nEl archivo no es igual");
			}else {
				System.out.println("El archivo es igual ");
			}
		
		} catch (FileNotFoundException e) {
			System.out.println("El archivo texto no se ha encontrado" + e.getMessage());
		}
		
	}

}
