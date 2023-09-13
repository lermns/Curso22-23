package tema10.ejerciciosPropuestos.ejercicioPropuesto10_13;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		int intNumero;
		Scanner scnLeer = null;
		int[] intArrNumeros = new int[0];
		BufferedWriter bw = null;
		
		//fichero uno.txt
		try {
			scnLeer = new Scanner(new BufferedReader(new FileReader("src/tema10/ejerciciosPropuestos/ejercicioPropuesto10_13/uno.txt")));
			
		} catch (IOException e) {
			System.out.println("No existe el fichero uno.txt");
		}
		
		if(scnLeer != null) {
			do {int intCont=0;
				try {
					intNumero = scnLeer.nextInt();
					intArrNumeros = Arrays.copyOf(intArrNumeros, intArrNumeros.length+1);
					intArrNumeros[intArrNumeros.length-1] = intNumero+intCont;
				} catch (Exception e) {	}
			}while(scnLeer.hasNext());

			scnLeer.close();
		}
		
		//fichero dos.txt
		try {
			scnLeer = new Scanner(new BufferedReader(new FileReader("src/tema10/ejerciciosPropuestos/ejercicioPropuesto10_13/dos.txt")));

		} catch (IOException e) {
			System.out.println("No existe el fichero dos.txt");
		}

		if(scnLeer != null) {
			do {int intCont=0;
				try {
					intNumero = scnLeer.nextInt();
					intArrNumeros = Arrays.copyOf(intArrNumeros, intArrNumeros.length+1);
					intArrNumeros[intArrNumeros.length-1] = intNumero+intCont;
				} catch (Exception e) {	}
			}while(scnLeer.hasNext());

			scnLeer.close();
		}

		System.out.println(Arrays.toString(intArrNumeros));
		
		//escritura
		try {
			bw = new BufferedWriter(new FileWriter("src/tema10/ejerciciosPropuestos/ejercicioPropuesto10_13/tres.txt"));
		} catch (IOException e) {}
		
		if(bw != null) {
			for(int intValor:intArrNumeros)
			try {
				bw.write(Integer.toString(intValor));
				bw.newLine();
			} catch (IOException e) {}
			
			try {
				bw.close();
			} catch (IOException e) {}
		}
	}

}
