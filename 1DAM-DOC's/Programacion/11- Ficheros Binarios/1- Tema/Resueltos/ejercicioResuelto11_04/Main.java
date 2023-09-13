package tema11.ejerciciosResueltos.ejercicioResuelto11_04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		ObjectInputStream leerFich = null;
		int[] intArrNumeros= new int[10];
		
		try {
			leerFich = new ObjectInputStream(new FileInputStream("src/tema11/ejerciciosResueltos/ejercicioResuelto11_04/enteros.dat"));
		} catch (IOException e) {System.out.println("No se puede encontrar en el archivo");}
		
		if(leerFich!=null) {
			for(int intCont=0; intCont<10; intCont++)
				try {
					intArrNumeros[intCont] = leerFich.readInt();
				} catch (IOException e) {System.out.println("No se puede leer del archivo");}
			
			try {
				leerFich.close();
			} catch (IOException e) {}
		}
		System.out.println(Arrays.toString(intArrNumeros));
	}

}
