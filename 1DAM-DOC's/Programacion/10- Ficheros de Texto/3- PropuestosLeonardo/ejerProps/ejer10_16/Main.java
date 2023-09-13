package ficherosDeTexto.ejerProps.ejer10_16;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		Set<String> listNombres = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		BufferedReader a, d;
		BufferedWriter b;
		String strLineas, strLineas2, archivo1="C:/CURSO/Programación/ficherosDeTexto/src/ficherosDeTexto/ejerProps/ejer10_16/firmas.txt";
		
		try {
			a = new BufferedReader(new FileReader(archivo1));
			System.out.println("nombre de personas que han firmado: \n");
			while((strLineas = a.readLine()) != null) {
				System.out.println(strLineas);
				listNombres.add(strLineas);
			}
				a.close();

				System.out.println("Añade mas nombres:");
				listNombres.add(sc.nextLine());
						  
			    b = new BufferedWriter(new FileWriter(archivo1));
		            for(String palabra : listNombres) {
	           		if(!buscarPalabraEnArchivo(palabra, archivo1))
		            b.write(palabra);
	           		b.newLine();
		            }
		            b.close();
				
				d = new BufferedReader(new FileReader(archivo1));

				System.out.println("nombre de personas que han firmado actualizado: \n");
				while((strLineas2 = d.readLine()) != null) {
					System.out.println(strLineas2);
				}
				d.close();
				
				
		} catch (FileNotFoundException e) {
			System.out.println("El fichero firmas.txt no se encuentra " + e.getMessage());
		}
	
	}  
	public static boolean buscarPalabraEnArchivo(String palabra, String archivo) throws IOException {
	        BufferedReader reader = new BufferedReader(new FileReader(archivo));
	        String linea;
	        while ((linea = reader.readLine()) != null) {
	            if (linea.equals(palabra)) {
	                reader.close();
	                return true;
	            }
	        }
	        reader.close();
	        return false;
	    }

}
