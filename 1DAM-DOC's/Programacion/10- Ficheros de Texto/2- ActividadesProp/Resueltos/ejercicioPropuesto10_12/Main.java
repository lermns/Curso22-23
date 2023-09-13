package tema10.ejerciciosPropuestos.ejercicioPropuesto10_12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		BufferedReader br = null;
		String strLinea;
		
		System.out.print("Dame un nombre de fichero para mostrar: ");
		try {
			br = new BufferedReader(new FileReader("src/tema10/ejerciciosPropuestos/ejercicioPropuesto10_11/" + new Scanner(System.in).nextLine()));
		} catch (FileNotFoundException e) {
			try {
				br = new BufferedReader(new FileReader("src/tema10/ejerciciosPropuestos/ejercicioPropuesto10_11/prueba.txt"));
			} catch (FileNotFoundException fnfe) {	
				System.out.println("No existe el fichero indicado ni prueba.txt");
			}
		}
		
		if(br != null) {
			try {
				strLinea = br.readLine();
				while(strLinea!=null) {
					System.out.println(strLinea);
					strLinea = br.readLine();
				}
			
				br.close();
			} catch (IOException e) {}
		}
	}

}
