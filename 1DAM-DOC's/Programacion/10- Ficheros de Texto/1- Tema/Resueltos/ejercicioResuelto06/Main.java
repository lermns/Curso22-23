package tema10.ejerciciosResueltos.ejercicioResuelto06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		int intAcumulador=0;
		int intLeidos=0;
		Scanner scnLeer;
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("src/tema10/ejerciciosResueltos/ejercicioResuelto06/numerosReales.txt");
		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero");
		}
		
		if(fis != null) {
			scnLeer = new Scanner(fis);
			
			while(scnLeer.hasNext()) {
				intAcumulador += scnLeer.nextInt();
				intLeidos++;
			}
			System.out.println("La suma de los números es " + intAcumulador + " y su media es " + ((double)intAcumulador/intLeidos));

			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println("No se ha podido cerrar el fichero");
				}
			}
		}
	}

}
