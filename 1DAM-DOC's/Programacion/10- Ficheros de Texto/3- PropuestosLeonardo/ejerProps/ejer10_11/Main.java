package ficherosDeTexto.ejerProps.ejer10_11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
	String strLineas, archivo="C:/CURSO/Programación/ficherosDeTexto/src/ficherosDeTexto/ejerProps/ejer10_11/prueba.txt";
	BufferedReader a = null;
	
		
	System.out.println("Dame el nombre del archivo que quieres mostrar: ");
	String strFichero = sc.nextLine();
		
	try {
		a = new BufferedReader(new FileReader("C:/CURSO/Programación/ficherosDeTexto/src/ficherosDeTexto/ejerProps/ejer10_11/"+strFichero+".txt"));
		
	} catch (FileNotFoundException e) {
		System.out.println("El sistema no puede encontrar el archivo especificado 1");			
	}
	
	if(a!=null) {
		while ((strLineas = a.readLine ()) != null) {    
			System.out.println(strLineas);
		}
	}
	if(a==null) {
		try {
			a = new BufferedReader(new FileReader(archivo));
		
			while ((strLineas = a.readLine ()) != null) {    
				System.out.println(strLineas);
				}
			} catch (FileNotFoundException e1) {
				System.out.println("El sistema no puede encontrar el archivo especificado 2");
			}				
		}
		
	}

}
