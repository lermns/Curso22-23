package tema11.ejerciciosResueltos.ejercicioResuelto11_02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(new FileOutputStream("src/tema11/ejerciciosResueltos/ejercicioResuelto11_02/cancionPirata.dat"));
		} catch (IOException e) {System.out.println("No se puede escribir en el archivo");}
		
		if(out!=null) {
				try {
					out.writeObject("Con diez cañones por banda,\r\n"
							+ "viento en popa a toda vela,\r\n"
							+ "no corta el mar, sino vuela\r\n"
							+ "un velero bergartín.\r\n");
				} catch (IOException e) {}
			
			try {
				out.close();
			} catch (IOException e) {}
		}

	}

}
