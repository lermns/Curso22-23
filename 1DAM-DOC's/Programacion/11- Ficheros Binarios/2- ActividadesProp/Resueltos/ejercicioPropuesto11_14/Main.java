package tema11.ejerciciosPropuestos.ejercicioPropuesto11_14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		System.out.print("Dame la frase a escribir: ");
		String strFrase = new Scanner(System.in).nextLine();
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_13/archivo.dat"))){
			out.writeObject(strFrase);
		} catch (IOException e) {}
		
		try(ObjectInputStream fInput = new ObjectInputStream(new FileInputStream("src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_13/archivo.dat"))){
			strFrase= (String) fInput.readObject();
			System.out.println("Frase escrita: " + strFrase);
		} catch (IOException | ClassNotFoundException e) {System.out.println("Error de lectura");}
	}

}
