package tema11.ejerciciosResueltos.ejercicioResuelto11_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		ObjectOutputStream out = null;
		int[] intArrNumeros= {1,3,5,7,9,11,13,15,17,19};
		
		try {
			out = new ObjectOutputStream(new FileOutputStream("src/tema11/ejerciciosResueltos/ejercicioResuelto11_01/enteros.dat"));
		} catch (IOException e) {System.out.println("No se puede escribir en el archivo");}
		
		if(out!=null) {
			for(int intValor:intArrNumeros)
				try {
					out.writeInt(intValor);
				} catch (IOException e) {System.out.println("No se puede escribir " + intValor + " en el archivo");}
			
			try {
				out.close();
			} catch (IOException e) {}
		}

	}

}
