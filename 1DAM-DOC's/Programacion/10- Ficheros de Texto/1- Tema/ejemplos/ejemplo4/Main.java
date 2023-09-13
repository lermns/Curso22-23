package tema10.ejemplos.ejemplo4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		FileReader fr;
		int intCaracter;
		try {
			fr = new FileReader("d:/Users/ElkinGuadillaGonzale/Documents/ejemplo.txt");
			try {
				intCaracter=fr.read();
				while(intCaracter!=-1) {
					System.out.print((char)intCaracter);
					intCaracter=fr.read();
				}
			} catch (IOException e) {
				System.out.println("Error de lectura");
			}finally {
				fr.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");
		} 

	}

}
