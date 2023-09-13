package tema10.ejerciciosResueltos.ejercicioResuelto02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		int intCaracter;
		
		//FileReader fr = new FileReader("src//tema10//ejerciciosResueltos//ejercicioResuelto01//Main.java");
		FileReader fr = new FileReader("src/tema10/ejerciciosResueltos/ejercicioResuelto01/Main.java");
		intCaracter = fr.read();
		while(intCaracter!=-1) {
			System.out.print((char)intCaracter);
			intCaracter = fr.read();
		}
	}

}
