package tema10.ejerciciosPropuestos.ejercicioPropuesto10_11;


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		BufferedWriter bw = null;
		String strLinea;
		Scanner scnLeer = new Scanner(System.in);
		
		try {
			bw = new BufferedWriter(new FileWriter("src/tema10/ejerciciosPropuestos/ejercicioPropuesto10_12/datos.txt", true));
		} catch (IOException e) {}
		
		if(bw != null) {
			System.out.print("Dame tu nombre: ");
			strLinea = scnLeer.nextLine();
			System.out.print("Dame tu edad: ");
			strLinea += ":" + scnLeer.nextLine();
			try {
				bw.write(strLinea);
				bw.newLine();
				bw.close();
			} catch (IOException e) {}
		}
	}

}
