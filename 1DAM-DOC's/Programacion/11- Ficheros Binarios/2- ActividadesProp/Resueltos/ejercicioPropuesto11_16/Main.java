package tema11.ejerciciosPropuestos.ejercicioPropuesto11_16;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		String[] strArrNombres = new String[0];
		String strNombre;
		Scanner scnLeer = new Scanner(System.in);
		
		try(ObjectInputStream fInput = new ObjectInputStream(new FileInputStream("src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_16/nombres.dat"))){
			try {
				strArrNombres = (String[]) fInput.readObject();
			}catch (ClassNotFoundException eof){System.out.println("No se ha podido leer la lista");}
		} catch (IOException e) {}
		
		System.out.println("Array cargado " + Arrays.toString(strArrNombres));
		System.out.print("Escribe un nombre o \"fin\" para terminar: ");
		strNombre = scnLeer.nextLine();
		while(!strNombre.toLowerCase().equals("fin")) {
			strArrNombres = insertar(strNombre, strArrNombres);
			System.out.print("Escribe un nombre o \"fin\" para terminar: ");
			strNombre = scnLeer.nextLine();
		}
		System.out.print("Array guardado " + Arrays.toString(strArrNombres));
		
		try(ObjectOutputStream fOut = new ObjectOutputStream(new FileOutputStream("src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_16/nombres.dat"))){
				fOut.writeObject(strArrNombres);
			} catch (IOException e) {System.out.println("Error de escritura");}
	}

	private static String[] insertar(String strNombre, String[] strArrNombres) {
		int intIndiceInsercion=Arrays.binarySearch(strArrNombres, strNombre);
		if(intIndiceInsercion<0)
			intIndiceInsercion=-intIndiceInsercion-1;
		strArrNombres =Arrays.copyOf(strArrNombres, strArrNombres.length+1);
		System.arraycopy(strArrNombres, intIndiceInsercion, strArrNombres, intIndiceInsercion+1, strArrNombres.length-(intIndiceInsercion+1));
		strArrNombres [intIndiceInsercion]=strNombre;
		
		return strArrNombres;
	}

}
