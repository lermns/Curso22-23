package tema10.ejerciciosResueltos.ejercicioResuelto05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		double rlnAcumulador=0;
		Scanner scnLeer;
		BufferedReader br = null;
		String strCadena;
		
		try {
			br = new BufferedReader (new FileReader("src/tema10/ejerciciosResueltos/ejercicioResuelto05/numerosReales.txt"));
			strCadena = br.readLine();
			
			while(strCadena!=null) {
				if(new Scanner(strCadena).hasNextDouble())
					rlnAcumulador += new Scanner(strCadena).nextDouble();
				strCadena = br.readLine();
			}
			System.out.println("La suma de los números es " + rlnAcumulador );

		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero");
		} catch (IOException e) {
			System.out.println("Fallo de lectura");
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("No se ha podido cerrar el fichero");
				}
			}
		}
	}

}
