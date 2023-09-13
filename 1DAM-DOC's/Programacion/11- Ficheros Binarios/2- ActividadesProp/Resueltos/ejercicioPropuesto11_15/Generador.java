package tema11.ejerciciosPropuestos.ejercicioPropuesto11_15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Generador {

	public static void main(String[] args) {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_15/numeros.dat"))){
			for(int intCont=0; intCont<10; intCont++)
				out.writeInt((int) (Math.random()*50));
		} catch (IOException e) {}
	}

}
