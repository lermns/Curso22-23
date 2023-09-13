package tema11.ejerciciosPropuestos.ejercicioPropuesto11_11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Main {

	public static void main(String[] args) {
		Double rlnValor = null;
	
		try(ObjectInputStream fInput = new ObjectInputStream(new FileInputStream("src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_12/archivo.dat"))){
			rlnValor=fInput.readDouble();
			System.out.println(rlnValor);
		} catch (IOException e) {}
	}

}
