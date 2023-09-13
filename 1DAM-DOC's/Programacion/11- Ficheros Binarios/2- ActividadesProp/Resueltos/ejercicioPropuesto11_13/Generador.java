package tema11.ejerciciosPropuestos.ejercicioPropuesto11_13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Generador {

	public static void main(String[] args) {
		double[] rlnArray = {3.5, 5.6, 11.2};
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_13/archivo.dat"))){
			out.writeObject(rlnArray);
		} catch (IOException e) {}
	}

}
