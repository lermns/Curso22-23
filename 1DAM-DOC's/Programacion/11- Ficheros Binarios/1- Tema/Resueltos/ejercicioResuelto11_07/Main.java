package tema11.ejerciciosResueltos.ejercicioResuelto11_07;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ObjectOutputStream out = null;
		ObjectInputStream leerBin = null;
		Scanner scnLeer = new Scanner(System.in);
		boolean blnContinuar = true;
		int intValor;
		
		//Escribe los números en el fichero
		try {
			out = new ObjectOutputStream(new FileOutputStream("src/tema11/ejerciciosResueltos/ejercicioResuelto11_07/numeros.dat"));
		} catch (IOException e) {System.out.println("No se puede escribir en el archivo");}
		
		if(out!=null) {
				try {
					System.out.println("Siguiente entero a escribir o -1");
					intValor=scnLeer.nextInt();
					while(intValor!=-1) {
						out.writeInt(intValor);
						System.out.println("Siguiente entero a escribir o -1");
						intValor=scnLeer.nextInt();
					}
				} catch (InputMismatchException me) {System.out.println("No has escrito un número entero");
				} catch (IOException e) {System.out.println("No se puede leer del archivo");}
			
			try {
				out.close();
			} catch (IOException e) {}
		}
		
		//lee los números del fichero y los escribe en la copia
		try {
			leerBin = new ObjectInputStream(new FileInputStream("src/tema11/ejerciciosResueltos/ejercicioResuelto11_07/numeros.dat"));
			out = new ObjectOutputStream(new FileOutputStream("src/tema11/ejerciciosResueltos/ejercicioResuelto11_07/numerosCopia.dat"));
			while(true) {
				intValor = leerBin.readInt();
				System.out.println(intValor);
				out.writeInt(intValor);
			}
		} catch (EOFException eof) {System.out.println("No se puede leer más del archivo, se llegó al final");
		} catch (IOException e) {System.out.println("Error de escritura");
		}finally {try {
			out.close();
			leerBin.close();
		} catch (IOException e) {} 
		}
	
	}

}
