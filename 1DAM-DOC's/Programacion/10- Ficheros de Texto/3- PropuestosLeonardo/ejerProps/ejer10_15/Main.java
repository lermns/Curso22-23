package ficherosDeTexto.ejerProps.ejer10_15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Integer> numeros = new  ArrayList<Integer>();
		BufferedReader a;
		String strLinea;
		int max, min;
		try {
			a = new BufferedReader(new FileReader("C:/CURSO/Programación/ficherosDeTexto/src/ficherosDeTexto/ejerProps/ejer10_15/numeros.txt"));
			while((strLinea = a.readLine()) != null) {
				numeros.add(Integer.parseInt(strLinea));
			}
			max=numeros.get(0);
			min=numeros.get(0);
			
			for(int i = 0; i < numeros.size(); i++) {
				if(numeros.get(i) > max) {
					max = numeros.get(i);
				}
			}
			for(int u = 0; u < numeros.size(); u++) {
				if(numeros.get(u)<min) {
					min = numeros.get(u);
				}
			}
			
			System.out.println("El numero maximo es: " + max + "\nEl numero minimo es: " + min);
			
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no se encontro " + e.getMessage());
		}
	}

}
