package tema11.ejerciciosPropuestos.ejercicioPropuesto11_17;

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
		String strLinea = null;
		Scanner scnLeer = new Scanner(System.in);
		

		System.out.println("Escribe lo que quieras guardar y deja una línea en blanco para terminar ");
		try(ObjectOutputStream fOut = new ObjectOutputStream(new FileOutputStream("src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_17/texto.dat"))){
			strLinea = scnLeer.nextLine();
			while(!strLinea.equals("")){
				fOut.writeObject(strLinea);
				strLinea = scnLeer.nextLine();
			};
			scnLeer.close();
		} catch (IOException e) {System.out.println("Error de escritura");}
		
		System.out.println("***Texto Escrito***");
		try(ObjectInputStream fInput = new ObjectInputStream(new FileInputStream("src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_17/texto.dat"))){
			
			try {
				while(true) {
					strLinea= (String) fInput.readObject();
					System.out.println(strLinea);
				}
			}catch (EOFException eof){System.out.println("***Fin Texto***");
			} catch (ClassNotFoundException e) {}
		} catch (IOException e) {System.out.println("Error de lectura");}
	}

}
