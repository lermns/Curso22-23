package tema10.ejemplos.ejemplo5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		String strLinea;

		try {
			br = new BufferedReader(new FileReader("src/tema10/ejemplos/ejemplo5/a.txt"));
		} catch (FileNotFoundException e) {
				System.out.println("El fichero a.txt no existe");
		}
		
		if(br!=null) {
			try {
				bw = new BufferedWriter(new FileWriter("src/tema10/ejemplos/ejemplo5/b.txt"));
			} catch (IOException e) {
					System.out.println("Error en la apertura del fichero de escritura");
			}
			
			if(bw!=null) {
				try {
					strLinea = br.readLine();
					while(strLinea!=null) {
						if(strLinea.charAt(0)!='b') {
							bw.write(strLinea);
							bw.newLine();
						}
						strLinea = br.readLine();
					}
					br.close();
					bw.close();
				} catch (IOException e) {
					System.out.println("Error fatal en la escritura del fichero");
				}
			}
		}
		
		try {
			br = new BufferedReader(new FileReader("src/tema10/ejemplos/ejemplo5/b.txt"));
		} catch (FileNotFoundException e) {
				System.out.println("El fichero a.txt no existe");
		}
		
		if(br!=null) {
			try {
				bw = new BufferedWriter(new FileWriter("src/tema10/ejemplos/ejemplo5/a.txt"));
			} catch (IOException e) {
					System.out.println("Error en la apertura del fichero de escritura");
			}
			
			if(bw!=null) {
				try {
					strLinea = br.readLine();
					while(strLinea!=null) {
						bw.write(strLinea);
						bw.newLine();
						strLinea = br.readLine();
					}
					br.close();
					bw.close();
				} catch (IOException e) {
					System.out.println("Error fatal en la escritura del fichero");
				}
			}
		}
	}

}
