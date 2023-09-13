package tema11.ejerciciosResueltos.ejercicioResuelto11_05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		ObjectInputStream leerBin = null;
		int[] intArrNumeros = null;
		
		try {
			leerBin = new ObjectInputStream(new FileInputStream("src/tema11/ejerciciosResueltos/ejercicioResuelto11_05/datos.dat"));
		} catch (IOException e) {System.out.println("No se puede abrir el archivo");}
		
		if(leerBin!=null) {
			try {	
				intArrNumeros = (int[]) leerBin.readObject();
			} catch (ClassNotFoundException e) {
				System.out.println("No se puede localizar la clase");
			} catch (IOException e) {
				System.out.println("Error de lectura");
			}
			
			try {
				leerBin.close();
			} catch (IOException e) {}
		}
		System.out.println(Arrays.toString(intArrNumeros));
	}

}
