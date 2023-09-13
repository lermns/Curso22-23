package tema10.ejerciciosResueltos.ejercicioResuelto04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String[] arrStrNumeros;
		int intAcumulador=0;
		
		BufferedReader br = new BufferedReader (new FileReader("src/tema10/ejerciciosResueltos/ejercicioResuelto04/numerosReales.txt"));
		arrStrNumeros = br.readLine().split(" ");
		
		for(String strValor:arrStrNumeros)
			intAcumulador+=Integer.parseInt(strValor);
		
		System.out.println("La suma de los números es " + intAcumulador + " y la media " + (intAcumulador/arrStrNumeros.length));
	}

}
