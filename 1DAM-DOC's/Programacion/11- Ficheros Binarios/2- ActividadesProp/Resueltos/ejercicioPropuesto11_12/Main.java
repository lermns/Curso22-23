package tema11.ejerciciosPropuestos.ejercicioPropuesto11_12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Double rlnValor = null;
	
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_11/archivo.dat"))){
			System.out.println("Introduce un valor real");
			do {
				try {
					rlnValor = new Scanner(System.in).nextDouble();
				}catch(InputMismatchException e) {System.out.println("Valor incorrecto, he pedido un valor real");}
			}while(rlnValor==null);
			out.writeDouble(rlnValor);
		} catch (IOException e) {}
	}

}
