package tema10.ejerciciosResueltos.ejercicioResuelto07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		String strLinea1 = "En un lugar de La Mancha";
		String strLinea2 = "de cuyo nombre no quiero acordarme";
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("src/tema10/ejerciciosResueltos/ejercicioResuelto07/quijote.txt");
		} catch (IOException e) {
			System.out.println("Error al abrir el fichero");
		}
		
		if(fw != null) {
			for(int intCaracter=0; intCaracter<strLinea1.length(); intCaracter++)
				try {
					fw.write(strLinea1.charAt(intCaracter));
				} catch (IOException e) {}//si no hay caracter salto al siguiente
		}
		
		if(fw != null) {
			try {
				fw.close();
			} catch (IOException e) {
				System.out.println("No se ha podido cerrar el fichero");
			}
		}
		
		//no es necesario volver a abri el archivo, pero lo vamos a hacer para ser mas educativo
		try {//vamos a abrir en modo append, para añadir al final
			bw = new BufferedWriter(new FileWriter("src/tema10/ejerciciosResueltos/ejercicioResuelto07/quijote.txt", true));
		} catch (IOException e) {
			System.out.println("Error al abrir el fichero con el buffer");
		}
		
		if(bw != null) {
			try {
				bw.newLine();
				bw.write(strLinea2);
			} catch (IOException e) {
				System.out.println("No se ha podido escribir la segunda línea");
			}
		}
		
		if(bw != null) {
			try {
				bw.close();
			} catch (IOException e) {
				System.out.println("No se ha podido cerrar el fichero");
			}
		}
	}

}
