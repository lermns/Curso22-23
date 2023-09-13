package ficherosDeTexto.ejerProps.ejer10_13;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		List<Integer> numeros = new ArrayList<Integer>();
		BufferedReader a, b, d;
		BufferedWriter c;
		String strLinea, strLinea2, archivo = "C:/CURSO/Programación/ficherosDeTexto/src/ficherosDeTexto/ejerProps/ejer10_13/orden.txt";
		try {		
			a = new BufferedReader(new FileReader("C:/CURSO/Programación/ficherosDeTexto/src/ficherosDeTexto/ejerProps/ejer10_13/sendo1.txt"));
			b = new BufferedReader(new FileReader("C:/CURSO/Programación/ficherosDeTexto/src/ficherosDeTexto/ejerProps/ejer10_13/sendo2.txt"));
				
				System.out.println("\nLista de numeros I: \n");
				while((strLinea = a.readLine()) != null) {
					numeros.add(Integer.parseInt(strLinea));
					System.out.println(strLinea);

				}
				System.out.println("\nLista de numeros II: \n");	
				while((strLinea2 = b.readLine())!= null) {
					numeros.add(Integer.parseInt(strLinea2));
					System.out.println(strLinea2);
				}
						
				Collections.sort(numeros);
			
			c = new BufferedWriter(new FileWriter(archivo));

				for(Integer i=0; i< numeros.size(); i++) {
					c.write(i.toString());
					c.newLine();
				}	
				c.close();
				
			System.out.println("\nNumeros ordenados: \n");
			d = new BufferedReader(new FileReader(archivo));
				while((strLinea2 = d.readLine()) != null) {
					System.out.println(strLinea2);
				}
			
		} catch (FileNotFoundException x) {
			System.out.println("Error al leer el archivo: " + x.getMessage());
			x.printStackTrace();
		}					
		 catch (NumberFormatException e) {
			System.out.println("Error al convertir la línea en números " + e.getMessage());
			e.printStackTrace();
		}
	}

}
