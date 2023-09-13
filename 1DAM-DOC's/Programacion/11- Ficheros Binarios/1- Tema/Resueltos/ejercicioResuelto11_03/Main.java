package tema11.ejerciciosResueltos.ejercicioResuelto11_03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ObjectOutputStream out = null;
		double[] rlnArrNumeros;
		int intCantidad=0;
		
		do {
			System.out.print("Indica el número de valores a insertar en el archivo: ");
			try {
				intCantidad=new Scanner(System.in).nextInt();
			} catch (Exception e) {}
		}while(intCantidad<1);
		
		rlnArrNumeros = new double[intCantidad];
		for(int intCont=0; intCont<intCantidad;) {
			System.out.print("Dame el " + (intCont+1) + "º número de tipo double para insertar en el archivo: ");
			try {
				rlnArrNumeros[intCont]=new Scanner(System.in).nextDouble();
				intCont++;
			} catch (Exception e) {}
		}
		
		try {
			out = new ObjectOutputStream(new FileOutputStream("src/tema11/ejerciciosResueltos/ejercicioResuelto11_03/numeros.dat"));
		} catch (IOException e) {System.out.println("No se puede escribir en el archivo");}
		
		if(out!=null) {
				try {
					out.writeObject(rlnArrNumeros);
				} catch (IOException e) {}
			
			try {
				out.close();
			} catch (IOException e) {}
		}

	}

}
