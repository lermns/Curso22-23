package tema11.ejerciciosResueltos.ejercicioResuelto11_08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		ObjectInputStream leerBin = null;
		ObjectOutputStream out = null;
		Socio[] arrSocios = {new Socio(5,"Pepe",LocalDate.of(2000, 12, 22)),
				 new Socio(7,"María",LocalDate.of(2000, 10, 20)),
				 new Socio(3,"María",LocalDate.of(2000, 10, 20)),
				 new Socio(9,"María",LocalDate.of(2005, 3, 7)),
				 new Socio(1,"María",LocalDate.of(2001, 2, 15)),
				 new Socio(2,"Juan",LocalDate.of(2004, 8, 17))};
		
		try {
			out = new ObjectOutputStream(new FileOutputStream("src/tema11/ejerciciosResueltos/ejercicioResuelto11_08/socios.dat"));
		} catch (IOException e) {System.out.println("Fallo en la escritura");}
		
		if(out!=null) {
			try {
					out.writeObject(arrSocios);
			} catch (IOException e) {System.out.println("No se puede escribir en el archivo");e.printStackTrace();}
			
			try {
				out.close();
			} catch (IOException e) {}
		}
		
		arrSocios=null;
		//lee el array
		try {
			leerBin = new ObjectInputStream(new FileInputStream("src/tema11/ejerciciosResueltos/ejercicioResuelto11_08/socios.dat"));
		} catch (IOException e) {System.out.println("No se puede abrir el archivo");}
		
		if(leerBin!=null) {
			try {	
				arrSocios = (Socio[]) leerBin.readObject();
			} catch (ClassNotFoundException e) {
				System.out.println("No se puede localizar la clase");
			} catch (IOException e) {
				System.out.println("Error de lectura");
			}
			
			try {
				leerBin.close();
			} catch (IOException e) {}
		}
		System.out.println(Arrays.toString(arrSocios));
	}

}
