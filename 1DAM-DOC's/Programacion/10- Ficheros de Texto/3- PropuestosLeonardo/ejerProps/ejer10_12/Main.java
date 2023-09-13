package ficherosDeTexto.ejerProps.ejer10_12;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedWriter a = null;
		BufferedReader b = null;
		FileWriter c;
		String archivo = "C:/CURSO/Programación/ficherosDeTexto/src/ficherosDeTexto/ejerProps/ejer10_12/datos.txt";
		
		try {
			b = new BufferedReader(new FileReader(archivo));
			} catch (IOException e) {
			System.out.println("El sistema no puede encontrar el archivo especificado");
		}
			try {
			if(b!=null) {
			a = new BufferedWriter(new FileWriter(archivo));
			System.out.println("dame tu nombre: ");
			a.newLine();
			a.write("Nombre: " + sc.nextLine());
			System.out.println("dame tu edad: ");
			a.write("\nEdad: " + sc.nextLine());
				}
			}catch(IOException e) {
				System.out.println("El sistema no puede encontrar el archivo especificado 2");
			}
			
			try {	
				if(b==null) {
			
					c = new FileWriter("C:/CURSO/Programación/ficherosDeTexto/src/ficherosDeTexto/ejerProps/ejer10_12/datosNew.txt");
					c.write("nombre predeterminado \nEdad predeterminada");
					c.close();	
					}	
				}catch(IOException e) {
					System.out.println("El sistema no puede encontrar el archivo especificado 3");
					e.printStackTrace();
			}
			finally {
			if(a != null) {
				try {
					a.close();
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}	
		
	


