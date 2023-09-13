package tema11.ejerciciosPropuestos.ejercicioPropuesto11_18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Main {

	public static void main(String[] args)  {
		int intMenu = 0;
		Scanner scnLeer = new Scanner(System.in);
		
		do {
			intMenu = menu(scnLeer);
			
			switch(intMenu) {
				case 1->mostrar();
				case 2->insertar(scnLeer);
			}
		}while(intMenu!=0);
		
		scnLeer.close();
	}

	private static void insertar(Scanner scnLeer) {
		String strNombreNuevo;
		
		System.out.print("Dime el nombre a insertar en el libro de firmas: ");
		strNombreNuevo = scnLeer.nextLine();
		if(bucarFirma(strNombreNuevo))
			System.out.println("La firma ya existía");
		else 
			insertar(strNombreNuevo);
	}

	private static void insertar(String strNombreNuevo) {
		try (ObjectOutputStream fOut = new ObjectOutputStream(new FileOutputStream("src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_18/firmas.dat", true))){
			fOut.writeObject(strNombreNuevo);
		} catch (IOException e) {	
				System.out.println("Fallo de escritura en el fichero firmas.dat");
		}
	}

	private static boolean bucarFirma(String strNombreNuevo) {
		boolean blnDevolver = false;
		String strLinea = null;
		
		try (ObjectInputStream fInput = new ObjectInputStream(new FileInputStream("src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_18/firmas.dat"))){

			do {
					strLinea = (String) fInput.readObject();
			}while(!strLinea.toLowerCase().equals(strNombreNuevo.toLowerCase()));
			if(strLinea!=null && strLinea.toLowerCase().equals(strLinea.toLowerCase()))
				blnDevolver = true;			
		} catch (IOException | ClassNotFoundException e) {} 
		
		return blnDevolver;
	}

	private static void mostrar() {
		String strLinea = null;
		
		try (ObjectInputStream fInput = new ObjectInputStream(new FileInputStream("src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_18/firmas.dat"))){
				while(true) {
					strLinea = (String) fInput.readObject();
					System.out.print(strLinea + ", ");
				} 
		}catch (EOFException eof) {	System.out.println("prueba");
		} catch (FileNotFoundException fnf) {	
			System.out.println("Imposible mostrar, no existe el fichero firmas.dat");
		} catch (ClassNotFoundException cnfE) {cnfE.printStackTrace();
		} catch (IOException e) {}
	}

	private static int menu(Scanner scnLeer) {
		int intDevolver = -1;
		
		do {
			System.out.println("\nElige una opción \n" +
					   		   "0.- Salir \n" +
					   		   "1.- Mostrar firmas \n" +
					   		   "2.- Insertar nueva firma");
			try {
				intDevolver = Integer.parseInt(scnLeer.nextLine());
			} catch (Exception e) {}
		}while(intDevolver<0 || intDevolver>2);
		return intDevolver;
	}

}
