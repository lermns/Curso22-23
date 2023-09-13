package tema10.ejerciciosResueltos.ejercicioResuelto08;

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
		String strFichero;
		String strLinea;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		System.out.print("Fichero origen: ");
		strFichero = new Scanner(System.in).nextLine();
		try {//vamos a abrir el fichero origen como lectura y el destino como escritura
			br = new BufferedReader(new FileReader("src/tema10/ejerciciosResueltos/ejercicioResuelto08/" + strFichero));
			if(br!=null)
				bw = new BufferedWriter(new FileWriter("src/tema10/ejerciciosResueltos/ejercicioResuelto08/copia_de_" + strFichero));
		} catch (IOException e) {
			System.out.println("Error al abrir el fichero con el buffer");
		}
		
		if(bw != null) {//si este está abierto el de lectura también
			try {
				strLinea = br.readLine();
				while(strLinea!=null) {
					bw.write(strLinea);
					bw.newLine();
					strLinea = br.readLine();
				}
			} catch (IOException e) {
				System.out.println("Fallo al copiar el archivo");
			}
		}
		
		if(br != null) {
			try {
				br.close();
			} catch (IOException e) {}
		}
		if(bw != null) {
			try {
				bw.close();
			} catch (IOException e) {}
		}
	}

}
