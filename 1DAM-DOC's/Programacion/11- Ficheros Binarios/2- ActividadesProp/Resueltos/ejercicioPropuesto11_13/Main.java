package tema11.ejerciciosPropuestos.ejercicioPropuesto11_13;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		double[] rlnArray;
				
		try(ObjectInputStream fInput = new ObjectInputStream(new FileInputStream("src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_13/archivo.dat"))){
			rlnArray= (double[]) fInput.readObject();
			System.out.println(Arrays.toString(rlnArray));
		} catch (IOException | ClassNotFoundException e) {System.out.println("Error de lectura");}
	}

}
