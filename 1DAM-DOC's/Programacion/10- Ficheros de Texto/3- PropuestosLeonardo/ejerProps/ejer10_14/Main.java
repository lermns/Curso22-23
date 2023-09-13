package ficherosDeTexto.ejerProps.ejer10_14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader a, b;
		String strLineas, archivo = "C:/CURSO/Programación/ficherosDeTexto/src/ficherosDeTexto/ejerProps/ejer10_14/carta.txt";
		String[] strPalabras;
		int intCont = 0, intCont2=0;
		String linea, contenido = "";
		
		try {
			a = new BufferedReader (new FileReader(archivo));
			b = new BufferedReader (new FileReader(archivo));
			
				while((strLineas = a.readLine()) != null) {
					System.out.println(strLineas);
					intCont++;
					strPalabras = strLineas.split(" ");
					intCont2 += strPalabras.length;
				}
				a.close();
			    
			    while ((linea = b.readLine()) != null) {
			        contenido += linea;
			    }
			    b.close();
			    
			    String strSinSpace = contenido.replace(" ", "");
				
				System.out.println("\nLineas: " + intCont + "\nPalabras: " + intCont2 + "\nCaracteres: " + strSinSpace.length());			
		
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no se encuentra " + e.getMessage());
		}
	}

}
