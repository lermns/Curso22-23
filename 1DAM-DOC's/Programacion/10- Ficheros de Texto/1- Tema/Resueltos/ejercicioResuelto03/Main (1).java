package tema10.ejerciciosResueltos.ejercicioResuelto03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String strFrase;
		
		BufferedReader br = new BufferedReader (new FileReader("src/tema10/ejerciciosResueltos/ejercicioResuelto01/Main.java"));
		strFrase = br.readLine();
		while(strFrase!=null) {
			System.out.println(strFrase);
			strFrase = br.readLine();
		}
	}

}
